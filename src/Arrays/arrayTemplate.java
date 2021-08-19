package Arrays;

import java.util.Scanner;

public class arrayTemplate {
    static Scanner scn = new Scanner(System.in);

    public static void main(String[] args) {
        int[] array = takeInput();
        display(array);
        System.out.println("Max: " + maxInArray(array));
        System.out.println("Look for: ");
        int lookFor = scn.nextInt();
        System.out.println("Linear Search at " + linSearch(array,lookFor) + "th element");
        System.out.println("Binary Search at " + binSearch(array,lookFor) + "th element");

        bubbleSort(array);
        display(array);
        selSort(array);
        display(array);

    }

    public static int[] takeInput(){
        System.out.println("Size of Array: ");
        int n = scn.nextInt();
        int[] arr = new int[n];
        System.out.println("Enter Array Elements: ");
        for (int i = 0; i < n; i++) {
            arr[i] = scn.nextInt();
        }
        return arr;
    }

    public static void display(int[] arr){
        for (int j : arr) {
            System.out.print(j + " ");
        }
        System.out.println();
    }

    public static int maxInArray(int[] arr){
        int max = Integer.MIN_VALUE;

        for (int j : arr) {
            if (j > max) {
                max = j;
            }
        }
        return max;
    }

    public static int linSearch(int[] arr,int item){
        for (int i = 0; i < arr.length; i++) {
            if(arr[i]==item)
                return i;
        }
        return -1;
    }

    public static int binSearch(int[] arr, int item){
        int low = 0;
        int high = arr.length;
        int mid = (low+high)/2;
        while(low<=high){
            if(arr[mid]<item){
                low=mid+1;
            }else if(arr[mid]>item){
                high=mid-1;
            }else{
                return mid;
            }
            mid = (low+high)/2;
        }
        return -1;
    }

    public static void bubbleSort(int[] arr){
        for (int counter = 0; counter < arr.length-1; counter++) {
            for (int j = 0; j < arr.length - 1 - counter; j++) {
                if(arr[j]>arr[j+1]){
                    swap(arr, j, j+1);
                }
            }
        }
    }

    public static void selSort(int[] arr){
        for (int counter = 0; counter < arr.length-1; counter++) {
            int min = counter;
            for (int i = counter+1; i < arr.length; i++) {
                if(arr[i]<arr[min])
                    min=i;
            }
            swap(arr,min,counter);
        }
    }

    public static void swap(int[] arr, int i, int j){
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }



}
