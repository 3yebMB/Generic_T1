package ex_3;

import java.util.ArrayList;

public class Box<T extends Fruits> {
    public static final String ANSI_RESET = "\u001B[0m";
    public static final String ANSI_BLACK = "\u001B[30m";
    public static final String ANSI_RED = "\u001B[31m";
    public static final String ANSI_GREEN = "\u001B[32m";
    public static final String ANSI_YELLOW = "\u001B[33m";
    public static final String ANSI_BLUE = "\u001B[34m";
    public static final String ANSI_PURPLE = "\u001B[35m";
    public static final String ANSI_CYAN = "\u001B[36m";
    public static final String ANSI_WHITE = "\u001B[37m";

    private String name;
    private ArrayList<T> iBox = new ArrayList<T>();
    String typeof = null;

    public Box(String name) {
        this.name = ANSI_RED + name;
    }

    private void removeFruit() {
        iBox.remove(0);
    }

    public void howManyFruits() {
        System.out.println("В коробке " + name + " " + ANSI_GREEN + iBox.size() + " " + typeof + ANSI_RESET);
    }

    public void addFruit(T fru) {
        if (typeof == null) {
            String st = fru.getClass().getName();
            String[] str = fru.getClass().getName().split("ex_3.");
            typeof = ANSI_YELLOW + str[1];
        }
        iBox.add(fru);
    }

    public String getName() {
        return name;
    }

    public void compare(Box<? extends Fruits> obox) {
        if (this.getWeightOfBox() > obox.getWeightOfBox())
            System.out.println("Коробка " + name + ANSI_RESET + ANSI_RESET + " тяжелее коробки " + obox.getName() + ANSI_RESET);
        else if (this.getWeightOfBox() < obox.getWeightOfBox())
            System.out.println("Коробка " + name + ANSI_RESET + ANSI_RESET + " легче коробки " + obox.getName() + ANSI_RESET);
        else System.out.println(ANSI_CYAN + "Коброки меют одинаковый вес."+ANSI_RESET);
    }

    public float getWeightOfBox() {
        float result = iBox.size()*iBox.get(0).getWeight();
        return result;
    }

    public void weight() {
        System.out.println("Коробка " + name + ANSI_RESET + " весит " + ANSI_PURPLE + getWeightOfBox() + ANSI_RESET + " у.е.");
    }

    public void forWhat(){
        if (typeof != null) System.out.println("Коробка " + name + ANSI_RESET +" преднажначена для " + typeof + ANSI_RESET);
    }

    public void moveToOtherBox(Box<? super T> bbox, int count) {
        int c = iBox.size();
        if (count < iBox.size()) c = count;

        for (int i = 0; i < c; i++) {
            if (i == count) break;
            bbox.addFruit(iBox.get(0));
            this.removeFruit();
        }
        System.out.println("Из коробки " + name + ANSI_RESET + " пересыпано " + c + " " + typeof + ANSI_RESET + " в коробку " + bbox.getName() + ANSI_RESET);
    }
}
