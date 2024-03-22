package day06;

import java.util.Random;

public class MethodDemo {
    public static void main(String[] args) {
//        say("赵方舟",27);//方法调用时的参数实参
//        say("123");
//        say();
//        String S = say1();
//        say1();
//重载是对参数类型定义的
/*        MethodDemo m = new MethodDemo();
        MethodDemo n = m;
        System.out.println(m);
        System.out.println(n);//1.如果变量是基本数据类型，此时赋值的是数据的实际值，即实参传递给形参的是实参的值
        //2.如果变量是引用数据类型，此时赋值的是保存数据的地址值，即实参传递给形参的是实参的地址
        m.sum(5,6);
        int sum = m.sum(5,6);
        sum = m.sum(sum,6);
        System.out.println(sum);
        sum = m.sum(5,6);
        System.out.println(sum);
        int[] arr ={1,2,3};
        int[] arr2 = arr;
        System.out.println(arr);
        System.out.println(arr2);//记录一个地址值*/

        int[] arr = generateArray();
        int[] arr2 = generateArray();
        int[] arr3 = generateArray(new int[30]);
        int[] arr4 = generateArray(20,100,20);
        say("lisi",80);
        say("lisi",66);
        traversingArrays(generateArray(30,70,70));
        traversingArrays(arr);
        traversingArrays(arr2);
        traversingArrays(arr3);
        traversingArrays(arr4);
    }
    public  static void say(String name,int age){//方法定义时的参数形参
        if(age>70){return;}
        System.out.println("大家好!我叫"+name+"今年"+age);
    }
    public  static void say(String name){
        System.out.println("大家好!我叫"+name+"");
    }
    public  static void say(){
        System.out.println("大家好!我叫222");
    }
    public  static String say1(){
        String NAME = "1";
        System.out.println("大家好!我叫222");
        return NAME ;
    }
    public  int sum(int num1,int num2){
        int num = num1 +num2;
        return num;
    }
    public  static int[] generateArray(){
        Random r = new Random();
        int [] arr = new int[10];
        for (int i = 0; i < arr.length; i++) {
            arr[i]= r.nextInt(100)+1;
        }
        return arr;
    }
    public  static int[] generateArray(int[] arr ){
        Random r = new Random();
        for (int i = 0; i < arr.length; i++) {
            arr[i]= r.nextInt(100)+1;
        }
        return arr;
    }
    public  static int[] generateArray(int len,int max,int min ){
        Random r = new Random();
        int [] arr = new int[len];
        for (int i = 0; i < arr.length; i++) {
            arr[i]= r.nextInt(max-min+1)+min;
        }
        return arr;
    }
    public static void traversingArrays(int[] arr){
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i]+"\t");
        }
        System.out.println();
    }
}
