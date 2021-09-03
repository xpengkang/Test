package sort;

public class Solution3 {


    public static void main(String[] args) {
        Solution0818 s = new Solution0818();
        int res = s.lengthOfLongestSubstring("abcabcbb");
        System.out.println(res);

    }
}
class Solution0818 {
    public int lengthOfLongestSubstring(String s) {
        int res = 0;
        // Set<Character> set = new HashSet<>();//用set 去去重

        int[] flag = new int[256];

        int l = 0, r = 0;
        while(r < s.length()){
            char c = s.charAt(r);
            // while(set.contains(c)){//这里要用while
            //     set.remove(s.charAt(l));
            //     l++;
            // }
            if(flag[c] == 0){
                flag[c]++;
                r++;
            }else{
                //有重复的元素，缩小窗口。
                flag[s.charAt(l)]--;
                l++;
            }
            // set.add(c);

            res = Math.max(res, r-l);


        }
        return res;
    }
}