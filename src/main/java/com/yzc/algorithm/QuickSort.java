package com.yzc.algorithm;




public class QuickSort {
    public static void main(String[] args) {
        int[] nums = {1,5,4,3,6,9,8,2};
        quickSort(nums,0,nums.length-1);
        for (int num : nums) {
            System.out.print(num);
        }

    }

    public static void quickSort(int[] nums,int left,int right){
        while(left>right){
            return;
        }
        int i = left;
        int j = right;
        int index = nums[i];
        while(i<j){
            while(i<j&&index>nums[j]){
                j--;
            }
            if(i<j){
                nums[i++] = nums[j];
            }
            while(i<j&&index<nums[i]){
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
