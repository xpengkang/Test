package ms;

public class CircleArrayQueue {
    public static void main(String[] args) {
        //实例化
        CircleArray queue = new CircleArray(4);
        System.out.println(queue.curSize());
        queue.push(100);
        queue.push(80);
        queue.push(70);
        queue.push(60);
        queue.push(50);
        System.out.println(queue.curSize());
        System.out.println(queue.getFront());
        System.out.println(queue.isFull());
        System.out.println(queue.pop());
        System.out.println(queue.isFull());
        queue.show();




    }
}

/**
 * 数据结构
 */
class CircleArray{
    private int size;
    private int front;
    private int rear;
    private int[] arr;

    //构造器初始化,传入一个参数，size
    public CircleArray(int size){
        this.size = size;
        arr = new int[size];
        this.front = 0;//可以省
        this.rear = 0;//可以省
    }

    //判断队列大小
    public boolean isFull(){
        return (rear + 1) % size == front;
    }
    public boolean isEmpty(){
        return front == rear;
    }

    //push

    public void push(int n){
        if(isFull()){
            System.out.println("queue is full");
            return;
        }
//        rear++;
//        arr[rear] = n;//普通队列的写法
        arr[rear] = n;
        rear = (rear + 1) % size;//这里秒

    }

    //pop

    public int pop(){
        if(isEmpty()){
            System.out.println("queue is empty");
            throw new RuntimeException("queue is empty");
        }
        //将front 临时保存指向的变量,直接弹出无法右移指针
        //将front 右移
        //返回front 指向的变量
        int temp = arr[front];
        front = (front + 1) % size;
        return temp;
    }

    //当前size
    public int curSize(){
        //rear = 1, front = 0 , size = 3;
        return (rear + size - front) % size;
    }

    //show
    public void show(){
        if(isEmpty()){
            System.out.println("queue is empty");
            throw new RuntimeException("queue is empty");
        }
        for (int i = front; i < front + curSize(); i++) {
            System.out.printf("arr[%d]=%d\n", i % size, arr[i % size]);
        }
    }

    //显示队首；
    public int getFront(){
        if(isEmpty()){
            System.out.println("queue is empty");
            throw new RuntimeException("queue is empty");
        }
        return arr[front];
    }




}
