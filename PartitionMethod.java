package com.otryadprogramyat.quicksort;

public class PartitionMethod extends SwapMethod {

    public static int partition(int[] arr, int less, int greater) {

        int leftIndex = less;
        int rightIndex = greater;

        int pivot = arr[less + (greater - less)/2];

        while (leftIndex <= rightIndex) {

            while (arr[leftIndex] < pivot) {
                leftIndex++;
            }

            while (arr[rightIndex] > pivot) {
                rightIndex--;
            }

            if(leftIndex<=rightIndex) {
                swap(arr, rightIndex, leftIndex);
                rightIndex--;
                leftIndex++;
            }

        }

        return leftIndex;

    }

}
