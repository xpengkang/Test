package lazada;

import java.util.Scanner;

/**
 * 压缩字符串
 */
public class T1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while(sc.hasNext()){
            String s = sc.nextLine();
            System.out.println(solve(s));;

        }

    }

    private static String solve(String s){
//        abcdabcde
//                xxxrryyyyyyzzg

        char[] ch = s.toCharArray();
        StringBuffer sb = new StringBuffer();

        int count = 1;
        for (int i = 1; i < ch.length; i++) {
            while(ch[i] == ch[i-1] && i + 1 < ch.length){
                count++;
                i++;//如果最后两位还是相等，这里会越界。
            }
            sb.append(count);
            sb.append(ch[i-1]);

//            if(ch[ch.length - 1] == ch[ch.length - 2]){
//                sb.replace(ch.length -2, ch.length -1, "");
//            }

            count = 1;

        }

        if(ch[ch.length - 1] != ch[ch.length - 2]){
            sb.append(ch[ch.length - 1]);
        }


        //把1 去掉；
        StringBuffer res = new StringBuffer();
        for (int i = 0; i < sb.length(); i++) {
            if(sb.charAt(i) == '1'){
                continue;
            }

            res.append(sb.charAt(i));
        }
        return res.toString();
    }
}
