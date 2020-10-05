package design_pattern.behavioral.strategy.example3.sort.type;

import design_pattern.behavioral.strategy.example3.sort.Sorting;

import java.util.Arrays;

// Concrete Strategy
public class SelectionSort implements Sorting {
    @Override
    public void sort(int[] array) {
        long startSort = System.currentTimeMillis();
        long endSort;

        System.out.println("selection sort - сортировка выборками");
        System.out.println("Array before sort:" +
                "\n\t" + Arrays.toString(array));
        for (int barrier = 0; barrier < array.length - 1; barrier++) {
            for (int i = barrier + 1; i < array.length; i++) {
                if (array[i] < array[barrier]) {
                    int tmp = array[i];
                    array[i] = array[barrier];
                    array[barrier] = tmp;
                }
            }
        }
        endSort = System.currentTimeMillis();

        System.out.println("Array after sort:" +
                "\n\t" + Arrays.toString(array)+
                "\n\tsort time: " + (endSort - startSort)+ " ms.");
    }
}
