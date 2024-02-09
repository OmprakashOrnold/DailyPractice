package com.dsa.practice;

import java.util.Arrays;

public class BubbleSort {
    public static void main(String[] args) {
        int nums[]= {3,4,5,6,1,7,9,2};
        System.out.println("Before Sorting ------");
        System.out.println( Arrays.toString(nums));

        bubbleSort(nums);

        System.out.println("After Sorting ------");
        System.out.println( Arrays.toString(nums));
    }

    private static void bubbleSort(int[] nums) {
        int temp;
        int size=nums.length;
        for(int i = 0; i < size; i++) {
            for (int j = 0; j < size-i-1; j++) {
                if(nums[j]>nums[j+1]){
                    temp=nums[j];
                    nums[j]=nums[j+1];
                    nums[j+1]=temp;
                }
            }
        }
    }
}
