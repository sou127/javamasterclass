package fundamentalsAndPatterns;

import java.util.Scanner;

public class A4_pythagorasTriplet {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        long n = scn.nextInt();
        if(n<=2){
            System.out.println(-1);
        }else if(n%2==0){
            long var = n*n/4;
            System.out.print(var-1 + " ");
            System.out.print(var+1);
        }else{
            long var = n*n + 1;
            System.out.print(var/2-1 + " ");
            System.out.print(var/2);
        }
    }
}
