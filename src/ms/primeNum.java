package ms;

public class primeNum {
    public static void main(String[] args) {
//        Scanner scan = new Scanner(System.in);
//        int n = scan.nextInt();
        System.out.println(sumPrime(100));


    }

    public static int sumPrime(int n){
        int sum = 0;
        for(int i=1;i<n;i++){
            if(isPrime(i)){
                sum += i;
                System.out.println(i);
            }
        }
        return sum;
    }
    public static boolean isPrime(int a) {
        boolean flag = true;
        // 素数不小于2  质数定义为在大于1的自然数中，除了1和它本身以外不再有其他因数的数称为质数。
        if (a < 2) {
            return false;
        } else {
            for (int i = 2; i <= Math.sqrt(a); i++) {
                // 若能被整除，则说明不是素数，返回false
                if (a % i == 0) {
                    flag = false;
                    break;// 跳出循环
                }
            }
        }
        return flag;
    }





}
