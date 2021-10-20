//package shopee;
//import java.util.*;
//public class T3 {
//    public static void main(String[] args) {
//        Solution s = new Solution();
//        String res = s.FindAndReplace("abcabcAB", "AB", "x");
//        System.out.println(res);
//
//    }
//
//}
//
//
//
//
//
//class Solution {
//    /**
//     * Note: 类名、方法名、参数名已经指定，请勿修改
//     *
//     *
//     *
//     * @param src string字符串 输入字符串
//     * @param match string字符串 查找字符串
//     * @param replace string字符串 替换字符串
//     * @return string字符串
//     */
//    public String FindAndReplace(String src, String match, String replace) {
//        // write code here
//        int len = match.length();
//        int i = 0;
//        int j = i + len - 1;
//        StringBuilder sb = new StringBuilder();
//
//        for(i = 0; j < src.length() - 1; i++){
//            if(src.substring(i, j) == match){
//                sb.append(replace);
//            }
//            sb.append(src.charAt(i));
//        }
//
//        return sb.toString();
//        src.replace()
//    }
//}
//
//
//
//
//class TreeNode {
//    int val = 0;
//    TreeNode left = null;
//    TreeNode right = null;
//    public TreeNode(int val) {
//
//        this.val = val;
//
//    }
//}
//
//Map<TreeNode, Integer> map = new HashMap<>();
//void(){
//    if(root == null)  return 0;
//    if(map.containsKey(root)) return map.get(root);
//
//    int doit = root.val + (root.left)
//}
//
//
