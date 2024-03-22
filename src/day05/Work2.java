package day05;

import java.util.Arrays;

public class Work2 {
    public static void main(String[] args) {
        //变量就近原则,先找方法的局部变量,再找成员变量,最后找父类的成员变量,this,指的是本类成员变量
        //私有成员变量子类不继承

        //1
//        for (int i = 1; i <=9 ; i++) {
//            for (int j = 1; j <= i; j++) {
//                System.out.print(i+"×"+j+"="+i*j+"\t");
//            }
//            System.out.println();
//        }
        //2
        //声明
        int[] a, b;
        int[] c = new int[6], d = new int[5];
        //初始化
        a = new int[]{1, 2, 3};
        b = new int[]{1,2,3,4};
//        int e,f;
//        e = 6,f= 7;报错,不能两个初始赋值
        c = new int[]{1,2,3,4,5};
        c = new int[]{1,2,3,4,5};
        d = new int[]{1,2,3,4,5,6};
        int [] e = {1,2,3,4,56};
        //访问
        System.out.println(a.length);
        System.out.println(a[a.length-1]);
        System.out.println(a[1]);
        //遍历
        for (int i = 0; i < a.length; i++) {
            System.out.print(a[i]);
        }
        System.out.println();
        for(int element:a){
            System.out.print(element);
        }
        System.out.println();
        Arrays.stream(a).forEach(element->{
            System.out.print(element);
        });
        System.out.println();
        //复制
        int arr[] = new int[6];
        System.arraycopy(a,1,arr,4,2);
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i]);
        }
        System.out.println();
        int []arr2 = Arrays.copyOf(arr,8);
        for (int i = 0; i < arr2.length; i++) {
            System.out.print(arr2[i]);
        }
        System.out.println();
        arr2 = Arrays.copyOf(arr2,6);
        for (int i = 0; i < arr2.length; i++) {
            System.out.print(arr2[i]);
        }
        System.out.println();
        //4
        int max = arr2[0];
        for (int i = 1; i < arr2.length; i++) {
            if(arr[i]>max){
                max = arr2[i];
            }
        }
        arr2 = Arrays.copyOf(arr2,arr2.length+1);
        arr2[arr2.length-1]=max;
        for (int i = 0; i < arr2.length; i++) {
            System.out.print(arr2[i]);
        }
        System.out.println();
        int [] arr3 = {1,34,66,78,2,2,456,3,23};
        Arrays.sort(arr3);
        for (int i = 0; i < arr3.length; i++) {
            System.out.print(arr3[i]+"\t");
        }
        System.out.println();
    }
}
