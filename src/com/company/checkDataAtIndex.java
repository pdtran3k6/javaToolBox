package com.company;

import java.math.BigDecimal;

public class checkDataAtIndex {

    public static void main(String[] args) {
	// write your code here
        // variable declaration
        int[] array = new int[3]; // array.length = 5
        int emptySlots = 0;
        int filledSlots = 0;

        for (int i = 0; i < array.length; i++) {
            //Initialize every elements in the array to -1
            array[i] = -1;
        }

        //Assign values to each index
        array[0] = 23;
        array[1] = 3;
        array[2] = 10;

        for (int i = 0; i < array.length; i++) {
            //Count empty slots and filled slots
            if (array[i] == -1) {
                emptySlots++;
            } else {
                filledSlots++;
            }

            //Check if the array is empty
            if (emptySlots == array.length) {
                System.out.println("The array is empty");
            }

            //Check if the array is full
            if (filledSlots == array.length) {
                System.out.println("The array is full");
            }
        }
    }
}
