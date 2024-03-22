package day04;

import java.util.Random;
import java.util.Scanner;

public class Guessing {
    public static void main(String[] args) {
//        Random  r = new Random();
        Scanner sc = new Scanner(System.in);
        int max = 1000;
        int min = 1;
//        int num = r.nextInt(100)+1;
        int num = (int) (Math.random() * (max-min+1)) + min;//Math.random()0.0到0.9999999...之间
        /*
        System.out.println("猜吧"+"数字在"+min+"到"+max+"之间");
        int guess = sc.nextInt();
        while(guess!=num){
            if(guess>num){
                System.out.println("猜大了");
                max=max >guess?guess:max;//猜的比num大,则max为guess,//第一要素,重复执行后用来判断的地方
                // 但赋值前max不能大于之间的max,新的max=之前的max>guess?guess:之前的max
            }else {
                System.out.println("猜小了");
                min=min<guess?guess:min;
            }
            System.out.println("猜吧"+"数字在"+min+"到"+max+"之间");//第三要素,重复执行后用来判断的地方
            guess = sc.nextInt();
        }
        System.out.println("恭喜你猜对了");*/
        int guess;//变量从声明开始到包着它的最近大括号}结束
        do {
            System.out.println("猜吧!" + "(数字在" + min + "到" + max + "之间)");//循环之前先做,循环中再做,用do while
            guess = sc.nextInt();
            if (guess > num) {
                System.out.println("猜大了");
                max = max > guess ? guess : max;//猜的比num大,则max为guess,
                // 但赋值前max不能大于之间的max,新的max=之前的max>guess?guess:之前的max
            } else if (guess < num) {
                System.out.println("猜小了");
                min = min < guess ? guess : min;
            } else {
                System.out.println("恭喜你猜对了");
            }
        } while (guess != num);
    }
}
