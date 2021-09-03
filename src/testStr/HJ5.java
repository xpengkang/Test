package testStr;


import java.util.Scanner;

public class HJ5
{
    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);
        while(scanner.hasNext())
        {
            String str = scanner.nextLine();
             System.out.println(Integer.valueOf(str.substring(2),16).toString());

//            int num = Integer.parseInt(str, 16); // 把st当做base进制，转成10进制的int(parseInt有两个参数,第一个为要转的字符串,第二个为说明是什么进制).
//            System.out.println(String.valueOf(num));
        }
    }
}