package test;

public class T405 {

    public static void main(String[] args) {
        Solution405 s = new Solution405();
        String hex = s.toHex(999);//f
        System.out.println(hex+  " is res");
    }
}

class Solution405 {
    public String toHex(int num) {
        if (num == 0) return "0";
        char[] chars = new char[]{'0','1','2','3','4','5','6','7','8','9','a', 'b', 'c', 'd', 'e', 'f'};
        StringBuffer buffer = new StringBuffer();
        int temp;
        while (num != 0) {
            temp = num & 15;
            System.out.println("temp =" + temp);
            buffer.insert(0, chars[temp]);
            System.out.println("num=" + num);
            num >>>= 4;
            System.out.println(num >>>= 4);
        }
        return buffer.toString();
    }
}
