package meituan;
//美团 2022届秋招 技术综合-数据开发方向在线考试
//        编程题|20.0分2/4
//        交换
//        时间限制： 3000MS
//        内存限制： 589824KB
//        题目描述：
//        小美所在的城市有很多地铁站，地铁站之间由线路直接连接，组成了一个地铁网络。一天她突发奇想，把若干个地铁站的编号依次进行交换。请问在所有的交换结束之后，每个编号指向的地铁站直接相连接的地铁站一共有多少个？
//
//        两个地铁站之间可能有多条线路直接连接。但是不存在直接指向自己的线路。
//
//
//
//        输入描述
//        第一行三个数字n,m,q(1≤n,m,q≤105)，分别代表地铁站数量，直接连接的地铁路数量，交换数量。
//
//        接下来m行每行两个数字u,v(1≤u,v≤n)代表直接连接的两个地铁站编号。
//
//        接下来q行每行两个数字x,y(1≤x,y≤n)代表你要交换的两个点编号。
//
//        数字间均有空格隔开
//
//        输出描述
//        一行n个空格隔开的数字，每个数字代表与对应编号直接相连的地铁站一共多少个。
//
//
//        样例输入
//        5 5 3
//        1 2
//        2 3
//        3 4
//        4 5
//        1 4
//        2 5
//        1 2
//        3 4
//        样例输出
//        1 2 3 2 2
//
//        规则
//        请尽量在全场考试结束10分钟前调试程序，否则由于密集排队提交，可能查询不到编译结果
//        点击“调试”亦可保存代码
//        编程题可以使用本地编译器，此页面不记录跳出次数
public class T2 {
}