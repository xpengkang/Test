package testshopee;

import java.util.LinkedHashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;

public class T1 {
//    List<LinkedList<Character>> res = new LinkedList<>();
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
//        long n = sc.nextLong();
        String s = sc.nextLine();
        char[] c = s.toCharArray();

        List<LinkedList<Character>> res = new LinkedList<>();
        LinkedList<Character> track = new LinkedList<>();
        backtrack(c, track, res);

//        res


        System.out.println(c);



    }

    /*
    思路，字符串全排列。
    排序
    找更小的一位；
     */

    private static void backtrack(char[] c, LinkedList<Character> track, List<LinkedList<Character>> res){
        if(track.size() == c.length){
            res.add(new LinkedList<>(track));
            return;
        }

        for (int i = 0; i < c.length; i++) {
            if(track.contains(c[i])){
                continue;
            }
            track.add(c[i]);
            backtrack(c,track, res);
            track.removeLast();

        }
    }
}
