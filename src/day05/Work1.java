package day05;

import java.util.Random;

public class Work1 {
    public static void main(String[] args) {
        //1
//        int sum = 0;
//        for (int i = 1; i <=100 ; i++) {
//            if(i%2==0){
//                sum += i;
//            }
//        }
//        System.out.println("sum="+sum);
        //2
//        int num = 8;
//        int factorial = 1;
//        for (int i = 1; i <= num; i++) {
//            factorial *= i;
//        }
//        System.out.println(factorial);
        //3
        for (int i = 1; i <= 11; i += 2) {
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
        for (int i = 1; i <= 6; i++) {
            for (int k = 1; k <= 2 * i - 1; k++) {
                System.out.print("*");
            }
            System.out.println();
        }
        //4
//        Random r = new Random();
//        int [] arr=new int[10];
//        int max = 100;
//        int min = 1;
//        for (int i = 0; i <arr.length ; i++) {
//            arr[i]=r.nextInt(max -min+1)+1;
//        }
//        for (int i = 0; i < arr.length; i++) {
//            System.out.print(arr[i]+"\t");
//        }
//        System.out.println();
//        int maxArr = arr[0];
//        int minxArr = arr[0];
//        for (int i = 1; i < arr.length; i++) {
//            if(arr[i]>maxArr){
//                maxArr = arr[i];
//            }
//        }
//        System.out.println("maxArr="+maxArr);
//        for (int i = 1; i < arr.length; i++) {
//            if(arr[i]<minxArr){
//                minxArr = arr[i];
//            }
//        }
//        System.out.println("minArr="+minxArr);
    }
}
