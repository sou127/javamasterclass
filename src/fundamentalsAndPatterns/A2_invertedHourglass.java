package fundamentalsAndPatterns;

import java.util.*;

public class A2_invertedHourglass {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int rn=2*n+1;
        int nst=1;
        int nsp=2*n-1;
        int row=1;
        int val=n;

        while(row<=rn){

            //stars work
            for(int cst=1;cst<=nst;cst++) {
                System.out.print(val + " ");
                val--;
            }

            //spaces work
            for(int csp=1;csp<=nsp;csp++) {
                System.out.print("  ");
            }

            //stars work
            int cst=1;
            for (; cst <= nst; cst++) {
                val++;
                if(val!=0)
                    System.out.print(val + " ");
            }

            System.out.println();
            if(row<=rn/2) {
                nst += 1;
                nsp -= 2;
            }else {
                nst -= 1;
                nsp += 2;
            }
            row++;
            val=n;
        }
    }
}
