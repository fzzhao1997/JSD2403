package day02;

public class BooleanDemo {
    public static void main(String[] args) {
        boolean a = true;
        int count = 0;
        while (a){
            System.out.println(a);
            a = false;
            System.out.println(a);
            count ++;
            a = true;
            if (count == 3){
                break;
            }
        }
    }
}
