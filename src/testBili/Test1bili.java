package testBili;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Test1bili {
//    输入描述
//            每行一个数组
//
//    每个数组逗号分隔
//    样例输入
//        1,2,3,4,5,9
//        2,4,5,8,910
//        3,5,7,9,11
//        1,3,5,7,9
//    样例输出
//          5
    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);
        int count = 1;
        HashMap<String,Integer> map = new HashMap<>();
        String flag = null;
        while(!(flag=sc.nextLine()).equals("")){
            String[] s= sc.nextLine().split(",");
            count++;//记录行数
//            System.out.println(count);
            for(int i = 0; i < s.length; i++){
                if(map.containsKey(s[i])){
                    map.put(s[i],map.get(s[i]) +1);
                }else{
                    map.put(s[i], i+1);//从1开始计数
                }
//                System.out.println(s[i]);
//                System.out.println(map.keySet());

            }
        }

        System.out.println(solve(map, count));


    }

    private static int solve(HashMap<String,Integer> map, int count){
        //遍历map ,找出和count 相同的
//        System.out.println(count);
        String res = " ";
        for(Map.Entry<String,Integer> entry: map.entrySet()){
            if(entry.getValue().equals(count)){
                res = entry.getKey();
                break;

            }
        }
        return Integer.parseInt(res);
    }
}
