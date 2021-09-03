package testStr;

import java.util.*;



public class MainHJ2 {


    //用hashmap 去count。
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
//        String s1 = sc.nextLine();
//        s1.toLowerCase();//都转为小写
//        String s2 = sc.next();
//        s2.toLowerCase();//都转为小写
//        char c1 = s2.charAt(0);

        String s1 = sc.nextLine();
        String lowS1 = s1.toLowerCase();//都小写吧
        String s2 = sc.next();
        String lowS2= s2.toLowerCase();
        char c1 = lowS2.charAt(0);



        StringBuilder sb = new StringBuilder(s1);//存放字符
        Map<Character, Integer> map = new HashMap<>();

        for (int i = 0; i < sb.length(); i++) {
            char c = sb.charAt(i);
            if (map.containsKey(c)) {
                map.put(c, map.get(c) + 1);//存在key ,把value +1
            }else{
                map.put(c, 1);//第一次加入，value 为1
            }

        }
        System.out.println(Arrays.toString(map.entrySet().toArray()));

        int res = 0;//结果个数
        if (map.containsKey(c1)) {
            res = map.get(c1);
        }


        System.out.println(res);


    }
}