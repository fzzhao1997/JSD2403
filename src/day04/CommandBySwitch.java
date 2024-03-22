package day04;

import java.util.Scanner;

public class CommandBySwitch {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int money =3000;
        System.out.println("请选择功能:1.存款 2.取款 3.查询余额 4.退卡");
        int command = sc.nextInt();
//        System.out.println(command);
        int a = 3;
        switch (command) {//()需要是整数或整数型的变量,{case 整数(不能是整数型的变量): },先匹配,再按顺序穿
            case 1:
                wh:
                while (true) {
                    System.out.println("请输入存款金额,整百存款");
                    int depositMoney = sc.nextInt();
                    if (depositMoney % 100 == 0) {
                        money += depositMoney;
                        System.out.println("您现在的余额"+money);
                        break wh;
                    } else {
                        System.out.println("只能整百存款");
                    }
                }
                break;
            case 2:
                System.out.println("取款");
                break;//遇到break跳出switch
            case 3:
                System.out.println("查询余额");
                break;
            case 4:
                System.out.println("退卡");
//                System.exit(0);
                break;
            default:
                System.out.println("输入错误");
        }
//       System.out.println("1111");
    }
}
