package ms;

public class ExcelNum {

    public int titleToNumber(String s) {
        int ret = 0;
        for(int i = 0; i < s.length(); i++)
            ret = ret * 26 + s.charAt(i)-'A'+1;
        return ret;
    }


    public static void main(String[] args) {
        ExcelNum e = new ExcelNum();
        int res = e.titleToNumber("ABBBB");
        System.out.println(res);
    }

}
