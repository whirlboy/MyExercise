package com.yzc.algorithm;
/**
 * a.将无需序列构建成一个堆，根据升序降序需求选择大顶堆或小顶堆;
 *
 * 　　b.将堆顶元素与末尾元素交换，将最大元素"沉"到数组末端;
 *
 * 　　c.重新调整结构，使其满足堆定义，然后继续交换堆顶元素与当前末尾元素，反复执行调整+交换步骤，直到整个序列有序。
*/


public class HeapSort {

    public static void main(String[] args) {
        int[] nums = {1,5,4,3,6,9,8,2};
        heapSort(nums);
        for (int num : nums) {
            System.out.print(num);
        }
    }


    public static void heapSort(int[] arr){
        for(int i=arr.length/2-1;i>=0;i--){
            adjustHeap(arr,i,arr.length);
        }
        for(int j=arr.length-1;j>=0;j--){
            swap(arr,0,j);
            adjustHeap(arr,0,j);
        }
    }

    private static void adjustHeap(int[] arr, int i,int length) {
        int temp = arr[i];
        for(int k=2*i+1;k<length;k=k*2+1){
            if(k+1<length&&arr[k]<arr[k+1]){
                k++;
            }
            if(arr[k]>arr[i]){
                arr[i] = arr[k];
                i = k;
            }else{
                break;
            }
            arr[i] = temp;
        }
    }

    private static void swap(int[] arr,int i,int j){
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }


}
