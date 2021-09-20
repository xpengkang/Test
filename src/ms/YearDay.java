package ms;
import java.util.Scanner;
public class YearDay {
}
/*
从键盘输入年月日，判断这一天是一年中的第几天？
小知识点：
     判断年份为闰年的条件：
         可以被4整除，但不能被100整除 或 可以被400整除。
*/


class YearDay1{
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        System.out.println("请输入年：");
        int year = scan.nextInt();
        System.out.println("请输入月：");
        int month = scan.nextInt();
        System.out.println("请输入日：");
        int day = scan.nextInt();

        int sumDays = countDays(year, month, day);
        System.out.println(year + "年" + month + "月" + day + "日是当年的第" + sumDays + "天");
    }

    private static int countDays(int year, int month, int day){

        int sumDays = 0;
//        当变量的值与 case 语句的值相等时，那么 case 语句之后的语句开始执行，直到 break 语句出现才会跳出 switch 语句。
//
//        当遇到 break 语句时，switch 语句终止。程序跳转到 switch 语句后面的语句执行。case 语句不必须要包含 break 语句。如果没有 break 语句出现，程序会继续执行下一条 case 语句，直到出现 break 语句。
        switch(month){
            case 12:
                sumDays += 30;//11月的总天数30
            case 11:
                sumDays += 31;//10月的总天数31
            case 10:
                sumDays += 30;//9月的总天数30
            case 9:
                sumDays += 31;//8月的总天数31
            case 8:
                sumDays += 31;//7月的总天数31
            case 7:
                sumDays += 30;//6月的总天数30
            case 6:
                sumDays += 31;//5月的总天数31
            case 5:
                sumDays += 30;//4月的总天数30
            case 4:
                sumDays += 31;//3月的总天数31
            case 3:
                if ((year % 4 ==0 && year % 100 !=0) || year % 400 ==0){
                    sumDays += 29;//闰年2月的总天数29
                }else{
                    sumDays += 28;//非闰年2月的总天数28
                }
            case 2:
                sumDays += 31;//1月的总天数31
            case 1:
                sumDays += day;//当月的天数
        }
        return sumDays;

    }

}
