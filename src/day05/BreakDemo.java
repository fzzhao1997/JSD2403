package day05;

public class BreakDemo {
    public static void main(String[] args) {
        for (int i = 1; i <= 9; i++) {
            if (i == 4) {
                break;
            }
            System.out.println(i + "*9=" + i * 9);
        }
    }
}
