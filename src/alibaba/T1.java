package alibaba;



import java.util.Scanner;

public class T1 {
    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
//
//
//
//            int n = sc.nextInt();
//            String a = sc.nextLine();
//            String b = sc.nextLine();
////            for(int i = 0 ;i < 2; i++){
////
////            }
        Scanner in = new Scanner(System.in);
        while (in.hasNextInt()) {// 注意，如果输入是多个测试用例，请通过while循环处理多个测试用例
            int a = in.nextInt();
            int b = in.nextInt();
            System.out.println(a + b);
        }


//            System.out.println(b);








    }
}