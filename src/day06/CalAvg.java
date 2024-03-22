package day06;

import java.math.BigDecimal;
import java.util.Arrays;
import java.util.Scanner;


public class CalAvg {
    public static void main(String[] args) {
        double[] scores = inputDate(6);//录入评委的评分调scanner加数组遍历
        double avg = calAvg(scores);
        System.out.println("平均分为:"+avg);
    }
    /*该方法用于录入N位评委的评分*/
    public static double[] inputDate(int n){
        double[] scores = new double[n];//评分数组
        Scanner sc = new Scanner(System.in);
        for (int i = 0; i < scores.length; i++) {//通过遍历以及依次录入输入评委评分
            System.out.println("请录入第"+(i+1)+"位评委的评分");
            scores[i] = sc.nextDouble();
        }
        return  scores;
    }
    public  static double calAvg(double[] scores){
        Arrays.sort(scores);
        scores[0]=0;
        scores[scores.length-1]=0;
        double sum = 0;
        for (int i = 0; i < scores.length; i++) {
            sum += scores[i];
        }
        double avg = sum/(scores.length-2);
        return avg;
    }


}
