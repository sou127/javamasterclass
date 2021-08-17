package fundamentalsAndPatterns;

import java.util.Scanner;

public class A1_doubleSidedArrow {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int nst=1;
        int nsp=n-1;
        int nsp2=0;
        int row=1;
        int val=1;

        while(row<=n){
            val=row;

            //spaces work
            for(int csp=1;csp<=nsp;csp++) {
                System.out.print("  ");
            }

            //stars work
            if(row>n/2){
                val=n-row+1;
            }
            for(int cst=1;cst<=nst;cst++) {
                System.out.print(val + " ");
                val--;
            }


            //spaces work
            if(row==2 || row==n-1)
                nsp2=1;
            for (int csp = 1; csp <= nsp2; csp++) {
                System.out.print("  ");
            }

            //stars work
            val=1;
            int cst=1;
            for (; cst <= nst; cst++) {
                if (nst!=1)
                    System.out.print(val + " ");
                val++;
            }

            System.out.println();
            if(row<=n/2) {
                nst += 1;
                nsp -= 2;
                nsp2 += 2;
            }else {
                nst -= 1;
                nsp += 2;
                nsp2 -= 2;
            }
            row++;
        }
    }
}
