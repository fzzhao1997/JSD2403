package OOday04.work.two;

public class AnonInnerClassDemo {
    public static void main(String[] args) {
        Inter inter1 = new Inter(){
            @Override
            public void show() {
                System.out.println("略略略");
            }
        };
        Inter inter2 = new Inter(){
            @Override
            public void show() {
                System.out.println("好好好");
            }
        };
        InterInter interInter1 = new InterInter() {
            @Override
            public void show() {
                System.out.println("哈哈哈");
            }
        };
        InterInter interInter2 = new InterInter(){
            @Override
            public void show() {
                System.out.println("嘿嘿嘿");
            }
        };
        inter1.show();
        inter2.show();
        interInter1.show();
        interInter2.show();
    }

}
