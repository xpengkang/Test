package baidu;

import java.util.Scanner;

public class T1 {
    public static void main(String[] args) {
//        求二维数组的和
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        long res = 0;
        for (int i = 0; i < n*n; i++) {
            res += sc.nextInt();

        }
        System.out.println(res);
    }
}
