package eBay;

import com.sun.xml.internal.ws.api.model.wsdl.WSDLPortType;

import java.util.Scanner;

public class T1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while(sc.hasNext()){
            String s = sc.nextLine();
            int res = lenOfPalindromic(s);
            if(res >= s.length() - 1){
                System.out.println("YES");
            }else{
                System.out.println("NO");
            }
        }
    }

    public static int lenOfPalindromic(String s){
        int n = s.length();
        int[][] dp = new int[n][n];
        for (int i = 0; i < n; i++) {
            dp[i][i] = 1;// 对角线元素 ， 都是回文
            System.out.println("dp[i][i]   " + dp[i][i]);
        }
        for (int len = 1; len < n; len++) { //dp[i][j-1] j-1 > 0 , len >= 1
            for( int i = 0; i + len < n; i ++){
                int j = i + len;
                if(s.charAt(i) == s.charAt(j)){
                    dp[i][j] = dp[i+1][j-1] + 2;
                }else{
                    dp[i][j] = Math.max(dp[i+1][j], dp[i][j-1]);
                }
            }
        }
        System.out.println(dp[0][n-1]);
        return dp[0][n-1];





    }
}
