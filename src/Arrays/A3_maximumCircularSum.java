package Arrays;

import java.util.Scanner;

public class A3_maximumCircularSum {
    static Scanner scn = new Scanner(System.in);
    public static void main(String[] args) {
        int n = scn.nextInt();
        for (int i = 0; i < n; i++) {
            int[] array = takeInput();
            int sum1 = kadaneAlgo(array);
            int sum2 = cumulativeSum(array) - smallestSumSubarr(array);

            System.out.println(Math.max(sum1, sum2));
        }
    }

    public static int cumulativeSum(int[] arr){
        int sum=0;
        for (int j : arr) {
            sum += j;
        }
        return sum;
    }

    static int kadaneAlgo(int a[]){
        int size = a.length;
        int max_so_far = Integer.MIN_VALUE, max_ending_here = 0;

        for (int i = 0; i < size; i++)
        {
            max_ending_here = max_ending_here + a[i];
            if (max_so_far < max_ending_here)
                max_so_far = max_ending_here;
            if (max_ending_here < 0)
                max_ending_here = 0;
        }
        return max_so_far;
    }

    static int smallestSumSubarr(int arr[]){
        int n = arr.length;
        int min_ending_here = 2147483647;
        int min_so_far = 2147483647;

        for (int i = 0; i < n; i++)
        {
            if (min_ending_here > 0)
                min_ending_here = arr[i];
            else
                min_ending_here += arr[i];

            min_so_far = Math.min(min_so_far,
                    min_ending_here);
        }
        return min_so_far;
    }


    public static int[] takeInput(){
        int n = scn.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = scn.nextInt();
        }
        return arr;
    }
}
