package day02;

import java.math.BigInteger;

public class IntDemo {
    public static void main(String[] args) {
        int num = 1;//数据赋值先看能装进默认类型再赋值转换,有运算参与,超过范围是溢出,直接数据超过范围是编译错误
        for (int i = 0; i < 31; i++) {
            num = num*2;
        }
        System.out.println(num-1);
        num =(num-1)*(num-2)*3234242;
        System.out.println(num);
    }
}
