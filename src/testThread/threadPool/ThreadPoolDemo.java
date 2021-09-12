package testThread.threadPool;

import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class ThreadPoolDemo {
    public static void main(String[] args) {
        //创建线程池  Executors.newFixedThreadPool
        ExecutorService service = Executors.newFixedThreadPool(10);

        //执行线程，execute 方法
        service.execute(new testTP());
        service.execute(new testTP());
        service.execute(new testTP());
        service.execute(new testTP());
        service.execute(new testTP());
        service.execute(new testTP());


        //关闭线程池
        service.shutdown();
    }
}


class testTP implements Runnable{
    @Override
    public void run() {
        for (int i = 0; i < 10; i++) {
            System.out.println(Thread.currentThread().getName() + " 获取 " + i);
        }
    }
}