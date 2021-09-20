package huaqiBank;

import java.util.Scanner;
import java.util.Stack;

public class T3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        System.out.println(solve(str));

    }
    private static String solve(String str){
        //用栈解决
        StringBuilder sb = new StringBuilder();
        int flag = 0;
        Stack<String> res = new Stack<>();
        Stack<Integer> symbol = new Stack<>();

        for (int i = 0; i < str.length(); i++) {
            char c = str.charAt(i);
            if(c == '*'){
                continue;
            }
            if(c == '['){
                symbol.push(flag);
                res.push(sb.toString());
                flag = 0;
                sb = new StringBuilder();
            }else if(c == ']'){
                StringBuilder temp = new StringBuilder();
                int flagTemp = symbol.pop();
                for (int j = 0; j < flagTemp; j++) {
                    sb = new StringBuilder(res.pop() + temp) ;
                }
            }else if( c >= '0' && c <= '9'){
                flag = flag * 10 + Integer.parseInt(c + "");
            }else{
                sb.append(c);
            }
        }
        return sb.toString();

    }
}
