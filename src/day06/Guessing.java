package day06;

import java.util.Random;
import java.util.Scanner;

public class Guessing {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Random r = new Random();
        int num = r.nextInt(1000) + 1;
        while (true) {
            System.out.println("猜吧");
            int guess = sc.nextInt();
            if (guess > num) {
                System.out.println("猜大了");
            } else if (guess < num) {
                System.out.println("猜小了");
            } else {
                System.out.println("猜对了");
                break;
            }
        }
    }
}