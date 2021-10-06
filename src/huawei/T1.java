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





class MainT1{
    private static int res = Integer.MIN_VALUE;
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        //有多少个节点
        int N = sc.nextInt();
        //为了存放回车符
        sc.nextLine();
        //邻接矩阵
        int[][] arr = new int[N][N];
        //各个节点的消耗时间数组，索引从0开始
        int[] a = new int[N];
        //输入每个节点信息
        for(int i=0;i<N;i++){
            //输入如：A 10 1 2 3
            String[] s = sc.nextLine().split(" ");
            //存放索引为i的节点的价值
            a[i]=Integer.parseInt(s[1]);
            //存放当前节点的子节点，放在邻接矩阵中对应位置为1
            if(s.length>2){
                for(int j=2;j<s.length;j++){
                    arr[i][Integer.parseInt(s[j])]=1;
                }
            }
        }
        //邻接矩阵的第0行开始遍历a[0][i]为1的节点，深度遍历以i为起点多路径
        for(int i=1;i<N;i++){
            if(arr[0][i] == 1)
                dfs(arr,a,a[i],N,i);
        }
        System.out.print(a[0]+ res);
    }

    /**
     *
     * @param arr 邻接矩阵
     * @param a  每个节点消耗的时间
     * @param val 当前路径走到第i个节点时消耗的时间
     * @param N  节点个数
     * @param i  当前节点的索引
     * @return
     */
    public static int dfs(int[][] arr, int[] a, int val, int N, int i){
        for(int j=i+1;j<N;j++){
            if(arr[i][j] == 1){
                dfs(arr,a,val+a[j],N,j);
            }
        }
        //以索引i为起点的路径走完，res存放当前最大的消耗时间；
        res = Math.max(res,val);
        return 0;
    }
}
