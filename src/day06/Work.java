package day06;

import java.util.Arrays;

public class Work {
    public static void main(String[] args) {
    int [] arr = {1,2,3,46,89,1,7};
    int max = getMaxOfArray(arr);
        System.out.println(max);
        printArrayData(arr);
    }
    public static int getMaxOfArray(int[] arr){
        Arrays.sort(arr);
        return arr[arr.length-1];
    }
    public  static  void printArrayData(int[] arr){
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i]+"\t");
        }
        System.out.println();
    }
}
