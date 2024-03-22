package day03;

import jdk.swing.interop.SwingInterOpUtils;

import java.util.Scanner;

public class IfDemo {
    public int price = 500;
    public Scanner sc = new Scanner(System.in);
    public double score;

    public IfDemo() {
    }

    public void Score() {
/*        double price = 230;
        if (price >= 500) {
            price *= 0.8;
        }
        System.out.println("price:" + price);*/
        while (true) {

            System.out.println("请输入成绩,成绩介于0之100之间");
            score = sc.nextDouble();//写在方法里面，因为sout只能写方法里，不然没有提示输出语句
            if (this.score < 0 || score > 100) {
                System.out.println("成绩不合法");
            } else if (this.score < 30) {
                System.out.println("成绩为D");
            } else if (this.score < 60) {
                System.out.println("成绩为C");
            } else if (this.score < 90) {
                System.out.println("成绩为B");
            } else {
                if (this.score < 95) {
                    System.out.println("成绩为A-");
                } else if (this.score < 97) {
                    System.out.println("成绩为A");

                } else {
                    System.out.println("成绩为A+");
                }
            }
        }
    }

    public void Price() {//具体就是当方法的局部变量和类的成员变量重名的时候，因为根据就近原则，直接使用时调用的是局部变量，但如果需要调用成员变量时，就需要用this关键字，格式为this.成员变量。
            int price = 300;
        if (this.price >= 500) {
            this.price *= 0.8;
        } else {
            this.price *= 0.9;
        }
        System.out.println("price:"+this.price);
    }
    public void PRICE(){
        if(this.price>=2000){
            this.price*=0.5;
        }else if(this.price>=1000){
            this.price*=0.7;
        }else if(this.price>=500){
            this.price*=0.8;
        }else{
            this.price*=0.9;
        }
        System.out.println("price:"+price);
    }
}
