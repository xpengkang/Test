package test;

public class Test518 {
    public static void main(String[] args) {

//        int amount = 10;
//        int[] coins = {1,2,5};
        Test518 t = new Test518();
        t.change(10,new int[]{1,2,5});
    }

    public int change(int amount, int[] coins) {

        int[] dp = new int[amount+1];//数组大小为dp[amount],dp[5],开到空间6才行
        dp[0]=1;


        //遍历钱，物品
        for(int j=0 ; j < coins.length ;++j){
            //遍历背包
            for(int i = 0; i<=amount; ++i){
                dp[i] = dp[i]+dp[i-coins[j]];
            }
        }
        return dp[amount];


    }
}
