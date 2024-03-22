package day05;

import java.util.Arrays;

public class ArrayDemo {
    public static void main(String[] args) {
        int[] a = new int[5];
        double[] b = new double[10];
        boolean[] c = new boolean[26];
        a = new int[]{1, 2, 3, 4, 5, 6, 7, 8};//重新初始化,从5个元素改为8个元素
        System.out.println(a[0]);
        System.out.println(a[a.length - 1]);
        //输出数组中位元素
        if (a.length % 2 == 0) {
            System.out.println(a[a.length / 2 - 1]);
        } else {
            System.out.println(a[a.length / 2]);
        }
//        for (int element : a) {
//            System.out.print(element);
//        }

//        Arrays.stream(a).forEach(element -> {      System.out.print(element);});
//        for(int element:a){
//            System.out.println(element);
//        }
//        Arrays.stream(a).forEach(element ->{
//            System.out.println(element);
//        });

    }
}
