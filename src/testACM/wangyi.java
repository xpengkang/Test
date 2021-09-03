package testACM;
import java.util.*;
public class wangyi {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        String[] str = in.nextLine().split(" ");
        //将String类型数组转成Integer类型数组。
        int[] nums=new int[str.length];
        for (int i = 0; i < nums.length; i++) {
            nums[i]=Integer.valueOf(str[i]);
            System.out.println(nums[i]);
        }





        int M = in.nextInt();
        System.out.println(solve(nums,M));


    }
    //思路1  用回溯，求解组合数
    //思路2： 先排序，用双指针,这里用思路2 解题
    public static int solve(int[] nums, int M){

        Arrays.sort(nums);
        int i = 0; int j = nums.length -1;
        while(i<j){
            if(nums[i] + nums[j] <= M){//这种情况都小于
                return count(j-i+1) ;//数学里的求组合数的公式。C m n
            }
            else{
                j--;// j
            }
        }

        return 0;//没有输出0；



    }
    //求组合数
    public static int count(int n){
        int x = 0;
        int y = 2;
        for(int i = n; i>=n-1;i-- ){
            x *= i ;
        }
        return x/y;
    }

}