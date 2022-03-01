package com.ozzy;

import com.ozzy.sorting.BubbleSort;

import java.util.ArrayList;
import java.util.Arrays;

public class TheSortingAppMain {

    public static void main (String[] args){
       int[] array = new int[100];
        int maxNumber = 100;
        int minNumber = 1;

        for (int i = 0; i < array.length; i++) {
            array[i]= (int) (Math.random() * (maxNumber - minNumber)+ minNumber);
        }

        System.out.println("Unsorted >> "+Arrays.toString(array));

        BubbleSort.sort(array);
        System.out.println("Sorted >> "+Arrays.toString(array));

    }

}
