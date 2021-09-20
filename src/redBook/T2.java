package redBook;

import java.security.spec.RSAOtherPrimeInfo;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.Scanner;

public class T2 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] nums = new int[n];
        for (int i = 0; i < n; i++) {
            nums[i] = sc.nextInt();

        }

        int[] nums2 = Arrays.copyOf(nums,nums.length);
        Arrays.sort(nums2);

        int[] nums3 = new int[n];

        for (int i = 0; i < n; i++) {
            nums3[i] = nums2[n -1 -i];

        }



        HashMap<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < n; i++) {
            map.put(nums2[i], i);

        }

        HashMap<Integer, Integer> map2 = new HashMap<>();
        for (int i = 0; i < n; i++) {
            map2.put(nums3[i], i);

        }

        if(nums.length == 0 || nums.length == 1){
            System.out.println(0);
        }
        boolean[] flag = new boolean[nums.length];


        int res = 0;
        for (int i = 0; i < nums.length; i++) {
            if(!flag[i]){
                int j = i;
                while(!flag[j]){
                    flag[j] = true;
                    j = map.get(nums[j]);
                }
                res ++;
            }

        }
        boolean[] flag2 = new boolean[nums.length];
        int res2 = 0;
        for (int i = 0; i < nums.length; i++) {
            if(!flag2[i]){
                int j = i;
                while(!flag2[j]){
                    flag2[j] = true;
                    j = map2.get(nums[j]);
                }
                res2 ++;
            }

        }

        int min = Math.min(n - res, n - res2);
        System.out.println(min);




    }
//    private static int solve(int[] nums){
//
//    }
}
//小红书 2022校招 【22校招】技术综合笔试（卷3）在线考试
//        编程题|30.0分2/3
//        漂亮数组
//        时间限制： 3000MS
//        内存限制： 589824KB
//        题目描述：
//        有一个包含 n 个不相同整数的数组 arr = [a[0], a[1], ..., a[n-1]]。 你可以随意交换数组中的任意两个元素的位置。一个数组如果满足 在0<i<n 区间 |arr[i] - arr[i-1]| （绝对值）的和最小，则称这个数组为漂亮数组。
//
//        给到一个数组 arr , 计算并返回需要交换的最小次数，使得数组 arr 变为一个漂亮数组。
//
//        样例
//
//        arr = [7, 15, 12, 3]
//
//        arr 对应的一种漂亮数组为[3, 7, 12, 15]. 为了变换成这样的数组，需要做如下交换操作
//
//        Swap      Result             [7, 15, 12, 3]     3 7   [3, 15, 12, 7]     7 15  [3, 7, 12, 15]
//
//        共执行2次元素交换操作使得输入数组变换成漂亮数组，这是所需要的最少交换次数。
//
//
//
//        输入描述
//        第一行输入是一个整数 n, 标识输入数组的元素个数. 第二行输入包含n个用空格分割的整数arr[i]
//
//        输出描述
//        最小需要进行交换的次数
//
//
//        样例输入
//        4
//        2 5 3 1
//        样例输出
//        2
//
//        规则