package day03;

public class Work {
    public static void main(String[] args) {
        //1
/*
        System.out.println(5 % 2);//1
        System.out.println(8 % 2);//0
        System.out.println(2 % 8);//2
        System.out.println("-------------");*/
        /*int a = 5,b = 5;
        a++;
        ++b;
        System.out.println(a);//6
        System.out.println(b);//6
        System.out.println("-------------");*/
/*        int a = 5,b=5;
        a--;
        --b;
        System.out.println(a);//4
        System.out.println(b);//4
        System.out.println("---------");*/
        /*int a =5,b= 5;
        int c = a++;//c = 5,a=5+1=6
        int d = ++b;//d = 5+1,a=5+1=6
        System.out.println(a);//6
        System.out.println(b);//6
        System.out.println(c);//5
        System.out.println(d);//6
        System.out.println("----------");
*/
/*        int a = 5,b = 5;
        int c = a--;//c=5,a=5-1=4
        int d = --b;//d=5-1,b=5-1=4
        System.out.println(a);//4
        System.out.println(b);//4
        System.out.println(c);//5
        System.out.println(d);//4
        System.out.println("--------");*/
        //2
/*        int a=5,b=10,c=5;
        boolean b1 = b > a;//true
        System.out.println(b1);//true
        System.out.println(c<b);//true
        System.out.println(a>=c);//true
        System.out.println(b<=a);//false
        System.out.println(b==c);//false
        System.out.println(a!=c);//false

        System.out.println(a+c>10);//false
        System.out.println(b%2==0);//true
        System.out.println(c++>5);//false,c=5+1=6
        System.out.println(c++>5);//true,c=6+1=7*/
        //3
/*//        int a = 5,b=10,c=5;
//        boolean b1 =b >=a &&b<c;//true&&false=false
//        System.out.println(b1);//false
//        System.out.println(b<=c&&b>a);//false&&true=false
//        System.out.println(a == b&& c>b);//false&&false=false
//        System.out.println(b!=c&&a<b);//true&&true=true
//        System.out.println("---------");
//        System.out.println(b>=a||b<c);//ture||false=true
//        System.out.println(b<=c&&b>a);//false||true=true
//        System.out.println(b!=c&&a<b);//true||true=true
//        System.out.println(a==b&&c>b);//false||false=false
//
//        boolean b2 = !(a<b);//!(true)=false
//        System.out.println(b2);//false
//        System.out.println(!(a>b));//!(false)=true

        int a = 5,b=10,c=5;
        boolean b3 = a>b && c++ >2;//false=false,c++不会触发短路了,c=5
        System.out.println(b3);//false
        System.out.println(c);//5

        boolean b4 = a<b ||c++>2;//false = false,c=5
        System.out.println(b4);//false
        System.out.println(c);//5*/
        //4
/*        int a = 5;
        a += 10;//a=15
        System.out.println(a);//15
        a *= 2;//a=30
        System.out.println(a);//30
        a /= 6;//5
        System.out.println(a);//5

        short s = 5;
//        s = s + 10;
         s = (short)(s+10);
         s += 10;*/
        //5
/*        int age = 38;
        System.out.println("age=");//age=
        System.out.println(age);//38
        System.out.println("age="+age);//age=38
        System.out.println("我的年龄是"+age);//我的年龄是38
        System.out.println("我今年"+age+"岁了");//我今年38岁了

        String name = "WKJ";
        System.out.println("name"+name);//name=WKJ
        System.out.println("大家好,我叫"+name);//大家好,我叫WKJ
        System.out.println("大家好,我叫"+name+",今年"+age+"岁了");//大家好,我叫WKJ,今年38岁了

        System.out.println(10+20+""+30);//3030
        System.out.println(""+10+20+30);//102030
        System.out.println(10+20+30+"");//60*/
        //6
/*        int num = 5;
        int flag = num>0?1:-1;//1
        System.out.println(flag);//1

        int a = 8,b = 5;
        int max = a> b?a:b;//8
        System.out.println(max);//8*/
        //7
/*        double price = 300.0;
        if (price >= 500) {
            price *= 0.8;
        }
        System.out.println("最终消费金额为:" + price);//最终消费金额为:300

        int score = -5;
        if (score >= 0 && score <= 100) {
            System.out.println("成绩合法");
        }
        System.out.println("继续执行");*/
        //8
/*        double price = 300.0;
        if(price>=500){
            price*=0.8;
        }else{
            price*=0.9;
        }
        System.out.println("最终消费金额为:" + price);//270
        int score = 95;
        if (score>=0&&score<=100){
            System.out.println(score+"成绩合法");
        }else{
            System.out.println(score+"成绩不合法");
        }*/
        //9
        double price = 600.0;
        if(price>=2000){
            price*=0.5;
        }else if(price>=1000){
            price*=0.7;
        }else if(price>=500){
            price*=0.8;
        }else{
            price*=0.9;
        }
        System.out.println("最终消费金额为:"+price);//最终消费金额为:480
    }
}