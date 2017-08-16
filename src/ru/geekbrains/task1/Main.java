package ru.geekbrains.task1;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        Integer[] arrInt = {1, 2, 3, 4, 5};
        System.out.println("Первый массив: " + Arrays.toString(arrInt));
        changeElementsInArray(arrInt, 1, 4);
        System.out.println("Массив после изменения: " + Arrays.toString(arrInt));
        System.out.println();

        String[] arrStr = {"раз", "два", "три", "четыре", "пять", "шесть"};
        System.out.println("Второй массив: " + Arrays.toString(arrStr));
        changeElementsInArray(arrStr, 0, 5);
        System.out.println("Массив после изменения: " + Arrays.toString(arrStr));
    }

    private static <T> void changeElementsInArray (T[]arr, int firstIndex, int secondIndex ) {
        if (firstIndex < 0 || secondIndex < 0 || firstIndex > arr.length || secondIndex > arr.length){
            System.out.println("Введенные индексы - меньше нуля или больше размера массива");
            return;
        } else if (firstIndex == secondIndex) {
            System.out.println("Индексы совпадают, можно ничего не менять");
            return;
        } else {
            T valueStorage1 = arr[firstIndex];
            arr[firstIndex] = arr[secondIndex];
            arr[secondIndex] = valueStorage1;
        }
    }
}



