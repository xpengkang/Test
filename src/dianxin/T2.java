package dianxin;



import java.util.*;

public class T2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while (sc.hasNext()){//多行输入框架
            int next = sc.nextInt();//行数
            String ss = sc.nextLine();

//            String[] s = sc.nextLine().split(",");
            String[] s = ss.split(",");
            int[] nums = new int[s.length];

            for(int i = 0; i< nums.length; i++ ){
//                nums[i] =  Integer.parseInt(s[i]);//
                nums[i] =  Integer. valueOf(s[i]);

            }
            //逻辑操作

            //一定是while 里面输出结果：
            System.out.println(solve(nums));
        }
    }

    private static int[] solve(int[] a){
        int[] ans = new int[a.length];
        int temp = 0;
        for(int i = 0; i< a.length; i++ ){
            if(a[i]%2==0){
                ans[temp] = a[i];
                temp++;
            }

        }

        for(int i = 0; i< a.length; i++ ){
            if(a[i]%2==1){
                ans[temp] = a[i];
                temp++;
            }

        }

        return ans;
    }
}