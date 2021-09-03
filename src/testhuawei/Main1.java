package testhuawei;


import java.util.*;
public class Main1 {
    private static int minDistance = Integer.MAX_VALUE;
    //判断是否能到
    private static boolean flag = false;

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int M = scanner.nextInt();
        int start = scanner.nextInt();
        int N = scanner.nextInt();
        //记录两个园区之间的距离
        int[][] distances = new int[M][M];
        for (int i = 0; i < N; i++) {
            int x = scanner.nextInt();
            int y = scanner.nextInt();
            int distance = scanner.nextInt();
            //x到y，y到x的距离都是distance
            distances[x][y] = distance;
            distances[y][x] = distance;
        }
        //记录每个园区的访问情况
        boolean[] visited = new boolean[M];
        //开始的园区已访问
        visited[start] = true;
        dfs(start, 0, 1, M, visited, distances);
        if (flag) {
            System.out.println(minDistance);
        } else {
            System.out.println(-1);
        }
    }

    private static void dfs(int now, int distance, int visited, int m, boolean[] isVisited, int[][] distances) {
        if (visited == m) {
            flag = true;
            minDistance = Math.min(minDistance, distance);
            return;
        }
        for (int i = 0; i < m; i++) {
            if (distances[now][i] != 0 && !isVisited[i]) {
                visited++;
                isVisited[i] = true;
                distance += distances[now][i];
                dfs(i, distance, visited, m, isVisited, distances);
                isVisited[i] = false;
                distance -= distances[now][i];
                visited--;
            }
        }
    }
}
