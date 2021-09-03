//package testThread;
//
//import java.util.concurrent.Semaphore;
//
//public class Thread1 implements Runnable {
//    private static final String s = "This is a coding test";
//
//    private Semaphore self;
//    private boolean first;
//
//    public Thread1(Seamphore self, Seamphore next, boolean first) {
//        this.self = self;
//        this.first = first;
//    }
//
//    public void run() {
//        int length = s.length();
//        int idx = first ? 0 : 1;
//
//        while (idx < length) {
//            semaphore.acquire();
//            System.out.print(s.charAt(idx));
//            idx += 2;
//            next.release();
//        }
//    }
//}