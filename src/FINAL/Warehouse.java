package FINAL;

import java.util.Arrays;
import java.util.Collections;


public class Warehouse {
    static int cost;

    public static void main(String[] args) {
         int maxlimit=1000;
        Integer[] capacity=new Integer[maxlimit];

        for(int i=0;i<capacity.length;i++)
            capacity[i]=i; //0-999

        Collections.shuffle(Arrays.asList(capacity));

        //6a
        System.out.println(linearSearch(capacity, 455)+" minutes to search");

        //6b
        System.out.println("Total cost: "+binarySearch(bubbleSort(capacity),5)+" minutes");


        //6c
        Integer[] half_capacity=new Integer[maxlimit/2];
        for(int i=0;i<half_capacity.length;i++)
            half_capacity[i]=i;
        Collections.shuffle(Arrays.asList(half_capacity));


        int time1=linearSearch(half_capacity,100);
        System.out.println("Total Time: "+time1);
        int time2=binarySearch(bubbleSort(half_capacity),100);
        System.out.println("Total Time: "+time2);

        if(time1>time2)
            System.out.println("Binary search + bubble sort is more efficient");

        if(time1<time2)
            System.out.println("Linear search is more efficient");


    }
    //6a
    public static int linearSearch(Integer[] list, int key){
        int start=0;
        for(int i=0;i<list.length;i++){
            start+=15;
            if(key==list[i]){
                System.out.println("position of parcel: "+i);
                break;
            }
        }

        return start/60;
    }

    //6b
    public static int binarySearch(Integer[] list, int key){
        int low=0;
        int high=list.length-1;

        while (high>=low){
            int mid=(high+low)/2;
            if(key<list[mid]){
                cost+=15;
                high=mid-1;
            }

            else if(key==list[mid]){
                cost+=15;
                System.out.println("position of parcel: "+mid);
                break;
            }

            else
                low=mid+1;
        }

        return cost/60;
    }

    public static Integer[] bubbleSort(Integer[] list){
        boolean needNextPass=true;
        cost=0;
        for(int i=1;i<list.length && needNextPass;i++){
            needNextPass=false;

            for (int j=0;j<list.length-i ;j++){
                if(list[j]>list[j+1]){

                    int temp=list[j];
                    list[j]=list[j+1];
                    list[j+1]=temp;
                    cost++;
                    needNextPass=true;
                }
            }
        }
        return list;
    }
}
