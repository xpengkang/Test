package huawei;


import java.util.Scanner;
//思路: 求树的最长路径和
public class T1 {
    public static int minTime;
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();//N个算子
        sc.nextLine();
        int[] path = new int[N];
        int[][] next = new int[N][100];
        for (int i = 0; i < N; i++) {
            String[] s1 = sc.nextLine().split(" ");
            path[i] = Integer.parseInt(s1[1]);
            for (int j = 2; j < s1.length; j++) {
                next[i][j -2] = Integer.parseInt(s1[j]);
            }
        }
        dfs(path, next, path[0], 0);
        System.out.println(minTime);


    }

    private static void dfs(int[] path, int[][] next, int x, int index){
        if(next[index][0] == 0){
            minTime = Math.max(minTime, x);
        }else{
            int i = 0;
            while(next[index][i] > 0){
                int nextIndex = next[index][i++];
                dfs(path, next, x+ path[nextIndex], nextIndex);
            }
        }


    }
}