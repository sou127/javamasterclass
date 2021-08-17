package fundamentalsAndPatterns;

import java.util.Scanner;

public class C29_simpleInput {
    public static void main(String args[]) {
        Scanner scn = new Scanner(System.in);
        int n;
        int sum=0;

        while(sum>=0){
            n=scn.nextInt();
            sum=sum+n;
            if(sum>=0)
                System.out.println(n);
        }
    }
}
