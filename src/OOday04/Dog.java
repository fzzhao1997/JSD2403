package OOday04;



public class Dog extends Animal implements Swim {
    Dog() {
    }
    Dog(String name, int age, String color) {
        super(name, age, color);
    }

    @Override
    void eat() {
        System.out.println(color+"色的狗狗正在啃骨头...");
    }

    @Override
    void drink() {
        System.out.println(color+"色的狗狗正在喝水...");
    }
    void lookHome(){
        System.out.println(color+"色的狗狗正在看家");
    }
    @Override
    public void swim() {
        System.out.println(color+"色的"+age+"岁的狗狗"+name+"正在游泳...");
    }
}
