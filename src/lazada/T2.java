package lazada;

import java.util.Arrays;
import java.util.Scanner;

public class T2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int M = sc.nextInt();
        for (int i = 0; i < M; i++) {
            int a = sc.nextInt();
            int b = sc.nextInt();
            System.out.println(countPrime(a, b));
        }

    }
    private static int countPrime(int a, int b){
        boolean[] prime = new boolean[b];
        Arrays.fill(prime, true);
        for (int i = 2; i < b; i++) {
            if(prime[i]){
                for (int j = 2*i; j < prime.length; j += i) {
                    prime[j] = false;
                }
            }
        }
        int res = 0;
        for (int i = a; i < b; i++) {
            if(prime[i]){
                res++;
            }
        }
        return res;
    }
}
