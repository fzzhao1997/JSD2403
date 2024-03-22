package day02;

import jdk.swing.interop.SwingInterOpUtils;

public class LongDemo {
    public static void main(String[] args) {
        long num = 1L;//赋值成功就是long,不加L不会影响结果
        for (int i = 0; i < 63; i++) {
            num = num*2;
        }
        num = num - 1;
        System.out.println(num);
        long a = 1000000000*3*10L;//首次赋值过程中,1000000000*3溢出int类型导致转long类型结果错误
        long b = 1000000000*2*10L;
        long c = 1000000000L*2*10;
        System.out.println(a+"\n"+b+"\n"+c);
        long d = 1000000001*3*10L;
        long e = 1000000001*2*10L;
        long f = 1000000001L*2*10;
        System.out.println(d+"\n"+e+"\n"+f);
    }
}
