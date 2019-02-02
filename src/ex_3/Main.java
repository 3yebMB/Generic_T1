package ex_3;

public class Main {
    public static void main(String[] args) {

        Box<Apple> box1 = new Box<>("Box1");
        box1.addFruit(new Apple());
        box1.addFruit(new Apple());
        box1.addFruit(new Apple());

        Box<Orange> box2 = new Box<>("Box2");
        box2.addFruit(new Orange());
        box2.addFruit(new Orange());

        box1.compare(box2);

        box1.addFruit(new Apple());

        box2.compare(box1);

        box2.forWhat();

        Box<Apple> box3 = new Box<>("Box3");
        box1.moveToOtherBox(box3, 10); // запрашиваем пересыпать больше фруктов, чем находится в коробке.
                                             // просто пересыпятся все фрукты.

//        box2.moveToOtherBox(box3, 1); // ошибка, не соотвествующий тип фруктов!

        box1.howManyFruits();
        box3.howManyFruits();

        box2.howManyFruits();

        box3.compare(box2);
    }
}
