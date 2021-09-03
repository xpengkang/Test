package testStr;



import java.util.*;
public class HJ90 {



    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        while(sc.hasNext()){
//             String s = sc.nextLine();
            StringBuilder sb = new StringBuilder(sc.nextLine());
            boolean res = isVaild(sb.toString());
            if(res){
                System.out.println("YES");
            }else{
                System.out.println("NO");
            }

        }
    }

    //传入字符串，判断是不是有效ip
    public static boolean isVaild(String s){
        //用.分割一下字符串
        String[] ss = s.split(".");
        for(int i = 0; i< ss.length; i++){ //这里是数组了，不是是ss.length();
            System.out.println(ss[i]);
            if(Integer.parseInt(ss[i]) >255 ||Integer.parseInt(ss[i]) < 1){
                return false;
            }
        }
        return true;

    }

}