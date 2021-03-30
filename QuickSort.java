package com.otryadprogramyat.quicksort;

import java.util.Arrays;

public class QuickSort extends QuickSortMethod {

    public static void main(String[] args) {

        int[] array = new int[] {94, 47, 555, 8, 11, 17, 18, 59, 66, 34, 87, 78, 45};

        System.out.println(Arrays.toString(array));

        quickSort(array, 0, array.length - 1);

        System.out.println(Arrays.toString(array));

    }
}