package Arrays;

import java.util.Scanner;

public class A1_lineartimeSort {

    static Scanner scn = new Scanner(System.in);

    public static void main(String[] args) {
        int[] arr = takeInput();

        System.out.println("Before sorting: ");
        display(arr);
        linearTimeSort(arr);
        System.out.println("After sorting: ");
        display(arr);

    }
    public static void linearTimeSort(int[] arr){
        int low, mid, high;
        low=mid=0;
        high=arr.length-1;
        while(mid<=high){
            if(arr[mid]==0){
                swap(arr,low,mid);
                low++;
                mid++;
            }else if(arr[mid]==1){
                mid++;
            }else{
                swap(arr,mid,high);
                high--;
            }
        }
    }

    public static void swap(int[] arr, int i, int j){
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }

    public static void display(int[] arr){
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }

    public static int[] takeInput(){
        int n = scn.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i]=scn.nextInt();
        }
        return arr;
    }

}
