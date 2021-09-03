//package test;
//
//
//import java.util.Arrays;
//import java.util.Scanner;
//
//public class Main1{
//
//    public static void main(String[] args){
//
//
//        Scanner sc = new Scanner(System.in);
//        int n = sc.nextInt();
//        //输入n第一行包括一个数字N，表示本次用例包括多少个待校验的字符串。
////       后面跟随N行，每行为一个待校验的字符串。
//        // 数字后面的换行，要记得去掉这个干扰。
//        sc.nextLine();
//        //或者不加上面这句话，把下面输入改成next
//        String[] ss = new String[n];
//
//        for(int i = 0; i < n; i++){
//
//            ss[i] = sc.nextLine();
//        }
//
//        //遍历，处理 ，调用核心方法。也就是核心模式代码
//        for(int i = 0; i < n; i++){
//
//            String s = ck(ss[i]);//写成静态的方法，这样可以直接调用
//            System.out.println(s);//输出结果
//        }
//    }
//    public static String ck(String s){//写成静态的方法，这样可以直接调用
//
//        int l = s.length();
//        if(l < 2)
//            return s;
//        char[] cc = s.toCharArray();
//        //先检查3个的，再检查aabb的
//        for(int i = 2; i < l; i++){
//
//            if(cc[i - 1] == cc[i] && cc[i - 2] == cc[i])
//                cc[i - 2] = ' ';
//        }
//        int index = 0;
//        for(int i = 0; i < l; i++){
//
//            if(cc[i] != ' ')
//                cc[index++] = cc[i];
//        }
//        for(int i = 3; i < index; i++){
//
//            if(cc[i - 3] == cc[i - 2] && cc[i - 1] == cc[i]){
//
//                cc[i - 1] = ' ';
//                i = i + 2;
//            }
//        }
//        int id = 0;
//        for(int i = 0; i < index; i++){
//
//            if(cc[i] != ' ')
//                cc[id++] = cc[i];
//        }
//        cc = Arrays.copyOfRange(cc, 0, id);
//        return new String(cc);
//
//    }
//}
//
///**
// * 解法2
// */
//public class Main2{
//    public static void main(String[] args) {
//        Scanner input = new Scanner(System.in);
//        int n = input.nextInt();
//        for(int i = 0; i < n; i++){
//            String s = input.next();
//            String res = verify(new StringBuilder(s));
//            System.out.println(res);
//        }
//    }
//
//    public static String verify(StringBuilder s){
//        if(s.length() <= 2){
//            return s.toString();
//        }
//        int i = 0;
//        while(i < s.length()){
//            if(i + 2 >= s.length()){
//                break;
//            }
//            // 窗口前2个值不等时，无需处理
//            if(s.charAt(i) != s.charAt(i + 1)){
//                i++;
//                continue;
//            }
//            if(s.charAt(i + 1) == s.charAt(i + 2)){
//                s.deleteCharAt(i + 2);
//                // 删除第三个值后，进入下一次循环，重新判断窗口大小为3的情况是否满足
//                continue;
//            }
//            if(i + 3 >= s.length()){
//                break;
//            }
//            if(s.charAt(i + 2) == s.charAt(i + 3)){
//                s.deleteCharAt(i + 3);
//                continue;
//            }
//            i++;
//        }
//        return s.toString();
//    }
//}
//
///**
// * 解法3，
// * 把 acm 模式和核心代码模式，完美结合，最适合初学者了
// */
//public class Main3 {
//    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
//        int N = sc.nextInt();
//        String[] strings = new String[N];
//        for (int i = 0; i < N; i++) {
//            strings[i] = sc.next();
//        }
//        Solution1 solution = new Solution1();
//        for (String str : strings)
//            System.out.println(solution.solve(str));
//    }
//}
//class Solution1 {
//    public String solve(String s) {
//        if (s == null || s.length() <= 2) return s;
//        for (int i = 0; i < s.length() - 3; i++) {
//            if (s.charAt(i) == s.charAt(i + 1) && s.charAt(i + 2) == s.charAt(i + 3)) {//AABB
//                s = delete(s, i + 2);
//                i--;
//            }
//            else if(s.charAt(i) == s.charAt(i + 1) && s.charAt(i) == s.charAt(i + 2)){//AAA
//                s = delete(s,i);
//                i--;
//            }
//        }
//        int n = s.length();
//        if(s.charAt(n - 1) == s.charAt(n - 2) && s.charAt(n - 1) == s.charAt(n - 3))//可能结尾剩余3个AAA的情况
//            s = delete(s,n-1);
//        return s;
//    }
//    private String delete(String s, int i) {
//        return s.substring(0, i) + s.substring(i + 1);
//    }
//}