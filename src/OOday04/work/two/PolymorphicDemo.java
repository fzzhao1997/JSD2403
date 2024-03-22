package OOday04.work.two;




public class PolymorphicDemo {
    public static void main(String[] args) {
        Animal[] animal = new Animal[3];
        animal[0] = new Dog("狗狗", 2, "黑");
        animal[1] = new Chick("小鸡", 3, "黄");
        animal[2] = new Fish("小鱼", 5, "红");
        Master master = new Master();
        for (int i = 0; i < animal.length; i++) {
            animal[i].eat();
            animal[i].drink();
            if (animal[i] instanceof Dog) {
                ((Dog) animal[i]).lookHome();
            }
            if (animal[i] instanceof Chick) {
                ((Chick) animal[i]).layEggs();
            }
            if (animal[i] instanceof Swim) {
                ((Swim) animal[i]).swim();
            }
            System.out.println("-------");
            master.feed(animal[i]);
            System.out.println("-------");
        }
        }
    }

