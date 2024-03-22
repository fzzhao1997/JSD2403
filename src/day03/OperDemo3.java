package day03;

public class OperDemo3 {
    public static void main(String[] args) {
/*        System.out.println(!(5>6)&&(6>5));//true
        System.out.println(!(5>6)||(5>5));//true
        System.out.println((5>6)||(5>5));//false
        System.out.println((5>6)^(5>5));//false
        System.out.println(!((5>6))&&(5>5));//true,异或只有一真一假为真*/
        System.out.println(!(5>3));//false
        System.out.println(!(5==3));//true
        int a = 2;
        System.out.println(3>2&&a++>2);//false
        System.out.println(a);//3
        System.out.println(3>2&a--==2);//false
        System.out.println(a);//2
    }
}
