package maze;

public class Maze {


    public static void main(String[] args) {
        /**
         * 生成地图
         */
        int[][] map = new int[8][7];
        for (int i = 0; i < 8; i++) {
            map[i][0] = 1;
            map[i][6] = 1;
        }
        for (int i = 0; i < 7; i++) {
            map[0][i] = 1;
            map[7][i] = 1;
        }

        map[4][4] = 1;
        map[5][3] = 1;
        map[6][4] = 1;
        map[4][3] = 1;
        map[4][5] = 1;
        for (int i = 0; i < 8; i++) {
            for (int j = 0; j < 7; j++) {
                System.out.print(map[i][j] + " ");
            }
            System.out.println();
        }


        //生成路线；
        findWay(map,1,1);//从1，1 开始找位置

        //打印新地图
        System.out.println("============ new map ========");
        for (int i = 0; i < 8; i++) {
            for (int j = 0; j < 7; j++) {
                System.out.print(map[i][j] + " ");
            }
            System.out.println();
        }


    }

    public static boolean findWay(int[][] map, int i , int j){
        if(map[6][5] == 2){
            return  true;//终点找到了
        }else{

            //否则的话
            if(map[i][j] == 0){//这条路没有走过
                //按照策略方向走,下，右，上，左
                map[i][j]=2;//先标记走过了
                if(findWay(map,i+1,j))return true;
                else if (findWay(map,i,j+1))return true;
                else if (findWay(map,i-1,j))return true;
                else if (findWay(map,i,j-1))return true;
                else {
                    map[i][j] = 3;//是这个位置 map[i][j]=2;//先标记走过了的改一个标记走不通 3
                    return false;
                }
            }else{//map[i][j] ==  1 2 3// 1 不能走，墙， 2 走过了，3 走不通
                return false;
            }
        }
    }
}
