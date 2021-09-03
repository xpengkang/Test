package testStr;



import java.util.*;
public class HJ1{

    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        StringBuilder sb = new StringBuilder(s);

        sb.reverse();
        int i = 0;
        while(i < sb.length() && sb.charAt(i) != ' '){//一定要防止数组越界
            i++;
        }
        //少了一种情况，没有空格的。
        if(i == sb.length()){
            System.out.println(sb.length());
        }else{
            System.out.println(i);
        }

    }



}