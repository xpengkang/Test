package codetop;

import java.util.Arrays;

public class N91 {

    public static void main(String[] args) {
        Solution91 s = new Solution91();
        //test
        int[] arr = new int[]{-2,1,-3,4,-1,2,1,-5,4};

        int[] dp = s .dpLIS(arr);

        int[] res = s.generateLIS(arr, dp);

        for (int a:res
             ) {
            System.out.println(a);
        }
    }
}

class Solution91{
    public int[] generateLIS(int[] arr, int[] dp){


        int len = 0;
        int index = 0;
        //找到最大的那个
        for(int i =0;i<dp.length;i++){
            if(dp[i]>len){
                len = dp[i];
                index = i;
            }
        }
        int[] lis = new int[len];
        lis[--len] = arr[index];
        for(int i = index;i>=0;i--){
            //核心判断条件
            if(arr[i]<arr[index] && dp[i] == dp[index]-1){
                lis[--len] = arr[i];
                index = i;
            }
        }
        return lis;
    }
    //get LIS length
    //get dp[]
    public int[] dpLIS(int[] nums) {
        int[] dp = new int[nums.length];
        Arrays.fill(dp,1);
        dp[0] = 1;//最小就是1
        int res = 0;
        for(int i = 0; i < dp.length; i++){
            for(int j = 0;j < i; j++){//内循环就是比nums[i] 小的数
                if(nums[i] > nums[j]){
                    dp[i] = Math.max(dp[i], dp[j] + 1);//每次和1 比较，1是最小值。
                }
            }
            res = Math.max(dp[i], res);//max LIS len
        }
        return dp;
    }

}



