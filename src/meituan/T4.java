package meituan;
//美团 2022届秋招 技术综合-数据开发方向在线考试
//        编程题|20.0分4/4
//        数周期
//        时间限制： 5000MS
//        内存限制： 655360KB
//        题目描述：
//        小美最近买了一个小火车，小火车的每一节车厢都可以用一个小写字母表示。小美想知道，对于火车的某个前缀，其第k短的周期的长度是几。
//
//        定义周期为：对于一个长度为n的字符串，如果有一个长度为k的周期，当且仅当其满足对于所有1≤i≤n-k，都有si=si+k成立。
//
//
//
//        输入描述
//        第一行一个字符串，字符串只由小写英文字母组成，长度最多为105。
//
//        第二行一个数字q(1≤q≤105)，代表询问的组数。
//
//        接下来q行，每行两个空格隔开的数字u(1≤u≤n),k(1≤k≤105)代表询问的前缀长度和周期次序k。
//
//        输出描述
//        对于每组询问输出一行一个整数代表长度为 u 的前缀的第 k 短的周期长度。如果k大于该前缀所有的周期数量，则输出一行一个整数 -1。
//
//
//        样例输入
//        abcabcabc
//        4
//        2 1
//        6 1
//        9 2
//        1 14514
//        样例输出
//        2
//        3
//        6
//        -1
//
//        提示
//        样例解释
//
//        对于第三次询问，长度为9的前缀即为字符串本身，其拥有长度为 3、6、9的周期，第二短的周期是6。
//
//        最后一次询问，长度为1的前缀仅存在一个长度为1的周期，所以应该输出-1。
//
//        规则
//        请尽量在全场考试结束10分钟前调试程序，否则由于密集排队提交，可能查询不到编译结果
//        点击“调试”亦可保存代码
//        编程题可以使用本地编译器，此页面不记录跳出次数
public class T4 {
}
