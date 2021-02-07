package java3.lesson1;

import java.util.ArrayList;
import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
//        1-е
        String arr1[] = {"Cat", "Dog", "Horse", "Cow"};
        Integer arr2[] = {10, 20, 30, 40, 50};
        replacementElement(arr1, 0, 2);
        replacementElement(arr2, 0, 4);

//        2-е
        convertArrToList(arr1);
        convertArrToList(arr2);

//        3-е
        Box<Orange> boxOrange1 = new Box<>();
        Box<Orange> boxOrange2 = new Box<>();
        Box<Apple> boxApple1 = new Box<>();
        Box<Apple> boxApple2 = new Box<>();

        System.out.println("3-е. Имеем 2 box-Orange и 2 box-Apple.");
        weightBoxPrint(boxOrange1, boxOrange2, boxApple1, boxApple2);

        System.out.println("\nДобавляем фрукты в коробку и взвешиваем: ");
        boxOrange1.addFruit(new Orange(), 8);
        boxOrange2.addFruit(new Orange(), 12);
        boxApple1.addFruit(new Apple(), 12);
        boxApple2.addFruit(new Apple(), 10);
        weightBoxPrint(boxOrange1, boxOrange2, boxApple1, boxApple2);

        System.out.println("\nСравнение веса коробок: ");
        System.out.println("Результат сравнения boxOrange1 и boxApple1: " + boxOrange1.compare(boxApple1));
        System.out.println("Результат сравнения boxOrange2 и boxApple2: " + boxOrange2.compare(boxApple2));

        System.out.println("\nПересыпаем из одной коробки в другую и взвешиваем: ");
        boxOrange1.pourIntoBox(boxOrange2);
        boxApple1.pourIntoBox(boxApple2);
        weightBoxPrint(boxOrange1, boxOrange2, boxApple1, boxApple2);
    }


    public static <T> void replacementElement(T[] arr, int element1, int element2) {
        System.out.println("1-е. Задан массив: " + Arrays.toString(arr));
        T ar = arr[element1];
        arr[element1] = arr[element2];
        arr[element2] = ar;
        System.out.println("Меняем два элемента массива местами: " + Arrays.toString(arr) + "\n");
    }

    public static <T> void convertArrToList(T[] arr) {
//       1-й способ(возвращает список фиксированного размера. Этот размер зависит от размера исходного массива):
        ArrayList<T> arrayList = new ArrayList<>(Arrays.asList(arr));
        System.out.println("2-е. Преобразуем массив в ArrayList: " + arrayList + "\n");
//       2-й способ (копируется в список в виде самостоятельного объекта. Исходный массив и результирующий ArrayList будут независимы друг от друга)
       /* List<T> listOfStrings = new ArrayList<>();
        Collections.addAll(listOfStrings,arr);
        for (T str : listOfStrings)
            System.out.print(" " + str); */

    }

    public static void weightBoxPrint(Box<Orange> boxOrange1, Box<Orange> boxOrange2, Box<Apple> boxApple1, Box<Apple> boxApple2) {
        System.out.println("Вес boxOrange1: " + boxOrange1.getWeight());
        System.out.println("Вес boxOrange2: " + boxOrange2.getWeight());
        System.out.println("Вес boxApple1: " + boxApple1.getWeight());
        System.out.println("Вес boxApple2: " + boxApple2.getWeight());
    }
}