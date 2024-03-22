package OOday05;

import java.util.Scanner;

public class StaticMethodDemo {

    public static void main(String[] args) {

        StaticMethod.test();
        StaticMethod o1 = new StaticMethod();
        o1.show();
        o1.test();//可以用,但不建议,idea也不提示
        System.out.println(StaticMethod.plus(StaticMethod.plus(5, 6), StaticMethod.plus(5, 6)));//返回值相当于实参传递给方法的形参

    }
}
