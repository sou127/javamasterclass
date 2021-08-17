package fundamentalsAndPatterns;

import java.util.Scanner;

public class A6_ganeshaPattern {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int nst1=1,nst2=n/2+1,nst3=0;
        int nsp1=n/2-1, nsp2=0;
        int row=1;

        while(row<=n){

            if(row==1){
                nst2=n/2+1;
            }else if(row<=n/2){
                nsp1=n/2-1;
                nst2=1;
            }else if(row==n/2+1){
                nst1=n/2;
                nsp1=0;
                nst2=n/2+1;
            }else if(row>n/2+1 && row<n){
                nst1=0;
                nsp1=n/2;
                nst2=1;
                nsp2=n/2-1;
                nst3=1;
            }else if(row==n){
                nst1=n/2;
                nsp1=0;
            }

            //stars work 1
            int cst=1;
            for(;cst<=nst1;cst++) {
                System.out.print("*");
            }

            //spaces work 1
            for(int csp=1;csp<=nsp1;csp++) {
                System.out.print(" ");
            }

            //stars work 2
            cst=1;
            for(;cst<=nst2;cst++) {
                System.out.print("*");
            }

            //spaces work 2
            for(int csp=1;csp<=nsp2;csp++) {
                System.out.print(" ");
            }

            //stars work 3
            cst=1;
            for(;cst<=nst3;cst++) {
                System.out.print("*");
            }

            System.out.println();


            row++;
        }
    }
}
