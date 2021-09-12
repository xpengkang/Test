package huawei;

import java.util.Scanner;

public class T3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String[] s1 = sc.nextLine().split(" ");
        String[] s2 = sc.nextLine().split(" ");

//        System.out.println(s1[5]);
        int m = s1.length;
        int n = s2.length;
        int[][] ans = new int[2][1];




    }

    private static int[][] solve(int[] a, int[] b, int startA , int startB){
        int m = a.length;
        int n = b.length;
        int pivotA = startA;
        int pivotB = startB;

        int i = startA + 1;
        int j = startB + 1;
        int diff1 = 0, diff2 = 0;
        int[][] ans = new int[2][1];

        ans[0][0] = a[startA];
        ans[1][0] = b[startB];

        while(i < m && j < n){
            diff1 = a[i] - a[pivotA];
            diff2 = b[i] - b[pivotB];
            if(diff1 > diff2){
                j++;
            }else if(diff1 < diff2){
                i++;
            }else {
                ans[0][0] = a[i];
                ans[1][0] = b[j];
                pivotA = i;
                pivotB = j;
                i++;
                j++;

            }
        }
        return ans;

    }




}
