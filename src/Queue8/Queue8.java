package Queue8;

public class Queue8 {

    int max = 8;
    int[] array = new int[max];
    static int count = 0;

    public static void main(String[] args) {
        Queue8 queue8 = new Queue8();
        queue8.check(0);
        System.out.printf("一共有%d种解法",count);
    }

    private void print(){
        count++;
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + " ");
        }
        System.out.println();
    }

    //判断是否冲突
    private boolean judge(int n){
        for (int i = 0; i < n; i++) {
//            array[i] == array[n] || Math.abs(n-i) == Math.abs(array[n] - array[i])
//            同一列，同一斜线， 和设计的数组有关
//
            if(array[i] == array[n] || Math.abs(n-i) == Math.abs(array[n] - array[i])){
                return false;
            }
            //不需要判断在同一行，因为n 就是行，每次不一样。
        }

        return true;
    }

    //放置
    private void check(int n){
        if(n == max){
            print();
            return;
        }
        for (int i = 0; i < max; i++) {
            //先放在该行的第一列开始
            array[n] = i;
            //判断是否冲突
            if(judge(n)){
                check(n + 1);//递归
            }
            //冲突会执行array[n] = i; i++
        }
    }



}
