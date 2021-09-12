package testThread;

public class SequenceThread {
    public static void main(String[] args) {
        Thread t1 = new Thread(new Runnable() {
            @Override
            public void run() {
                System.out.println("this is t1 ==========");
            }
        });


        Thread t2 = new Thread(new Runnable() {
            @Override
            public void run() {

                try{
                    t1.join();
                    System.out.println("this is t2 ===============");
                }catch (InterruptedException e){
                    e.printStackTrace();
                }
            }
        });


        Thread t3 = new Thread(new Runnable() {
            @Override
            public void run() {
                try{
                    t2.join();
                }catch (InterruptedException e){
                    e.printStackTrace();
                }
                System.out.println("this is t3 ======");
            }
        });



        t3.start();
        t2.start();
        t1.start();
    }
}
