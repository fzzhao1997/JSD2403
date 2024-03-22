package day05;

public class Test {//需要注意的是，Java程序中的类必须要有一个public类，并且这个类名要和文件名相同。

    // 同时，如果一个Java程序中有多个类，只能有一个public类，其余的类不能被其他Java文件引用。
//    1.静态方法调用非静态方法
//            无论是否在同一类内,均需要通过对象调用
//2.静态方法调用静态方法
//    同一类直接调用,不同类通过类名.方法名
//3.在同一类内,非静态方法可以直接调用静态方法和非静态方法
//4.在不同类之间,非静态方法需要通过对象才能调用非静态方法
//    注:不同类之间,非静态方法既可以通过对象调用静态方法又可以通过类名直接调用
//静态调用非静态(本类,其他类)->创建对象
    //静态调用静态(本类)直接调,其他类类名
    //非静态调用静态\非静态(本类)直接调
    //非静态调用非静态(其他类)创建对象,静态(其他类)创建对象或类名
    public static void main(String[] args) {

        Zi Z = new Zi();
        Test T = new Test();
        T.s1();
        s2();
    }

     void s1() {
        System.out.println("动态方法s1");
    }
     static void s2() {
        System.out.println("静态方法s2");
    }
}

