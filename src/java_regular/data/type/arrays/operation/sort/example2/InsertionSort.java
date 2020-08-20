package java_regular.data.type.arrays.operation.sort.example2;

import java_regular.data.type.arrays.operation.sort.SortInterface;

import static Utils.ArrayHelper.swapItems;

public class InsertionSort implements SortInterface {
    @Override
    public void sort(int[] array) {
        int minVal;
        int minPos = 0;

        // внешний цикл прохода по массиву
        for(int i=0; i<(array.length-1); i++) {
            // фиксируем значение с которым начинаем каждый раз сравнивать
            minVal = array[i];

            // внутренний цикл прохода по массиву
            for(int j=i; j<array.length; j++){
                // если текущий элемент не меньше зафиксированного как минимального
                // перейти к следующему элементу
                if(minVal < array[j]) {
                    continue;
                }
                // иначе зафиксировать его значение как минимальное
                else {
                    minVal=array[j];
                    minPos=j;
                }
            }
            // обмен позициями, миниальный идет на позицию i
            swapItems(array, i, minPos);
        }
    }
}
