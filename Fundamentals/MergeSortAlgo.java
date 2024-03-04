package Fundamentals;

import java.util.ArrayList;
import java.util.Scanner;

class Solution{

    public static void MergeSort(int arr[],int low,int high){
        if(low>=high){
            return;
        }
        int mid = (low+high)/2;
        MergeSort(arr,low,mid); // left arr
        MergeSort(arr,mid+1,high); // right arr
        Merge(arr,low,mid,high);
    }
    
    private static void Merge(int arr[],int low,int mid ,int high){
        ArrayList<Integer> temp= new ArrayList<>();
        int left=low;  //start from low
        int right=mid+1; //start from mid+1
        while(left<=mid && right<=high){
            if(arr[left]<=arr[right]){
                temp.add(arr[left]);
                left++;
            }
            else{
                temp.add(arr[right]);
                right++;
            }
        }
            //if elements of left arr are still left when right is completed(exhausted)
            while(left<=mid){
                temp.add(arr[left]);
                left++;
            }
            //if elements of right arr are still left when right is completed(exhausted)
            while(right<=high){
                temp.add(arr[right]);
                right++;
            }
            for(int i=low;i<=high;i++){
                arr[i]=temp.get(i-low);   // as for temp it will start with 0 so,
                //arr[low] = temp[low-low] ie.0
                //arr[low+1] = temp[(low+1)-low] ie.1
            }
    }
}

public class MergeSortAlgo {
    public static void main(String[] args) {
        int n = 7;
        int arr[] = { 9, 4, 7, 6, 3, 1, 5 };
        System.out.println("Before sorting array: ");
        for (int i = 0; i < n; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
        
        Solution.MergeSort(arr, 0, n - 1);
        
        System.out.println("After sorting array: ");
        for (int i = 0; i < n; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
	}
}
