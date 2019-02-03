package ex_3;

public class Main {
    public static void main(String[] args) {

        Box<Fruits> box1 = new Box<>("Box1"); // box1 - fruits 0
        box1.addFruit(new Apple()); // box1 - apple 1
        box1.addFruit(new Apple()); // box1 - apple 2
        box1.addFruit(new Apple()); // box1 - apple 3
        box1.addFruit(new Orange()); // box1 - apple 3

        Box<Fruits> box2 = new Box<>("Box2"); // box2 - fruits 0
        box2.addFruit(new Orange()); // box2 - orange 1
        box2.addFruit(new Orange()); // box2 - orange 2

        box1.compare(box2); // box1 == box2

        box1.addFruit(new Apple()); // box1 - apple 4

        box2.compare(box1); // box1 > box2

        box2.forWhat(); // box2 for orange

        Box<Fruits> box3 = new Box<>("Box3"); // box3 - fruits 0
        box1.moveToOtherBox(box3, 10); // запрашиваем пересыпать больше фруктов, чем находится в коробке.
                                             // просто пересыпятся все фрукты.
                                             // box3 - apple 4
        box2.moveToOtherBox(box3, 1); // ошибка, не соотвествующий тип фруктов!
                                            // box3 - apple 4
        box3.weight(); // box3 - 4.0
        box2.weight(); // box2 - 3.0
        box1.howManyFruits(); // box1 - 0
        box3.howManyFruits(); // box3 - apple 4
        box2.howManyFruits(); // box2 - orange 2

        box3.compare(box2); // box3 > box2

        box1.addFruit(new Orange());
        box1.forWhat();
        box1.howManyFruits();
    }
}
