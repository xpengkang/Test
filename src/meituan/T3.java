package meituan;

import java.util.Scanner;

//美团 2022届秋招 技术综合-数据开发方向在线考试
//        编程题|20.0分3/4
//        歌单
//        时间限制： 5000MS
//        内存限制： 655360KB
//        题目描述：
//        小美在听歌。歌单给小美推送了一个歌单序列，歌单中的歌会严格按顺序播放。
//
//        歌单中有很多歌曲，听每首歌曲会给小美带来ai点愉悦值。但是某些歌曲是一个系列的。如果小美在听这首歌曲之前没有按顺序听过这个系列的所有前面的歌曲，就会给小美带来-bi的愉悦值（即最后选择这首歌可获得的总愉悦值为ai-bi。）歌单并不会保证这首歌在系列中前面的歌曲都在歌单中。
//
//        因此，小美可以预先去除中间的一些歌曲，使得自己更加愉悦。由于去掉歌曲需要花费时间，所以每去掉一首歌曲都会让自己的愉悦值减小k。
//
//        由于歌单是智能的，所以其中不会包含重复的歌曲。
//
//        请问小美能获得的最大愉悦值是多少？
//
//
//
//        输入描述
//        第一行两个空格隔开的整数n,k(1≤n,k≤105)代表歌曲数量和删除歌曲减少的愉悦值。
//
//        接下来n行每行包括四个空格隔开的整数ai,bi,ci,di(1≤ai,bi,ci,di≤105)分别代表听这首歌获得的愉悦值，
//        没有按顺序听完这个系列之前的歌所需要扣除的愉悦值，
//        这首歌所在的系列，这首歌在系列中是第几首。
//
//        输出描述
//        输出一个数字代表小美能获得的最大愉悦值
//
//
//        样例输入
//        5 1
//        20 1000 1 2
//        1 1 1 1
//        5 3 1 3
//        20 1 2 2
//        22 2 2 3
//        样例输出
//        41
//
//        提示
//        样例解释
//
//        小美删去了第一首歌，愉悦值为 (-1+1+2+19+20)=41 ，其中第一个 -1为进行删除操作时损失的愉悦值
//
//        规则
//        请尽量在全场考试结束10分钟前调试程序，否则由于密集排队提交，可能查询不到编译结果
//        点击“调试”亦可保存代码
//        编程题可以使用本地编译器，此页面不记录跳出次数
public class T3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int k = sc.nextInt();
        int[][] mat = new int[n][4];
        //输入一个二维数组。
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < 4; j++) {
                mat[i][j]= sc.nextInt();
//                System.out.print(mat[i][j] + " ");

            }
        }


        System.out.println(solve(mat, k));


    }

    private static int solve(int[][] matrix,int k){
        //计算列 1 - 列 2；

        int[] temp = new int[matrix.length];
        for (int i = 0; i < matrix.length ;i++) {
            temp[i] = matrix[i][0] - matrix[i][1];
        }
        int countk = 0;
        int res = 0;
        for (int i = 0; i < temp.length; i++) {
            if(temp[i] < -1){
                countk++;
                continue;

            }
            res += temp[i];

        }
        res += countk*(-k);


        return res;


    }
}
