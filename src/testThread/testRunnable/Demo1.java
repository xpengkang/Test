package testThread.testRunnable;

import testACM.T;

public class Demo1 implements Runnable{
    @Override
    public void run() {



        for (int i = 0; i <= 100; i++) {

            if(Thread.currentThread().getName().equals("rabbit") && i % 5 == 0){//兔子走5步休息一下
                try {
                    Thread.sleep(5);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }

            boolean winner = isWinner(i);
            //用winner , 退出循环。比赛结束
            if(winner){
                break;
            }
            System.out.println(Thread.currentThread().getName() + "test number" + i);

        }

    }
    private static String winner;
    private boolean isWinner(int steps){
        if(winner != null){
            return true;
        }else if(steps == 99) {
            winner = Thread.currentThread().getName();
            System.out.println("winner is " + Thread.currentThread().getName() );
            return true;
        }
        return false;
    }

    public static void main(String[] args) {
        Demo1 demo1 = new Demo1();
        new Thread(demo1, "rabbit").start();
        new Thread(demo1, "turtle").start();

    }



}
