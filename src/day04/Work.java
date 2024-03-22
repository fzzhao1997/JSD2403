package day04;

import java.util.Scanner;

public class Work {
    //1
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
/*        System.out.println("请输入整数");
        int num = sc.nextInt();
        if (num > 0) {
            System.out.println("+");
        } else if (num < 0) {
            System.out.println("-");
        } else {
            System.out.println("0");
        }*/
        //2
/*        System.out.println("请输入年份");
        int year = sc.nextInt();
        System.out.println("请输入月份");
        int month = sc.nextInt();
        switch (month) {
            case 2:
                if (year % 400 == 0 || (year % 4 == 0 && year % 100 != 0)) {
                    System.out.println("29天");
                } else {
                    System.out.println("28天");
                }
                break;
            case 4:
            case 6:
            case 9:
            case 11:
                System.out.println("30天");
                break;
//            case 1:
//            case 3:
//            case 5:
//            case 7:
//            case 8:
//            case 10:
//            case 12:
            default:
                System.out.println("31天");
//                break;*/
        //3
        int count = 0;
        for (int i = 1900; i <= 2023; i++) {
            if (i % 4 == 0 && i % 100 != 0 || i % 400 == 0) {
                System.out.print(i + "\t");
                count++;
                if (count % 10 == 0&&count!=0) {//不能放上一个if平级,可能造成非润年count未计数也满足
                    System.out.print("\n");
                }
            }
        }
    }
}

