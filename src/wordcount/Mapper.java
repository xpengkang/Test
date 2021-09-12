//package wordcount;
//
//
//import org.apache.hadoop.io.IntWritable;
//        import org.apache.hadoop.io.LongWritable;
//        import org.apache.hadoop.io.Text;//注意要是hadoop 的包
//        import org.apache.hadoop.mapreduce.Mapper;//导入2.0
//
//        import java.io.IOException;
//
///**
// * KEYIN, map阶段输入的key的类型：LongWritable
// * VALUEIN,map阶段输入value类型：Text
// * KEYOUT,map阶段输出的Key类型：Text
// * VALUEOUT,map阶段输出的value类型：IntWritable
// */
//public class WordCountMapper extends Mapper<LongWritable, Text, Text, IntWritable> {
//    private Text outK = new Text();//为了提高性能，放这里
//    private IntWritable outV = new IntWritable(1);
//
//    @Override
//    protected void map(LongWritable key, Text value, Context context) throws IOException, InterruptedException {
//
//        // 1 获取一行
//        // atguigu atguigu
//        String line = value.toString();//因为没有text 操作，
//
//        // 2 切割
//        // atguigu
//        // atguigu
//        String[] words = line.split(" ");
//
//        // 3 循环写出
//        for (String word : words) {
//            // 封装outk
//            outK.set(word);
//
//            // 写出
//            context.write(outK, outV);
//        }
//    }
//}
