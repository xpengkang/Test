package n360;

import java.util.Scanner;

//Yeah数列
//        时间限制： 3000MS
//        内存限制： 1048576KB
//        题目描述：
//        若数列a1…an，对于任意1<i<n的位置满足：a[i+1]>a[i]或a[i-1]>a[i] ，那么称这个数列为yeah数列。（通俗的理解，yeah数列除两端外，对于任意一个位置，左右两边至少有一个比他大）。
//
//        比如4 1 8 或 1 2 3或 8 6 4 2就是yeah数列，而1 1 1和0 1 0就不是yeah数列
//
//        现在有一个数列b1…bn，每次操作你可以选择一个i，使得bi减1(操作过程中允许bi减为负数)，问最少经过多少次操作，可以使得bi变为一个yeah数列
public class T2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] water = new int[n];
        for (int i = 0; i < n; i++) {
            water[i] = sc.nextInt();
        }
        System.out.println();
    }
}
