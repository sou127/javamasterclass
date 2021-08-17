package fundamentalsAndPatterns;

import java.util.Scanner;

public class C20_hollowDiamond {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int nst,nsp;
        if(n%2==0){
            nsp=2;
            nst = n/2;
        }else{
            nst = n/2+1;
            nsp=1;
        }
        int cst,csp;
        int row = 1;

        while(row<=n){

            if(row == 1 || row == n){
                for(cst=1;cst<=n;cst++){
                    System.out.print("*\t");
                }
            }else{
                for(cst=1;cst<=nst;cst++){
                    System.out.print("*\t");
                }
                for(csp=1;csp<=nsp;csp++){
                    System.out.print(" \t");
                }
                for(cst=1;cst<=nst;cst++){
                    System.out.print("*\t");
                }
            }

            System.out.println();
            if(row != 1 && row != n){
                if(n%2==0){
                    if (row < n / 2) {
                        nsp += 2;
                    } else if (row == n / 2) {
                        nsp = nsp;
                    } else {
                        nsp -= 2;
                    }
                }else{
                    if (row <= n / 2) {
                        nsp += 2;
                    } else {
                        nsp -= 2;
                    }
                }
            }
            if (row <= n / 2) {
                nst--;
            } else {
                nst++;
            }
            if(n%2 == 0){
                if(row==n/2){
                    nst=1;
                }
            }
            row++;
        }
    }
}
