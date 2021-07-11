package Sorting;

import java.util.Arrays;

public class MainSorting {
    public static void main(String[] args) {
        /*int[] arr = {45, 7, 2, 8, 19, 3};
        int[] sortedBySmallest = Sorting.selectionSort(arr.clone());
        int[] sortedByLargest = Sorting.selectionSortLargest(arr.clone());
        System.out.println("SortSmallest");
        System.out.println(Arrays.toString(sortedBySmallest));
        System.out.println("SortLargest");
        System.out.println(Arrays.toString(sortedByLargest));

        int[] arr1 = {10, 34, 2, 56, 7, 67, 88, 42};
        int[] sorted = Sorting.insertionSort(arr1);
        System.out.println(Arrays.toString(sorted));*/

        int[] list={2,3,2,5,6,1,-2,3,14,12};
        list=Sorting.mergeSort(list);

        for(int arr: list)
            System.out.print(arr+" ");
    }
}
