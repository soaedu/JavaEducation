package java_regular.data.type.arrays.operation.search;

public class BinarySearch {
    public static int getSymbolPosition(char[] array, char symbol) {
        int pos = -1;
        int middle = (array.length/2);

        // искать..пока не найден символ или
        // нет флага(-1) - значит при поиске символ не найден
        while(pos < 0) {
            // крайних два элемента с обоих концов уже не вычисляем середину
            if((middle > 1) && (middle < (array.length-2))) {
                // если элемент массива совпадает с искомым
                if(array[middle] == symbol) {
                    // запомнить позицию и на выход
                    pos = middle;
                    break;
                } else {
                    // если элемент массива больше искомого по значению
                    if(array[middle] > symbol) {
                        // вычисляем середину слева от текущей середины
                        middle -= middle/2;
                    } else {
                        // вычисляем середину справа от текущей середины
                        middle += middle/2;
                    }
                }
            } else {
                if(middle == 1) {
                    // если элемент массива совпадает с искомым
                    if(array[middle-1] == symbol) {
                        // запомнить позицию и на выход
                        pos = 0;
                        break;
                    }
                    // если элемент массива совпадает с искомым
                    else if(array[middle] == symbol) {
                        // запомнить позицию и на выход
                        pos = 1;
                        break;
                    }
                    // символ не найден
                    else {
                        // выставить флаг = -1 и на выход
                        pos = -1;
                        break;
                    }
                }
                // если элемент массива совпадает с искомым
                else if(array[array.length-2] == symbol) {
                    // запомнить позицию и на выход
                    pos = array.length-2;
                    break;
                }
                // если элемент массива совпадает с искомым
                else if(array[array.length-1] == symbol) {
                    // запомнить позицию и на выход
                    pos = array.length-1;
                    break;
                }
                // символ не найден
                else {
                    // выставить флаг = -1 и на выход
                    pos = -1;
                    break;
                }
            }
        }

        return pos;
    }
}
