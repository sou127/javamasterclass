package Arrays;

import java.util.Scanner;

public class arrayTemplate {
    static Scanner scn = new Scanner(System.in);

    public static void main(String[] args) {
        int[] array = takeInput();
        display(array);
        System.out.println("Max: " + maxInArray(array));
    }

    public static int[] takeInput(){
        System.out.println("Size of Array: ");
        int n = scn.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            System.out.print("Enter " + i + "th element:");
            arr[i] = scn.nextInt();
        }
        return arr;
    }

    public static void display(int[] arr){
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }
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
}
