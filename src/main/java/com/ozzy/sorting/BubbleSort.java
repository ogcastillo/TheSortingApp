package com.ozzy.sorting;

public class BubbleSort {

    public static int[] sort(int[] unsortedArray){
        boolean sorted;
        int currentPos;
        int nextPos;

        do{
            sorted = true;
            for (int i = 0; i < unsortedArray.length-1; i++) {
                currentPos = unsortedArray[i];
                if (i == unsortedArray.length-1){
                    break;
                }else{
                    nextPos = unsortedArray[i+1];
                }

                if (currentPos > nextPos){
                    unsortedArray[i]=nextPos;
                    unsortedArray[i+1]=currentPos;
                    sorted=false;
                }

            }



        }while(!sorted);
        return unsortedArray;
    }
}
