package testHoner;



import java.util.Scanner;

public class h1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        StringBuilder sb = new StringBuilder();

        for(int i = 0; i< s.length(); i++){
            if(s.charAt(i) == ' '){
                continue;
            }
            sb.append(s.charAt(i));

        }

        int len = sb.length();
        int[] nums = new int[len];
        for (int i = 0; i < len; i++) {
            nums[i] = (sb.charAt(i)-'0');//转为int[]
//            System.out.println(nums[i]);
        }


        int res = solve(nums);
        System.out.println(res);

    }

    /**
     *
     * @param nums
     * @return
     */
    private static int solve(int[] nums){

        int end = 100;
        int len = nums.length;

        if(len == 1){
            return 1;
        }

        for (int i = 1; i < len/2; i++) {//步长限制，小于len/2;
            int path = 0;
            for(int j = i ;j< len; j+=nums[j]){
                path++;
                if(j == len-1){
                    end = end < path? end:path;
                    break;
                }
            }
        }
        if(end == 100){
            return -1;
        }

        return end;


    }
}