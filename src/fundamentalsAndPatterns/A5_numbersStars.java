package fundamentalsAndPatterns;

import java.util.Scanner;

public class A5_numbersStars {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int nst=n-1;
        int nsn=1;
        int row=1;
        int val=1;

        while(row<=n){
            val=1;

            //numbers work
            for(int cst=1;cst<=nsn;cst++) {
                System.out.print(val + " ");
                val++;
            }

            //stars work
            int cst=1;
            for (; cst <= nst; cst++) {
                System.out.print("* ");
            }

            System.out.println();
            nst -= 1;
            nsn += 1;
            row++;
        }
    }
}
