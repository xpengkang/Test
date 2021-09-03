package testStr;
import java.util.*;
public class Main2 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        String b = String.valueOf(a);

        StringBuilder sb = new StringBuilder(3);
        sb.append(b);
        sb.reverse();

        System.out.println(sb);
    }
}
