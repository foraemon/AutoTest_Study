package com.course.httpclient.demo;

import org.testng.annotations.Test;

/**
 * Created by zero on 2020-05-21
 */
public class JavaAlgorithm {

    int[]  arr=new int[]{1,3,4,2,5,7,8,9,0};
    @Test
    public void algorithm(){

        int n = arr.length;
        for(int i = 0;i<n-1;i++){
            for(int j = i+1;j < n;j++){
                if(arr[j] < arr[i]){
                    arr[i] = arr[j] + arr[i];
                    arr[j] = arr[i] - arr[j];
                    arr[i] = arr[i] - arr[j];
                }
            }
        }
        for (int i = 0;i < arr.length; i++ ){
            System.out.println(arr[i]);
        }
    }
    @Test
    public void selectSort(){
        int n = arr.length;
        for (int i = 0; i < n-1; i++ ){
            int k = i;
            for (int j = i+1; j < n; j++ ){
                if (arr[j] < arr[j]){
                    k = j;
                }
            }
                int temp = arr[i];
                arr[i] = arr[k];
                arr[k] = temp;
        }
        for (int i = 0;i < arr.length; i++ ){
            System.out.println(arr[i]);
        }

    }

}
