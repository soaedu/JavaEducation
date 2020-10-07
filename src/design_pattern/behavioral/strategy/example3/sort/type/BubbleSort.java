package design_pattern.behavioral.strategy.example3.sort.type;

import design_pattern.behavioral.strategy.example3.sort.Sorting;

import java.util.Arrays;

// Concrete Strategy
public class BubbleSort implements Sorting {

    @Override
    public void sort(int[] array) {
        long startSort = System.currentTimeMillis();
        long endSort;

        System.out.println("bubble sort - сортировка пузырьком");
        System.out.println("Array before sort:" +
                "\n\t" + Arrays.toString(array));
        for (int barrier = array.length - 1; barrier >= 0; barrier--) {
            for (int i = 0; i < barrier; i++) {
                if (array[i] > array[i+1]) {
                    int temp = array[i];
                    array[i] = array[i+1];
                    array[i+1] = temp;
                }
            }
        }
        endSort = System.currentTimeMillis();

        System.out.println("Array after sort:" +
                "\n\t" + Arrays.toString(array)+
                "\n\tsort time: " + (endSort - startSort)+ " ms.");
    }
}
