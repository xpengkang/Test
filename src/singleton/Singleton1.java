package singleton;

public class Singleton1 {

    //饿汉式单例：在类初始化时就实例化了
    //私有静态成员变量,饿汉式单例：在类初始化时就已经自行实例化了
//    private static Singleton1 apple = new Singleton1();
//    //私有构造方法
//    private Singleton1(){}
//    //公有静态访问方法
//    public static Singleton1 getApple()
//    {
//        return apple;
//    }

    private static Singleton1 apple = new Singleton1();
    private Singleton1(){};
    public static Singleton1 getApple(){
        return apple;
    }





    //懒汉式 需要时候再new
    //私有静态成员变量//
    private static Singleton1 peatch = null;
    //公有静态访问方法，注意加了一个synchronized关键字确保线程安全
    public static synchronized Singleton1 getPeatch()
    {
        if(peatch == null)
            peatch = new Singleton1();
        return peatch;
    }

    public static void main(String[] args) {

        System.out.println(getApple());
        System.out.println(getPeatch());

    }

    //双重校验锁实现对象单例（线程安全）
    private volatile static Singleton1 pear;
    //    private Singleton1(){
//
//    }
    public  static synchronized Singleton1 getPear(){
        if (pear == null) {//先判断对象是否已经实例过，没有实例化过才进⼊加锁代码
            //类对象加锁
            synchronized (Singleton1.class) {
                if (pear == null) {//利用到volatile关键字的可见性，再次判断
                    pear  = new Singleton1();//确保线程安全，此时真的为空，创建实例
                }
            }
        }
        return pear;
    }


}