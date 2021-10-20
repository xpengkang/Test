package codetop;

public class T560 {


    public static void main(String[] args) {
        Solution s = new Solution();
        int[] nums = {1,2,3};
        int res = s.subarraySum(nums, 3);
        System.out.println(res);
    }
}
class Solution {
    public int subarraySum(int[] nums, int k) {
        int l = 0, r = -1;
        int sum = 0;
        int res = 0;
        while(l < nums.length){
            if(r + 1 < nums.length && sum < k){
                // r++;
                sum += nums[++r];
            }else{
                sum -= nums[l++];
                // l++;
            }
//            else{
//                res++;//sum = k
//            }
             if(sum == k){
                 res++;
             }
        }
        return res;

    }
}