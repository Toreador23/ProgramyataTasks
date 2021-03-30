package com.otryadprogramyat.quicksort;

public class QuickSortMethod extends PartitionMethod {

    public static void quickSort(int[] arr, int less, int greater) {

        if (less<greater) {
            int divideIndex = partition(arr, less, greater);
            quickSort(arr, less, divideIndex - 1);
            quickSort(arr, divideIndex, greater);
        }

    }

}
