package fundamentalsAndPatterns;

import java.util.*;

public class B16_mountainPattern {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int nst=1;
        int nsp=2*n-3;
        int row=1;
        int val=1;

        while(row<=n){

            //stars work
            for(int cst=1;cst<=nst;cst++) {
                System.out.print(val + "\t");
                val++;
            }

            //spaces work
            for(int csp=1;csp<=nsp;csp++) {
                System.out.print(" \t");
            }

            //stars work
            int cst=1;
            val=row;
            if(nst==n){
                nst=n-1;
                val=row-1;
            }
            for (; cst <= nst; cst++) {
                System.out.print(val + "\t");
                val--;
            }

            System.out.println();
            nst += 1;
            nsp -= 2;
            row++;
            val=1;
        }
    }
}
