package test;
//请使用标准输入输出(System.in, System.out)；
//        勿使用图形、文件、网络、系统相关的操作，如java.lang.Process , javax.swing.JFrame , Runtime.getRuntime
//        不要自定义包名称，否则会报错，即不要添加package answer之类的语句；
//        您可以写很多个类，但是必须有一个类名为Main，并且为public属性，并且Main为唯一的public class
//Main类的里面必须包含一个名字为'main'的静态方法（函数），这个方法是程序的入口

//输入数组和窗口大小k，数组和窗口大小用英文冒号分隔，数组内自然数用英文逗号分隔
//
//        输出描述
//        滑动开始到结束后出现的最大p值

//public class Main {
//
//    public static void main(String[] args) {
//
//    }



//    public double maxP(int[] nums, int k){
//        int i = 0, j = i+k-1;//窗口大小
//        int n = nums.length -1;
//        int sum = 0;//窗口里面的和
//
//        double avg = nums[i]
//        while(j<=n){
//            //第一个窗口的平均数
//            for(int s = i;s < j;s++){
//                int sum += nums[s];
//                double avg = sum/k;
//            }
//
//            //滑动
//            i++;
//            res = sum


//
//
//        }
//    }
//
//}




//import java.util.ArrayList;
//        import java.util.Arrays;
//        import java.util.List;
//        import java.util.Scanner;
//        import java.util.concurrent.*;
//        import java.util.stream.Collectors;
//
//
//public class Main {
//
//
//    public static void main(String[] args) throws InterruptedException {
//        Solution s = new Solution();
//        ThreadPoolExecutor threadPoolExecutor = new ThreadPoolExecutor(10, 10,
//                0L, TimeUnit.MILLISECONDS,
//                new LinkedBlockingQueue<Runnable>(10000));
//        final Scanner reader = new Scanner(System.in);
//        final String next = reader.next();
//        List<Line> lines = Arrays.stream(next.split(",")).map(str -> new StringLine(str))
//                .collect(Collectors.toList());
//        List<Line> result = s.translateAll(lines, "", threadPoolExecutor);
//        String resultString = result.stream().map(l -> l.toString()).collect(Collectors.joining(","));
//        System.out.println(resultString);
//        reader.close();
//        threadPoolExecutor.shutdown();
//    }
//
//    public interface Line {
//        /**
//         * translate the line to the specific language
//         * @param language - the language to translate
//         * @return the line of translated by the {@code language} */
//        Line translate(String language);
//    }
//
//    public static class Solution {
//        /**
//         * translate the all lines to the specific language
//         * @param lines the text lines of episode
//         * @param language the language to translate
//         * @return the lines of translated by the {@code language} */
//        public List<Line> translateAll(List<Line> lines, String language, Executor executor) throws InterruptedException {
//            Job<Line> job = new Job<>();
//            for (Line line : lines) {
//                Callable<Line> callable = () -> line.translate(language);
//                job.newTask(callable);
//            }
//            job.execute(executor);
//            return job.get();
//        }
//    }
//
//    public static class Job<V> {
//
//        public void newTask(Callable<V> runnable) {
//            //待实现
//        }
//
//
//        public void execute(Executor executor) {
//            //待实现
//        }
//
//        public List<V> get() throws InterruptedException {
//            //待实现
//        }
//
//    }
//
//    /**
//     * translate the string line to upper case
//     */
//    public static class StringLine implements Line {
//        private String text;
//
//        public StringLine(String text) {
//            this.text = text;
//        }
//
//        @Override
//        public Line translate(String language) {
//            return new StringLine(text.toUpperCase());
//        }
//
//
//        @Override
//        public String toString() {
//            return text;
//        }
//    }
//}