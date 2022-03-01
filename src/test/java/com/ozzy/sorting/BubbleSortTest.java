package com.ozzy.sorting;

import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import java.util.Arrays;

public class BubbleSortTest {

    private BubbleSort sut;

    @Before
    public void setupTest(){
        sut = new BubbleSort();
    }

    @After
    public void tearDownTest(){
        sut = null;
    }

    @Test
    public void test_BubbleSortMinNumberSorted(){
        //Arrange
        int max = 9;
        int min = 0;
        int maxNumber = 9;
        int minNumber = 0;
        int[] testArray = new int[max];

        for (int i= min; i <  testArray.length ; i++){
            if(i == min){
                testArray[i]=minNumber;
            }else{
                int randomNumber = (int) (Math.random() * (maxNumber - minNumber) + minNumber);
                testArray[i]= randomNumber;
            }
        }

        int expectedResult = minNumber;


        //Act
        System.out.println("Unsorted >> " + Arrays.toString(testArray));
        int[] actualResult = sut.sort(testArray);


        //Assert

        System.out.println("Sorted >> " + Arrays.toString(actualResult));
        Assert.assertEquals(expectedResult, actualResult[0]);


    }

    @Test
    public void test_BubbleSortMaxNumberSorted(){
        //Arrange
        int max = 9;
        int maxNumber = 9;
        int minNumber = 0;
        int[] testArray = new int[max];

        for (int i= 0; i <  testArray.length; i++){
            if(i == max-1){
                testArray[i]=maxNumber;
            }else{
                int randomNumber = (int) (Math.random() * (maxNumber - minNumber) + minNumber);
                testArray[i]= randomNumber;
            }
        }

        int expectedResult = maxNumber;

        //Act
        System.out.println("Unsorted >> " + Arrays.toString(testArray));
        int[] actualResult = sut.sort(testArray);

        //Assert

        System.out.println("Sorted >> " + Arrays.toString(actualResult));
        Assert.assertEquals(expectedResult, actualResult[actualResult.length-1]);


    }

}
