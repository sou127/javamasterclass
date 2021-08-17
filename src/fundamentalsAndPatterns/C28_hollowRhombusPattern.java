package fundamentalsAndPatterns;

import java.util.Scanner;

public class C28_hollowRhombusPattern {
        public static void main(String args[]) {
            Scanner scn = new Scanner(System.in);
            int n=scn.nextInt();
            int nst=1;
            int nsp=n-1;
            int nsp2=n-2;
            int row=1;
            while(row<=n){
                //spaces work
                for(int csp=1;csp<=nsp;csp++){
                    System.out.print(" ");
                }
                //stars work
                int cst=1;
                if(row==1 || row==n) {
                    cst = nst - n + 1;
                }else{
                    cst=1;
                }
                for(;cst<=nst;cst++){
                    System.out.print("*");
                }
                //spaces work
                for(int csp=1;csp<=nsp2;csp++){
                    System.out.print(" ");
                }
                //stars work
                if(row!=1 && row!=n){
                    for (cst = 1; cst <= 1; cst++) {
                        System.out.print("*");
                    }
                }


                System.out.println();
                nsp--;
                row++;
            }
        }
}
