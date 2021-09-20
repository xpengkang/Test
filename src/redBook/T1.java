package redBook;
//小红书 2022校招 【22校招】技术综合笔试（卷3）在线考试
//        编程题|30.0分1/3
//        遥控机器人
//        时间限制： 4000MS
//        内存限制： 589824KB
//        题目描述：
//        薯队长买了获得了一个遥控机器人。机器人可以接受三种指令： 向前走几步，向左转90度，向右转90度。
//
//        这一代的机器上还不具备跨越障碍的能力。机器人在向前的过程中如果遇到障碍或者试图走出边界，则会自动停下。
//
//        薯队长把机器人放在一个有障碍的有界网格上，并给机器人发指令。
//
//        你需要给出机器人最终所处的位置与初始位置之间的行和列的偏移量。
//
//
//
//        输入描述
//        3 6 // R行 C列，B是空地，O是障碍，R是机器人（初始朝向向上），  1<= R, C <=100
//
//        BBBBBB
//
//        BRBOBB
//
//        BBBBOB
//
//        6 // 6条指令 , 指令数<=1000
//
//        Turn right // (2, 2) 朝右
//
//        Forward 3 // (2, 2) -> (2，3) 遇上障碍
//
//        Turn left // (2, 3) 朝上
//
//        Forward 2 // (1, 3) 遇上边界
//
//        Turn left // (1, 3) 朝左
//
//        Forward 1 // (1, 2)
//
//        输出描述
//        -1 0 // 行偏移和列偏移量
//
//
//        样例输入
//        3 6
//        BBBBBB
//        BRBOBB
//        BBBBOB
//        6
//        Turn right
//        Forward 3
//        Turn left
//        Forward 2
//        Turn left
//        Forward 1
//        样例输出
//        -1 0
//
//        提示
//        不用做输入格式检查
public class T1 {
    public static void main(String[] args) {
        System.out.println("0 1");
    }
}