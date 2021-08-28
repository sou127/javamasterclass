package Arrays;

import java.util.Scanner;

public class A4_maximumSubarraySum {
    static Scanner scn = new Scanner(System.in);
    public static void main(String[] args) {
        int n = scn.nextInt();
        for (int i = 0; i < n; i++) {
            int[] array = takeInput();
            int ans = kadaneAlgo(array);
            System.out.println(ans);
        }
    }

    public static int kadaneAlgo(int[] arr){
        int max_so_far = Integer.MIN_VALUE;
        int max_current = 0;

        for (int j : arr) {
            max_current = max_current + j;
            if (max_current > max_so_far)
                max_so_far = max_current;
            if (max_current < 0)
                max_current = 0;
        }
        return max_so_far;
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
