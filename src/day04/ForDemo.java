package day04;

public class ForDemo {
    public static void main(String[] args) {
        for (int times = 0; times < 5; times++) {
            System.out.println("行动是成功的阶梯");
        }
        System.out.println("继续执行");
//执行过程：
        //times=0 true 输出
        //times=1 true 输出
        //times=2 true 输出
        //times=3 true 输出
        //times=4 true 输出
        //times=5 false for循环结束
        //输出继续执行
        for (int num = 1; num <=9 ; num++) {
            System.out.println(num+"*9"+num*9);
        }
//        System.out.println(num);编译错误，超出int作用域
        for (int num = 1; num <=9 ; num+=2) {
            System.out.println(num+"*9"+num*9);
        }
        for (int num = 9; num >=1 ; num--) {
            System.out.println(num+"*9"+num*9);
        }
        int sum = 0;
        for (int i = 1; i <=100; i++) {
            sum += i;//累加
            System.out.print("i="+i+"\t"+"sum=");
            for (int j = 1; j <= i; j++) {
                if (j!=i) {
                    System.out.print(j + "+");
                }else{
                    System.out.print(j + "=");
                }
            }
            System.out.println(sum);
        }
        System.out.println("sum="+sum);

        for (int i = 0; i < 10;) {
//            i++;1-10
            System.out.println(i);
            i++;//0-9

        }
    }
}
