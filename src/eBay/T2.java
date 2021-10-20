package eBay;


import java.util.Scanner;

public class T2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int m = sc.nextInt();
        int n = sc.nextInt();
        int k = sc.nextInt();
        int[] mm = new int[m];
        int[] nn = new int[n];
        for (int i = 0; i < m; i++) {
            mm[i] = sc.nextInt();

        }
        for (int i = 0; i < n; i++) {
            nn[i] = sc.nextInt();

        }
        System.out.println(solve(mm, nn, k));

    }

    private static int solve(int[] m, int[] n, int k){
        int count = 0;
        for (int i = 0; i < m.length; i++) {
            for (int j = 0; j < n.length; j++) {
                if(m[i] + n[j] == k){
                    count++;
                }
            }
        }

        return count;
    }

}