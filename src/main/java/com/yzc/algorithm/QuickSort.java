package com.yzc.algorithm;

public class QuickSort {
    public static void main(String[] args) {
        int[] nums = {1,5,4,3,6,9,8,2};
        quickSort(nums,0,nums.length-1);
        for (int num : nums) {
            System.out.print(num);
        }
    }

    private static void quickSort(int[] nums, int left, int right) {
        if(left>right) return;
        int i = left;
        int j = right;
        int index = nums[i];
        while(i<j){
            while(i<j&&nums[j]>index){
                j--;
            }
            if(i<j){
                nums[i++] = nums[j];
            }
            while(i<j&&nums[i]<index){
                i++;
            }
            if(i<j){
                nums[j--] = nums[i];
            }
            nums[i] = index;
            quickSort(nums,left,i-1);
            quickSort(nums,i+1,right);
        }
    }

}
