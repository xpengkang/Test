package xiaomi;


import java.util.Scanner;

//小米集团 2022校招 软件开发方向在线考试
//        编程题|20.0分1/2
//        求最长公共子序列的长度
//        时间限制： 3000MS
//        内存限制： 589824KB
//        题目描述：
//        给定两个字符串str1和str2，输出两个字符串的最长公共子序列的长度。
//        如果最长公共子序列为空，则返回"0"。目前给出的数据，仅仅会存在一个最长的公共子序列
//
//
//
//        输入描述
//        输入: "1A2C3D4B56","B1D23A456A"
//
//        输出描述
//        输出: 6
public class T1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s1 = sc.nextLine();
        String s2 = sc.nextLine();


        int res = longestComStr(s1, s2);
        System.out.println(res);


    }


    private static int longestComStr(String s1, String s2){
        int m = s1.length();
        int n = s2.length();

        int[][] dp = new int[m+1][n+1];

        dp[0][0] = 0;
        for (int i = 1; i < m+1; i++) {
            for (int j = 1; j < n+1; j++) {
                if(s1.charAt(i-1) == s2.charAt(j-1)){
                    dp[i][j] = dp[i-1][j-1] +1;
                }else{
                    dp[i][j] = Math.max(dp[i-1][j], dp[i][j-1]);
                }

            }

        }

        return dp[m][n];
    }
}
