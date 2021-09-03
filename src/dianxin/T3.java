// 思路:动态规划，背包问题
package dianxin;


import java.util.Scanner;

public class T3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println(34);
        int bodyEnergy = sc.nextInt();


            String[] line2 = sc.nextLine().split("\\ ");
            String s = sc.nextLine();
            String[] line3 = sc.nextLine().split("\\ ");


        int[] value = new int[line2.length-1];//除去第一个数
        int[] loseEnergy = new int[line3.length-1];
        for(int i = 0; i< line3.length; i++ ){
            value[i] =  Integer.parseInt(line2[i+1]);//价值
            loseEnergy[i] = Integer.parseInt(line3[i+1]);//重量
        }

        int[][] dp = new int[loseEnergy.length+1][bodyEnergy+1];

        dp[0][0] = 0;

        for(int i = 0 ; i <= bodyEnergy; i++){//体力大小==背包
            for(int j =1; j < loseEnergy.length ; j++){//消耗体力==物品
                if(j< loseEnergy[i]){
                    dp[i][j] = dp[i-1][j];
                }else{
                    dp[i][j] = Math.max(dp[i-1][j], dp[i-1][j-loseEnergy[i]+value[i]]);
                }
            }
        }

        int res = dp[loseEnergy.length][bodyEnergy];
        System.out.println(res);
    }





}