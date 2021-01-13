import java.util.*;
// package Week9;
/*
Q1. You are provided with an array of numbers and the
task is to find triplets in the array which adds up to a
given value. If there is such a triplet present in array,
then print the triplet

Example-1:
Input: array = {12, 3, 4, 1, 6, 9}, sum = 24;
Output: 12, 3, 9
Explanation: There is a triplet (12, 3 and 9) present
in the array whose sum is 24.

Example-2:
Input: array = {1, 2, 3, 4, 5}, sum = 9
Output: 5, 3, 1
Explanation: There is a triplet (5, 3 and 1) present
in the array whose sum is 9.

-->n^2(log n)
*/

public class Q1 {
    public static void main(String[] args) {
        // TEST CASE 1
        int arr1[]={12, 3, 4, 1, 6, 9};
        int sum1=24;
        // System.out.println("Hello");

        int result1[]=threeSum(arr1, sum1);
        for(int i=0;i<result1.length;i++)
        {
            System.out.print(result1[i]+" ");
        }
        System.out.println();

        // TEST CASE 2
        int arr2[]={1, 2, 3, 4, 5};
        int sum2=9;

        int result2[]=threeSum(arr2, sum2);
        for(int i=0;i<result2.length;i++)
        {
            System.out.print(result2[i]+" ");
        }
        
    }   

    public static int[] threeSum(int arr[],int result) {

        Arrays.sort(arr);
        for(int i=0;i<arr.length-2;i++)
        {
            int j=i+1;
            int k=arr.length-1;
            while (j<k) {
         
            int sum=arr[i]+arr[j]+arr[k];
            if(sum == result) 
            {
                return new int[]  {arr[i],arr[j],arr[k]};
             } 
              else if(sum>result)
              {
               k--;   
              }  
              j++;
              
            }
        }

        return new int[]{};// no triplet

    }

}

    
