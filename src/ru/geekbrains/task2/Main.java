package ru.geekbrains.task2;

import java.util.ArrayList;
import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
        Integer[] arrInt = {1, 2, 3, 4, 5};
        System.out.println("Массив: " + Arrays.toString(arrInt) + ". Класс- " + arrInt.getClass().getName());
        System.out.println("Превращается в: " + arrayToArrayList(arrInt).getClass().getName());
        System.out.println();

        String[] arrStr = {"раз", "два", "три", "четыре", "пять", "шесть"};
        System.out.println("Массив: " + Arrays.toString(arrStr) + "Класс- " + arrStr.getClass().getName());
        System.out.println("Превращается в: " + arrayToArrayList(arrStr).getClass().getName());
    }

    public static <T> ArrayList<T> arrayToArrayList (T[] arr){
        ArrayList<T> arrayList = new ArrayList<>();
        for (int i = 0; i < arr.length; i++) {
            arrayList.add(i, arr[i]);
        }
        return arrayList;
    }
}
