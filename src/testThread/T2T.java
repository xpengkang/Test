package testThread;

import java.util.concurrent.Semaphore;
import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.ReentrantLock;

public class T2T {
    public static void main(String[] args) {

    }

}

class Test {
    private ReentrantLock lock = new ReentrantLock();
    private Condition conditionA = lock.newCondition();
    private Condition conditionB = lock.newCondition();
    private boolean flag = true;


    public static void main(String[] args) {
        String a = "1234";
        String b = "abcd";

        Test test = new Test();
        Thread t1 = new Thread(() -> {
            test.outA(a);
        });
        Thread t2 = new Thread(() -> {
            test.outB(b);
        });
        t1.start();
        t2.start();
    }

    private void outA(String a) {
        for (int i = 0; i < a.length(); i += 2) {
            lock.lock();
            try {
                if (!flag) {
                    conditionA.await();
                }
                System.out.print(a.charAt(i));
                if (i + 1 < a.length()) {
                    System.out.print(a.charAt(i+1));
                }
                flag = false;
                conditionB.signal();
            } catch (InterruptedException e) {
                e.printStackTrace();
            } finally {
                lock.unlock();
            }

        }
    }

    private void outB(String b) {
        for (int i = 0; i < b.length(); i += 2) {
            lock.lock();
            try {
                if (flag) {
                    conditionB.await();
                }
                System.out.print(b.charAt(i));
                if (i + 1 < b.length()) {
                    System.out.print(b.charAt(i+1));
                }
                flag = true;
                conditionA.signal();
            } catch (InterruptedException e) {
                e.printStackTrace();
            } finally {
                lock.unlock();
            }

        }
    }

}

