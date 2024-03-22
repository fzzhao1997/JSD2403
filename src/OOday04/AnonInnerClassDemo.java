package OOday04;

import java.util.Scanner;

public class AnonInnerClassDemo {
    public static void main(String[] args) {
        Inter o1 = new Inter() {
        };
        Inter o2 = new Inter(){
        };
        InterInter o3 = new InterInter() {
            @Override
            public void show() {
                System.out.println("showshow");
            }
            void say(){
                System.out.println("哈哈");
            }//无意义,不能向下构造,因为匿名
        };
        o3.show();
        Scanner sc = new Scanner(System.in);
        int age = sc.nextInt();
    }
}
interface Inter{
}
interface InterInter{
    void show();
}
//class  AAA implements Inter{
//
//}
