package ru.geekbrains.task3;

import java.util.ArrayList;

public class Box <T extends Fruit> {
    ArrayList<T> boxForFruit;

    public Box() {
        this.boxForFruit = new ArrayList<T>();
    }

    public void addFruit (T fruit) {
        if (boxForFruit.isEmpty()){
            boxForFruit.add(fruit);
        } else if (boxForFruit.get(0).getClass() == fruit.getClass() ){
            boxForFruit.add(fruit);
        } else {
            System.out.print("Вы не можете положить сюда фрукт данного типа. ");
            System.out.println("Создайте новую коробку для данного типа фруктов");
        }
    }

    public double getWeight () {
        if (boxForFruit.isEmpty()){
            System.out.println("Коробка пуста. Нельзя узнать её вес");
            return 0;
        } else {
            double boxSize = boxForFruit.size();
            float fruitWeight = boxForFruit.get(0).getWeight();
            return boxSize * fruitWeight;
        }
    }

    public boolean compare (Box anotherBox) {
        if (getWeight() == anotherBox.getWeight()){
            return true;
        } else return false;
    }

    public void putFruitsFromAnotherBox (Box anotherBox) {
        if (anotherBox.boxForFruit.isEmpty()) {
            System.out.println("Другая коробка пуста - пересыпать не получится.");
            return;
        }
        else if (boxForFruit.get(0).getClass() == anotherBox.boxForFruit.get(0).getClass()){
            boxForFruit.addAll(anotherBox.boxForFruit);
            anotherBox.boxForFruit.clear();
            System.out.println("Вы пересыпали коробку");
        } else System.out.println("Вы не можете пересыпать данные коробки. Так как в них лежат разные фрукты");
    }

}
