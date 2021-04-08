package com.yzc.algorithm;

public class MergeSort {
    public static void main(String[] args) {
        int[] a = { 49, 38, 65, 97, 76, 13, 27, 50 };
        mergeSort(a,0,a.length-1);
        System.out.println("排好序的数组：");
        for (int e : a)
            System.out.print(e+" ");
    }

    private static void mergeSort(int[] a, int start, int end) {
        if(start>=end){
            return;
        }
        int mid = start+(end-start)/2;
        mergeSort(a,start,mid);
        mergeSort(a,mid+1,end);
        merge(a,start,mid,end);


    }

    private static void merge(int[] a, int left, int mid, int right) {
        int[] path = new int[a.length];
        int p1 = left;
        int p2 = mid+1;
        int index = left;
        while(p1<=mid&&p2<=right){
            path[index++] = a[p1]<a[p2]?a[p1++]:a[p2++];
        }
        while(p1<=mid){
            path[index++] = a[p1++];
        }
        while(p2<=right){
            path[index++] = a[p2++];
        }
        for(int i=left;i<=right;i++){
            a[i] = path[i];
        }
    }

}
