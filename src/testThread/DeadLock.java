package testThread;

public class DeadLock {


    public static void main(String[] args) {
        Sell s = new DeadLock().new Sell();
        Thread thread1 = new Thread(s, "线程1");
        Thread thread2 = new Thread(s, "线程2");
        Thread thread3 = new Thread(s, "线程3");
        Thread thread4 = new Thread(s, "线程4");
        thread1.start();
        thread2.start();
        thread3.start();
        thread4.start();

    }
    static int xigua = 2;

    class Sell implements Runnable{

        @Override
        public void run() {

            while(xigua > 0){
                synchronized (this){
                    if(xigua <= 0){
                        return;
                    }
                    System.out.println(Thread.currentThread().getName() +"xigau number:" +xigua);
                    try {
                        Thread.sleep(4);
                    }catch (Exception e){
                        e.printStackTrace();
                    }

                    xigua--;
                }
            }
            if(xigua <= 0){
                System.out.println(Thread.currentThread().getName() + "xigau sell off:" + xigua);
            }
        }
    }



}
