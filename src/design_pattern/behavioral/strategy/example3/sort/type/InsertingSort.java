package design_pattern.behavioral.strategy.example3.sort.type;

import design_pattern.behavioral.strategy.example3.sort.Sorting;

import java.util.Arrays;

// Concrete Strategy
public class InsertingSort implements Sorting {

    @Override
    public void sort(int[] array) {
        long startSort = System.currentTimeMillis();
        long endSort;

        System.out.println("inserting sort - сортировка вставками");
        System.out.println("Array before sort:" +
                "\n\t" + Arrays.toString(array));
        for (int barrier = 1; barrier < array.length; barrier++) {
            int index = barrier;
            while (index - 1 >= 0 && array[index] < array[index-1]) {
                int tmp = array[index];
                array[index] = array[index-1];
                array[index-1] = tmp;
                index--;
            }
        }
        endSort = System.currentTimeMillis();

        System.out.println("Array after sort:" +
                "\n\t" + Arrays.toString(array)+
                "\n\tsort time: " + (endSort - startSort)+ " ms.");
    }
}
