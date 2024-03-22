package day03;

public class Work2 {
    public static void main(String[] args) {
        int a = 10,b= 20;
        int max;
        if(a>b){
            max = a;
        }else if(a<b){
            max = b;
        }else{
            max = a;
        }
        System.out.println("max:"+max);

        int year = 1900;

        if((year%100!=0&&year%4==0)||year%400==0){
            System.out.println(year+"是闰年");
        }else{
            System.out.println(year+"是平年");
        }
        double score = 179;
        if(score>100||score<0){
            System.out.println("成绩不合法");
        }else if(score>=90){
            System.out.println("A");
        }else if(score>=80){
            System.out.println("B");
        }else if(score>=60){
            System.out.println("C");
        }else {
            System.out.println("D");
        }



    }
}
