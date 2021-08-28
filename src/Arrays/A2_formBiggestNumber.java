package Arrays;

import java.util.Scanner;

public class A2_formBiggestNumber {

    static Scanner scn = new Scanner(System.in);

    public static void main(String[] args) {
        int n = scn.nextInt();

        for (int i = 0; i < n; i++) {
            int[] arr = takeInput();
            formBiggestNumber(arr);
            display(arr);
        }

    }

    public static void formBiggestNumber(int[] arr){
        int token = 10;

        for (int counter = 0; counter < arr.length-1; counter++) {
            for (int j = 0; j < arr.length - 1 - counter; j++) {
                if(reverseNum(arr[j])%token<reverseNum(arr[j+1])%token){
                    swap(arr, j, j+1);
                }
                token*=10;
            }
        }

        for (int counter = 0; counter < arr.length-1; counter++) {
            for (int j = 0; j < arr.length - 1 - counter; j++) {
                int tempR = reverseNum(arr[j]);
                int tempNextR = reverseNum(arr[j+1]);
                if(tempR % 10 < tempNextR % 10){
                    swap(arr,j,j+1);
                }
            }
        }
    }

    public static void swap(int[] arr, int i, int j){
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }

    public static int reverseNum(int n){
        int i;
        int temp = 0;
        for(i=n;i!=0;i/=10){
            int check = i%10;
            temp = temp*10 + check;
        }
        return temp;
    }

    public static void display(int[] arr){
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i]);
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
