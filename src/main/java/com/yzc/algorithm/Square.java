package com.yzc.algorithm;

/** 计算一个数的平方根（字节面试题）
 * 1、mySquareDouble：精确计算，浮点数平方根
 * 2、mySquareInt：取整计算
*/
public class Square {
    private static double e = 10e-10;

    public static void main(String[] args) {
        System.out.println(mySquareDouble(2));
        System.out.println(mySquareInt(8));
    }

    //精确计算，浮点数平方根
    public static double mySquareDouble(int n){
        double left = 1 ;
        double right = n ;
        while(left<right){
            double mid = left+(right-left)/2;
            if(Math.abs(mid*mid-n)<e){
                return mid;
            }else if(mid*mid<n){
                left = mid;
            }else{
                right = mid;
            }
        }
        return 0;
    }

    //取整计算
    public static int mySquareInt(int n){
        if(n==0||n==1) return n;
        int left = 1;
        int right = n;
        while(left<right){
            int mid = left + (right-left+1)/2;
            if(mid>n/mid){
                right = mid-1;
            }else{
                left = mid;
            }
        }
        return left;
    }


}
