package day05;

import java.util.Arrays;

public class ArrayCopyDemo {
    public static void main(String[] args) {
    int[] arr = {1,2,3,4,5,6,7,8,9};
//        System.out.println("arr的地址:"+arr);
//        System.out.println("arr的地址:"+arr);
    int[] arr2 = new int[5];
    System.arraycopy(arr,3,arr2,1,4);//必须严格对齐
        for (int i = 0; i < arr2.length; i++) {
            System.out.print(arr2[i]+"\t");
        }
        System.out.println();
       arr2 = Arrays.copyOf(arr,11);
        for (int i = 0; i < arr2.length; i++) {
            System.out.print(arr2[i]+"\t");
        }
        System.out.println();
        arr = Arrays.copyOf(arr,2);
//        System.out.println("arr扩容后的地址:"+arr);
// 开辟了新的地址空间,地址值发生改变
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i]+"\t");
        }
//        System.out.println();
//        int [] arr3 = new int[9];
//        arr3 = Arrays.copyOf(arr,9);
//        for (int i = 0; i < arr3.length; i++) {
//            System.out.print(arr3[i]+"\t");
//        }
//        System.out.println();
//        int[] arr4 = {2,3,4,5,6,7,8,9,10};
//        arr3 = Arrays.copyOf(arr4,9);
//        for (int i = 0; i < arr3.length; i++) {
//            System.out.print(arr3[i]+"\t");
//        }
    }
}
