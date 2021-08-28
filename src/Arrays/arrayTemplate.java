package Arrays;

import java.util.Scanner;

public class arrayTemplate {
    static Scanner scn = new Scanner(System.in);

    public static void main(String[] args) {
        /*
        int[] array = takeInput();
        display(array);
        System.out.println("Max: " + maxInArray(array));
        System.out.println("Look for: ");
        int lookFor = scn.nextInt();
        System.out.println("Linear Search at " + linSearch(array,lookFor) + "th element");
        System.out.println("Binary Search at " + binSearch(array,lookFor) + "th element");

        insertionSort(array);
        display(array);
        bubbleSort(array);
        display(array);
        selSort(array);
        display(array);

        System.out.println("Lower Bound of 2 is " + lowerBound(array,2));
        System.out.println("Upper Bound of 2 is " + upperBound(array,2));
        */
        spiralPattern();

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

    public static void insertionSort(int[] arr){
        for (int counter = 1; counter <= arr.length-1; counter++) {
            int val = arr[counter];
            int j=counter-1;
            while(j>=0 && arr[j]>val){
                arr[j+1]=arr[j];
                j--;
            }
            arr[j+1]=val;
        }
    }

    public static int lowerBound(int[] arr, int item){
        int low = 0, high = arr.length;
        int ans=-1;
        while(low<=high){
            int mid = (low+high)/2;
            if(arr[mid]>item){
                high=mid-1;
            }else if(arr[mid]<item){
                low=mid+1;
            }else{
                ans=mid;
                high=mid-1;
            }
        }
        return ans;
    }

    public static int upperBound(int[] arr, int item){
        int low = 0, high = arr.length;
        int ans=-1;
        while(low<=high){
            int mid = (low+high)/2;
            if(arr[mid]>item){
                high=mid-1;
            }else if(arr[mid]<item){
                low=mid+1;
            }else{
                ans=mid;
                low=mid+1;
            }
        }
        return ans;
    }

    public static void spiralPattern(){
        int[][] arr = {{11,12,13,14,67},{21,22,23,24,77},{31,32,33,34,87},{41,42,43,44,97}};
        int top=0, bottom=arr.length-1, left=0, right=arr[top].length-1, count=(bottom+1)*(right+1), dir=1;

        while(left<=right && top<=bottom){
            if(count>0){
                if(dir==1){
                    for (int i = left; i <= right; i++) {
                        System.out.print(arr[top][i] + " ");
                        count--;
                    }
                    top++;
                    dir=2;
                }else if(dir==2){
                    for (int i = top; i <= bottom; i++) {
                        System.out.print(arr[i][right] + " ");
                        count--;
                    }
                    right--;
                    dir=3;
                }else if(dir==3){
                    for (int i = right; i >= left; i--) {
                        System.out.print(arr[bottom][i] + " ");
                        count--;
                    }
                    bottom--;
                    dir=4;
                } else if(dir==4){
                    for (int i = bottom; i >= top; i--) {
                        System.out.print(arr[i][left] + " ");
                        count--;
                    }
                    left++;
                    dir=1;
                }
            }

        }


    }
}
