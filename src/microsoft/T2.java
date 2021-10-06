package microsoft;

import java.util.Arrays;

import static java.lang.Math.ceil;

public class T2 {
    public static void main(String[] args) {
        int[] a = new int[]{1,2,2,4};
        int[] b = new int[]{4,2,4,6};
        System.out.println(solution(a));
        System.out.println(solution(b));

    }
    public static int solution(int[] a) {
        if (a.length == 0) {
            return 0;//特判
        }

        int sum = 0;
        int n = a.length;

        for (int x : a) {
            sum += x;
        }
//        double mean = Math.ceil(sum *1.0 / n);
        int mean = (int)Math.ceil(sum *1.0 / n);
        Arrays.sort(a);
        int left = 0, right = n - 1;
        int ans = 0;

        while (left < right) {
            if (a[left] == a[right] || a[right] <= mean) {
                break;
            }
            while (left < right && a[right] > mean && a[left] < mean) {
                a[right]--;
                a[left]++;
                ans++;
                if (a[left] == mean) {
                    left++;
                }
                if (a[right] == mean) {
                    right--;
                }
            }
        }
        ans = ans + mean * n - sum;
        return ans;

    }
}

