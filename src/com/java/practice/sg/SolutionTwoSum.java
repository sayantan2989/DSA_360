package com.java.practice.sg;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

/**
 * @author sayantanganguly
 * @since 12/04/25
 */
public class SolutionTwoSum {

    public static void main(String[] args) {
        /*
        Input: arr[] = {2,7,11,15};
        Target: 9
        Output: [0,1]
        Explanation: Because nums[0] + nums[1] == 9, we return [0, 1].
        */

        int[] inputArray = {2,7,11,15};
        int target = 18;

        int[] outputArray = twoSumWithMap(inputArray, target);
        System.out.println(Arrays.toString(outputArray));

    }

    // bruteforce approach

    /**
     * We are using nested loop to figure out the target
     * First loop will start from i=0
     * Nested loop will start from j=i+1
     * Check arr[i]+array[j] == target; return new Array[] {{i, j}}
     * Best case both element
     * Time Complexity O(n~2)
     *
     * @return array with potion of the input array
     */
   public static int[] twoSum(int[] array, int target){
        for (int i = 0; i < array.length; i++){
            int elm = array[i];
            for (int j = i+1; j < array.length; j++){
                if(elm+array[j]==target){
                    return new int[] {i,j};
                }
            }
        }
        return new int[]{0,0};
    }

    /**
     *
     * @param inputArray
     * @param target
     * @return
     */
    public static int[] twoSumWithMap(int[] inputArray, int target){
        Map<Integer, Integer> map = new HashMap<>();
        for(int i = 0; i< inputArray.length; i++){
            if(map.containsKey(target - inputArray[i])){
                return new int[] {map.get(target-inputArray[i]),i}; // get the map with the key = array value and value is position
            }else{
                // added into map with the key = array value and value is position
                map.put(inputArray[i], i);
            }
        }

        return new int[]{-1,-1};
    }

}
