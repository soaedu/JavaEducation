package java_regular.data.type.arrays.operation.sort.example2;

import Utils.ArrayHelper;

import static Utils.IOHelper.parseToInt;
import static Utils.IOHelper.requestDataFromUser;

public class ArrSortMain {
    public static void main(String[] args) {
        int arrSize = -1;

        // получение размера массива
        while (arrSize <= 1) {
            arrSize = parseToInt(requestDataFromUser("Введите длину массива: "));
        }

        // создаем и наполняем массив
        int[] intArr = new int[arrSize];
        for(int i=0; i<intArr.length; i++) {
            int value = -1;

            while (value == -1) {
                value = parseToInt(requestDataFromUser("[" +i+ "] item = ").charAt(0));
            }

            intArr[i] = value;
        }

        // вывод заполненного массива на экран
        ArrayHelper.printArray(intArr);

        System.out.println("\nCортировка... [" +InsertionSort.class.getSimpleName()+ "]");

        // засекаем начало сортировки
        long startSort = System.nanoTime();

        new InsertionSort().sort(intArr);

        // засекаем окончание сортировки
        long endSort = System.nanoTime();

        // вычисляем время затраченное на сортировку
        long sortTime = endSort - startSort;

        // вывод отсортированного массива на экран
        ArrayHelper.printArray(intArr);

        System.out.println("\nЗатраченное время: " +sortTime+ " наносекунд.");
    }
}
