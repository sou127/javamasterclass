package fundamentalsAndPatterns;

import java.util.Scanner;

public class B18_trianglePattern {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int nst = 1, nsp=n;
        int cst,csp;
        int row = 1;

        while(row<=n){

            for(csp=1;csp<nsp;csp++){
                System.out.print("  ");
            }
            int val = nst;
            for(cst=1;cst<=2*nst-1;cst++){
                if(cst <= nst) {
                    System.out.print(val + " ");
                    val++;
                }else {
                    --val;
                    System.out.print(val-1 + " ");
                }
            }

            System.out.println();

            nst++;
            nsp--;
            row++;
        }
    }
}
