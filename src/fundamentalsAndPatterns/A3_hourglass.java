package fundamentalsAndPatterns;

import java.util.*;

public class A3_hourglass {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int rn=2*n+1;
        int nst=2*n+1;
        int nsp=0;
        int row=1;
        int val=n;

        while(row<=rn){

            //spaces work
            for(int csp=0;csp<nsp;csp++) {
                System.out.print("  ");
            }

            //stars work
            if(row<=rn/2+1) {
                val = n - row + 1;
                for (int cst = 1; cst <= nst; cst++) {
                    System.out.print(val + " ");
                    if (cst <= nst / 2)
                        val--;
                    else
                        val++;
                }
            }else{
                val = row - n - 1;
                for (int cst = 1; cst <= nst; cst++) {
                    System.out.print(val + " ");
                    if (cst <= nst / 2)
                        val--;
                    else
                        val++;
                }
            }


            //updating
            System.out.println();
            if(row<=rn/2) {
                nst -= 2;
                nsp += 1;
            }else {
                nst += 2;
                nsp -= 1;
            }
            row++;
        }
    }
}
