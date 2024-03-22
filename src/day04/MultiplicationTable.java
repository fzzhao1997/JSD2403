package day04;

public class MultiplicationTable {
    public MultiplicationTable() {
//        for (int i = 1; i <= 9; i++) {
//            for (int j = 1; j <= 9; j++) {
//                if(i>=j){
//                    System.out.print(i+"×"+j+"="+(i*j)+"\t");
//                }
//            }
//            System.out.println();
//        }
        int i = 1;
        while (i <= 9) {
            int j = 1;
            while (j <= 9) {
                if (i >= j) {
                    System.out.print(i + "×" + j + "=" + (i * j) + "\t");
                }
                j++;
            }
            System.out.println();
            i++;
        }
    }
}
