package day05;

import jdk.swing.interop.SwingInterOpUtils;

import java.util.Arrays;

public class Max0fArray {
    public static void main(String[] args) {
        int[] arr = new int[10];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = (int) (Math.random() * 100);
//            System.out.print(arr[i] + "\t");
        }
        System.out.println();
//        for(int element:arr){
//            element = (int)(Math.random()*100);
//            System.out.print(element+"\t");
//        }
//        System.out.println();
//        Arrays.stream(arr).forEach(element->{
//            element = (int)(Math.random()*100);
//            System.out.print(element+"\t");
//        });
        int max = arr[0];
        for (int i = 1; i < arr.length; i++) {
            if (max < arr[i]) {
                max = arr[i];
            }
        }
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + "\t");
        }
        System.out.println();
        arr = Arrays.copyOf(arr, arr.length + 1);
        arr[arr.length - 1] = max;
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + "\t");
        }
//        int min = arr[0];
//        for (int i = 1; i < arr.length; i++) {
//            if (min > arr[i]) {
//                min = arr[i];
//            }
//        }
        System.out.println("max=" + max);
//        System.out.println("min=" + min);
//        int[] arr2 = new int[6];
//        System.arraycopy(arr,1,arr2,2,4);
//        for (int i = 0; i < arr2.length; i++) {
//            System.out.print(arr2[i]+"\t");
//        }
        //正序
        Arrays.sort(arr);
        //正序输出
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + "\t");
        }
        System.out.println();
        //倒序输出
        System.out.println();
        for (int i = arr.length-1; i >= 0; i--) {
            System.out.print(arr[i]+"\t");
        }

    }
}
