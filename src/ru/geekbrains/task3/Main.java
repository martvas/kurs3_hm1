package ru.geekbrains.task3;

import com.sun.xml.internal.bind.v2.runtime.output.SAXOutput;

public class Main {
    public static void main(String[] args) {
        Box box1 = new Box();
        Box box2 = new Box();
        Apple apple = new Apple();
        Orange orange = new Orange();

        //Положили в первую коробку 3 яблока
        box1.addFruit(apple);
        box1.addFruit(apple);
        box1.addFruit(apple);

        //Попытка положить в коробку с яблоками - апельсин. Должно появиться предупреждение в консоле.
        System.out.println("Попытка попложить в коробку с яблоками - апельсины:");
        box1.addFruit(orange);

        // Положили во вторую коробку - апельсины.
        box2.addFruit(orange);
        box2.addFruit(orange);
        System.out.println();

        //Вывод веса коробок и их сравнение
        System.out.println("Вес box1: " + box1.getWeight());
        System.out.println("Вес box2: " + box2.getWeight());
        System.out.println("Коробки равны?: " + box1.compare(box2) + "\n");

        //Добавим фрукт, чтобы у коробок были разные веса
        box2.addFruit(orange);
        System.out.println("Сравнение по весу. После добавления апельсина. Размер box2: " + box2.getWeight());
        System.out.println("Коробки равны?: " + box1.compare(box2) + "\n");

        //Создадим коробку, чтобы потом в нее пересыпать фрукты
        Box box3 = new Box();
        box3.addFruit(orange);
        box3.addFruit(orange);
        System.out.println("Размер box3: " + box3.getWeight());
        box2.putFruitsFromAnotherBox(box3);
        System.out.println("Размер box2 после пересыпки с box3: " + box2.getWeight() + "\n");

        //Попробуем пересыпать коробку с яблоками в апельсины
        box2.putFruitsFromAnotherBox(box1);
    }
}
