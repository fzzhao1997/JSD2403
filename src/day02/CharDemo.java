package day02;

public class CharDemo {
    public static void main(String[] args) {
//        char a = '男';
//        char b = '女';
//        String c = ""+a+b;
//        char d = '\'';
//        char e = '\\';
//        System.out.println(c);
//         System.out.println('a'-1);
//         System.out.println(d);
//         System.out.println(e);
//         char a = ' ';
//        System.out.println(a);
//        long b = 100000000000000000L;
//        int c = (int) b;
//        System.out.println(c);
//        char d = 'a';
//        int e = d;
//        System.out.println(e);
//        double f =25.16;
//        int g = (int)f;
//        System.out.println(g);
        //char在运算符里相当于码来参与计算
        char a = 234;
        int b = a;
        System.out.println(a);
        System.out.println(a + 1);
        System.out.println(b);
        byte c = 1 + 2;
        short d = 3 + 4;
        char e = 1 + 6;
        char f = (char)(e + a);
        short q = 5+7;
        short p = (short)(q +d);
        byte A = 1+3;
        byte B =(byte)(A + c);
        short D = (short) (c +d +e);
    }
}
