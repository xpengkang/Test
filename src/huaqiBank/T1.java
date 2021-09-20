package huaqiBank;

import java.util.Scanner;
//求解字符串中大小字母的个数，暴力匹配。
public class T1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        while(sc.hasNext()){
            String s = sc.nextLine();
            System.out.println(findA(s));
        }

    }
    private static int findA(String str){
        int n = str.length();
        int res = 0;
        for (int i = 0; i < n; i++) {
            if(str.charAt(i) >= 'A' && str.charAt(i) <= 'Z'){
                res++;
            }
        }
        return res;
    }
}
