package day05;

public class MultiplicationTable {
    public static void main(String[] args) {
//        day04.MultiplicationTable m = new day04.MultiplicationTable();
        for (int i = 1; i <=9 ; i++) {
            for (int j = 1; j <=i ; j++) {
                System.out.print("i="+i+","+"j="+j+"\t"+i+"×"+j+"="+i*j+"\t");
            }
            System.out.println();
        }
    }
}
