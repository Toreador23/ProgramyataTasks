package com.otryadprogramyat.quicksort;

public class SwapMethod {

    public static void swap(int[] array, int index1, int index2) {

        int temp = array[index1];
        array[index1] = array [index2];
        array[index2] = temp;

    }

}
