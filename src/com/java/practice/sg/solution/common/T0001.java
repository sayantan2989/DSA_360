package com.java.practice.sg.solution.common;

import java.util.ArrayList;
import java.util.Arrays;

/**
 * @author sayantanganguly
 * @created 12/04/25
 * @project DSA_360
 * @file T0001
 * @description : Practise DSA problem
 */
public class T0001 {

    public static void main(String[] args) {

        // Input: arr[] = {12, 10, 9, 45, 2, 10, 10, 45}
        // Output: {12, 10, 9, 45, 2}
        int[] arr = {12, 10, 9, 45, 2, 10, 10, 45};

        ArrayList<Integer> res = findDistinct(arr);
        for (int val : res) {
            System.out.print(val + " ");
        }
    }

    private static ArrayList<Integer> findDistinct(int[] inputArray) {
        ArrayList<Integer> outputArray = new ArrayList<>();
        /**
         * loop through the array, starting element i
         * loop through the inner array[j]
         * if a[i]=a[j], terminate from inner loop
         * else add the item to the new array
         * in this approach we are using for twice hence TC - O(n~2) and SC O(1)
         */
        for(int i = 0; i< inputArray.length; i++){

            int j;
            for (j=0; j<i; j++){
                if(inputArray[i] == inputArray[j]) break;
            }
            if(i == j)outputArray.add(inputArray[i]);
        }

        return outputArray;
    }

    private static ArrayList<Integer> findDistinctUsingSortinhg(int[] inputArray) {
        ArrayList<Integer> outputArray = new ArrayList<>();
        int n = inputArray.length;
        /**
         * loop through the array, starting element i
         * loop through the inner array[j]
         * if a[i]=a[j], terminate from inner loop
         * else add the item to the new array
         * in this approach we are using for twice hence TC - O(n~2) and SC O(1)
         */

        Arrays.sort(inputArray);
        for(int i=0; i<inputArray.length; i++){
            if(i == 0 || inputArray[i] != inputArray[i-1]){
                outputArray.add(inputArray[i]);
            }
        }

        return outputArray;
    }

}
