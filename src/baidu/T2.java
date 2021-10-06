package baidu;

import java.util.Scanner;

public class T2 {
    public static void main(String[] args) {
        //贪心
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int k = sc.nextInt() - 1; //数组从0开始
        int[] money = new int[n];
        for (int i = 0; i < n; i++) {
            money[i] = sc.nextInt();
        }

        System.out.println(maxMoney(money, k));
    }

    private static int maxMoney(int[] money, int k){
        int res = 0;

        if(k == 0 || k == money.length - 1){
            for (int i = 0; i < money.length ; i++) {
                res += money[i];

            }
        }




        return  res;

    }
}
