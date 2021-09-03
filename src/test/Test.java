package test;

import java.util.*;

public class Test {

        public static void main(String args[]) {
//            Scanner cin = new Scanner(System.in);
//            int a, b;
//            while(cin.hasNextInt())
//            {
//                a = cin.nextInt();
//                b = cin.nextInt();
////                System.out.println(a + b);
//            }
////            System.out.println(a);//放在外面不行的。
//            cin.close();
//            int[] nums = new int[256];
//
//            int n = nums.length;
//            System.out.println(n);
//            for (int i = 0; i < n; i++) {
//                System.out.println(i);
//            }
//            System.out.println("-------------------j");
//            for (int j= 0; j <= n-1; j++) {
//                System.out.println(j);
//            }
            Test.findAnagrams("sdfghjkjk","hgf");

        }

    public  static  List<Integer> findAnagrams(String s, String p) {
        List<Integer> list = new ArrayList<>();
        if (s == null || s.length() == 0 || p == null || p.length() == 0) return list;
        int[] hash = new int[256]; //character hash
        //record each character in p to hash
        for (char c : p.toCharArray()) {
            hash[c]++;
        }
        //two points, initialize count to p's length
        int left = 0, right = 0, count = p.length();
        while (right < s.length()) {
            //move right everytime, if the character exists in p's hash, decrease the count
            //current hash value >= 1 means the character is existing in p
            if (hash[s.charAt(right++)]-- >= 1) count--;

            //when the count is down to 0, means we found the right anagram
            //then add window's left to result list
            if (count == 0) list.add(left);

            //if we find the window's size equals to p, then we have to move left (narrow the window) to find the new match window
            //++ to reset the hash because we kicked out the left
            //only increase the count if the character is in p
            //the count >= 0 indicate it was original in the hash, cuz it won't go below 0
            if (right - left == p.length() && hash[s.charAt(left++)]++ >= 0) count++;
        }
        return list;
    }

}
