package OOday05;

public class GetterSetterDemo {
    public static void main(String[] args) {
        Point p = new Point();
        p.setX(100);
        p.setY(100);
        int x = p.getX();
        int y = p.getY();
        System.out.println(x);
        System.out.println(y);
    }
}
