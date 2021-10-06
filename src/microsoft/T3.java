package microsoft;
class Point2D {
    public int x;
    public int y;
}
public class T3 {

    public static void main(String[] args) {

    }


//    方法一：判断向量(p1-->p2)和向量(p1-->p3)的斜率是否相等。即 (y2-y1)/(x2-x1) == (y3-y1)/(x3-x1).  这个除式判断可以改写成乘式判断：(y3−y1)(x2−x1)−(y2−y1)(x3−x1)=0  (改写的原因是除法有分母为0或精度等问题，总之乘法更方便！)
//    注意，如果坐标本身是浮点型，尽量不要用“==”进行比较，因为在计算机中小数会有一定的误差，这时应该取一定的误差，例如
//|(y3−y1)(x2−x1)−(y2−y1)(x3−x1)|<=1e−6
//            ————————————————
//    版权声明：本文为CSDN博主「那个松鼠很眼熟」的原创文章，遵循CC 4.0 BY-SA版权协议，转载请附上原文出处链接及本声明。
//    原文链接：https://blog.csdn.net/sinat_38972110/article/details/82115637
    public int solution(Point2D[] A) {
        // write your code in Java SE 8
        int ans = 0;
        for (int i = 0; i < A.length - 2; i++) {
            Point2D a = A[i];
            for (int j = i + 1; j < A.length - 1; j++) {
                Point2D b = A[j];
                for (int k = j + 1; k < A.length; k++) {
                    Point2D c = A[k];
                    double s = (a.x * b.y + b.x * c.y + c.x * a.y - a.x * c.y - b.x * a.y - c.x * b.y);
                    if (Math.abs(s) < 1e-6) ans++;
                    if (ans > 100000000) {
                        ans = -1;
                        break;
                    }
                }
            }
        }
        return ans;

    }
}
