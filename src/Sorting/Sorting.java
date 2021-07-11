package Sorting;

public class Sorting {
    public static int[] selectionSort(int[] arr) {
        for(int i = 0; i < arr.length; i++) {
            int bestIdx = i;
            // looping to find smallest value index
            for(int j = i + 1; j < arr.length; j++) {
                if(arr[j] < arr[bestIdx]) {
                    bestIdx = j;
                }
            }
            // swap with the smallest value index position
            int temp = arr[i];
            arr[i] = arr[bestIdx];
            arr[bestIdx] = temp;
        }
        return arr;
    }

    public static int[] selectionSortLargest(int[] arr) {
        // reverse loop
        for(int i = arr.length - 1; i >= 0; i--) {
            int bestIdx = i;
            // looping to find largest value index
            for(int j = i - 1; j >= 0; j--) {
                if(arr[j] > arr[bestIdx]) {
                    bestIdx = j;
                }
            }
            // swap with the largest value index position
            int temp = arr[i];
            arr[i] = arr[bestIdx];
            arr[bestIdx] = temp;
        }
        return arr;
    }

    public static int[] insertionSort(int[] arr) {
        for(int i = 1; i < arr.length; i++) {
            int currValue = arr[i];
            int j = i - 1;

            // reverse comparing & shifting to right
            while(j >= 0 && currValue < arr[j]) {
                arr[j + 1] = arr[j];
                --j;
            }

            // insert
            arr[j + 1] = currValue;
        }
        return arr;
    }

    public static int linearSearch(int[] list, int key){
        for(int i=0;i<list.length;i++)
            if(key==list[i])
                return i;
            return -1;
    }

    public static int binarySearch(int[] list, int key){
        int low=0;
        int high=list.length-1;

        while (high>=low){
            int mid=(high+low)/2;
            if(key<list[mid])
                high=mid-1;
            else if(key==list[mid])
                return mid;
            else
                low=mid+1;
        }

        return -1;
    }

    public static int[] bubbleSort(int[] list){
        boolean needNextPass=true;

        for(int i=1;i<list.length && needNextPass;i++){
            needNextPass=false;

            for (int j=0;j<list.length-i ;j++){
                if(list[j]>list[j+1]){
                    //swap
                    int temp=list[j];
                    list[j]=list[j+1];
                    list[j+1]=temp;

                    needNextPass=true;
                }
            }
        }
        return list;
    }

    public static int[] mergeSort(int[] list){
        if(list.length>1){

            //merge sort 1st half
            int[] firstHalf=new int[list.length/2];
            System.arraycopy(list,0,firstHalf,0,list.length/2);
            mergeSort(firstHalf);

            //merge sort 2nd half
            int secondHalfLength=list.length-list.length/2;
            int[] secondHalf=new int[secondHalfLength];
            System.arraycopy(list,list.length/2,secondHalf,0,secondHalfLength);
            mergeSort(secondHalf);

            //merge 1st half with 2nd half
            return merge(firstHalf,secondHalf,list);
        }
        return null;
    }

    private static int[] merge(int[] list1, int[] list2, int[] temp){
        int c1=0; //current index in list 1
        int c2=0; //current index in list 2
        int c3=0; //current index in list 3

        while (c1<list1.length && c2<list2.length){
            if(list1[c1]<list2[c2])
                temp[c3++]=list1[c1++];
            else
                temp[c3++]=list2[c2++];
        }

        while (c1<list1.length)
            temp[c3++]=list1[c1++];

        while (c2<list2.length)
            temp[c3++]=list2[c2++];

        return temp;
    }
}