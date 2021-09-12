package xiaomi;

import java.util.Arrays;
import java.util.Scanner;

//小米集团 2022校招 软件开发方向在线考试
//        编程题|20.0分2/2
//        红白蓝彩条排序
//        时间限制： 3000MS
//        内存限制： 589824KB
//        题目描述：
//        给你一个仅有红，白，蓝三种颜色组成的10个条块序列，现需要你将这些条块按照红，白，蓝的顺序排好，
//        可用1代表红色，2代表白色，3代表蓝色，要求时间复杂度为O(n)。例如，给定彩色条块序列为：
//
//        ｛蓝、白、红、白、蓝、红、白、白、红、蓝｝
//
//        则要求排列结果为：
//
//        ｛红、红、红、白、白、白、白、蓝、蓝、蓝｝
//
//
//
//        输入描述
//        ｛蓝、白、红、白、蓝、红、白、白、红、蓝｝
//
//        输出描述
//        ｛红、红、红、白、白、白、白、蓝、蓝、蓝｝
//
//
//        样例输入
//        3 2 1 2 3 1 2 2 1 3
//        样例输出
//        1 1 1 2 2 2 2 3 3 3
//
//        规则
//        请尽量在全场考试结束10分钟前调试程序，否则由于密集排队提交，可能查询不到编译结果
//        点击“调试”亦可保存代码
//        编程题可以使用本地编译器，此页面不记录跳出次数
public class T2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s1 = sc.nextLine();
        String[] ss = s1.split("\\ ");
        Arrays.sort(ss);
        for (String a:ss
             ) {
            System.out.print(a);
            System.out.print(" ");

        }






    }
}
