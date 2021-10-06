package microsoft;

public class T1 {
    public static void main(String[] args) {
        System.out.println(solution(7));

    }

    public static int solution(int N) {
        // write your code in Java SE 8
        int res = 0;
        for (int i = 1; i < 999999999; i++) {
            int sum = 0;
            int n = i;
            while(n > 0){
                sum += n%10;
                n = n/10;
            }
            if(sum == N){
                if(res == 0){
                    res = i;
                }else{
                    return res;//找到答案
                }
            }

        }
        return -1;
    }




}
