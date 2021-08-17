package fundamentalsAndPatterns;

import java.util.Scanner;

public class B13_isArmstrong {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int sum = 0;
        int count = 0;
        for(int i = n;i > 0; i/=10){
            count++;
        }
        for(int i = n;i > 0; i/=10){
            int check = i%10;
            sum += Math.pow(check, count);
        }
        if(sum == n){
            System.out.println("true");
        }else{
            System.out.println("false");
        }
    }
}
