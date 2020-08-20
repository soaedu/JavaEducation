package java_regular.data.type.arrays.operation.search;

import java.util.Arrays;

import static Utils.ArrayHelper.printArray;
import static Utils.IOHelper.parseToInt;
import static Utils.IOHelper.requestDataFromUser;

public class ArrSearchMain {
    public static void main(String[] args) {
        int arrSize = -1;

        // получение размера массива
        while (arrSize <= 1) {
            arrSize = parseToInt(requestDataFromUser("Введите длину массива: "));
        }

        // создаем и наполняем массив
        char[] charArr = new char[arrSize];
        for(int i=0; i<charArr.length; i++) {
            charArr[i] = requestDataFromUser("[" +i+ "] item = ").charAt(0);
        }

        printArray(charArr);

        // сортировка массива
        System.out.println("\nSorting...");
        Arrays.sort(charArr);

        printArray(charArr);

        // получаем символ для поиска
        char symbolToSearch = requestDataFromUser("\nВведите символ для поиска в массиве: ").charAt(0);

        // поиск заданного символа в массиве
        int symbolPos = BinarySearch.getSymbolPosition(charArr, symbolToSearch);

        String searchResult = (symbolPos >= 0) ? "Символ '" +symbolToSearch+ "' найден в позиции: " +(symbolPos+1) :
                "Символ '" +symbolToSearch+ "' не найден в массиве.";
        System.out.println(searchResult);



        int a = -10;

        if (a > 0)
            if (a == 11)
                System.out.println("a == 11");
        else
            System.out.println("else");
    }
}
