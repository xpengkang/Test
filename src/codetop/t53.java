package codetop;

public class t53 {
    public static void main(String[] args) {
        Solution53 s = new Solution53();
        int[] res = s.maxSubArray(new int[]{-2,1,-3,4,-1,2,1,-5,4});
        for (int i = 0; i < res.length; i++) {
            System.out.println(res[i]);
        }
    }
}

class Solution53 {
    public int[] maxSubArray(int[] nums) {
        int sum = 0;
        int left = 0;
        int right = 0;
        for(int i = 0; i< nums.length; i++){//从1开始
//            sum += nums[i];
            if(sum > 0){
                sum += nums[i];
                right = i;
            }else{
                sum = nums[i];
                left = i;
            }
        }

        // return dp[nums.length -1];不是返回最后一个，是返回dp 数组最大的一个
        int[] res = new int[right - left + 1];
        for(int i = 0; i < right - left + 1; i++){
            res[i] = nums[left++];
        }
        return res;

    }
}
