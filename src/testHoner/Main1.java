package testHoner;


import sun.text.normalizer.UCharacter;

import java.util.Scanner;

public class Main1 {
    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
//        String s = sc.nextLine();
//        StringBuilder sb = new StringBuilder();
//
//        for(int i = 0; i< s.length(); i++){
//            if(s.charAt(i) == ' '){
//                continue;
//            }
//            sb.append(s.charAt(i));
//
//        }
//
//        int len = sb.length();
//        int[] nums = new int[len];
//        for (int i = 0; i < len; i++) {
//            nums[i] = (sb.charAt(i)-'0');//转为int[]
//           System.out.print(nums[i]);
//            System.out.print(" ");
//        }
//
//
//        int res = solve(nums);
//        System.out.println(res);

        System.out.println("["+2+";"+3+"]");

    }

    /**
     * 贪心思想
     * @param nums
     * @return
     */
    private static int solve(int[] nums){
        int end = 0;
        int maxPosition = 0;
        int step = 0;

        for (int i = 0; i < nums.length -1; i++) {
            maxPosition = Math.max(maxPosition, nums[i] + 1);
            if(i == end){
                end = maxPosition;
                step++;
            }

        }
        return step;

    }
}