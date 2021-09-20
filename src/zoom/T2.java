package zoom;

import java.util.Comparator;
import java.util.HashMap;
import java.util.Scanner;
import java.util.TreeMap;

public class T2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s1 = sc.nextLine();
        String[] s = s1.split(" ");

        int len = s.length;
        int[] nums = new int[len];
        for (int i = 0; i < len; i++) {
            nums[i] = Integer.parseInt(s[i]);
        }

        TreeMap<Integer, Integer> map = new TreeMap<>(Comparator.reverseOrder());
        for (int i = 0; i < len; i++) {
            map.put(nums[i], i);
        }

        //就差一步，代码没写完

//        System.out.println("("+7, 89)(1, 56)(2, 23)");
    }
}
