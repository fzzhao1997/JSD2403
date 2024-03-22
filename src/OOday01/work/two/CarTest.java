package OOday01.work.two;

import java.util.Arrays;

public class CarTest {
    public static void main(String[] args) {
        Car cr = new Car("小米", 9.9, "黑色");
        cr.start();
        cr.run();
        cr.stop();
        int[] arr = {1, 2, 3};
        System.out.println(arr);//地址1
        arr[0] = 1;
        System.out.println(arr);//地址1
        traversalArray(arr);

        calAvg(arr);
        traversalArray(arr);

        CarTest ct = new CarTest();
        ct.calAvg2(arr);
        traversalArray(arr);

        ct.calAvg3(arr);
        traversalArray(arr);
    }

    public static void calAvg(int[] scores) {
        Arrays.sort(scores);
        scores[0] = 0;
        scores[scores.length - 1] = 0;
        double sum = 0;
        for (int i = 0; i < scores.length; i++) {
            sum += scores[i];
        }
        double avg = sum / (scores.length - 2);
//        return avg;
//        System.out.println();
    }

    public void calAvg1(int[] scores) {
        Arrays.sort(scores);
        scores[0] = 0;
        scores[scores.length - 1] = 0;
        double sum = 0;
        for (int i = 0; i < scores.length; i++) {
            sum += scores[i];
        }
        double avg = sum / (scores.length - 2);
//        return avg;
//        System.out.println();
    }

    public int[] calAvg2(int[] scores) {
        Arrays.sort(scores);
        scores[0] = 0;
        scores[scores.length - 1] = 0;
        double sum = 0;
        for (int i = 0; i < scores.length; i++) {
            sum += scores[i];
        }
        double avg = sum / (scores.length - 2);
        System.out.println(scores);//地址1
        //引用类型传参int [] scores = arr,也是值传递,是地址值的拷贝,
        // 相当于把指向同一地址空间,数组更改元素,是根据地址值找的空间,更改元素,所以不用传参也可以,而不是开辟新空间,scores地址值不变
//        return avg;
//        System.out.println();
        return scores;
    }

    public double calAvg3(int[] scores) {
        Arrays.sort(scores);
        scores[0] = 0;
        scores[scores.length - 1] = 0;
        double sum = 0;
        for (int i = 0; i < scores.length; i++) {
            sum += scores[i];
        }
        double avg = sum / (scores.length - 2.0);
//        return avg;
//        System.out.println();
        scores = new int[]{0,0,0};//赋值引用类型赋值,New出来的相当于开辟新空间,新空间地址变了,scores指向变了
        System.out.println(scores);//地值2
        return avg;

    }

    public static void traversalArray(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i]);
        }
        System.out.println();
        System.out.println("-------");

    }
}
