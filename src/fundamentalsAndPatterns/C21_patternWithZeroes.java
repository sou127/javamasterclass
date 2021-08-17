package fundamentalsAndPatterns;

import java.util.Scanner;

public class C21_patternWithZeroes {
    public static void main(String args[]) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int nst = 1;
        int row = 1;
        int val=0;

        while(row<=n){
            val=0;
            //stars work
            for(int cst=1;cst<=nst;cst++){
                if(cst==1 || cst==nst)
                    val=row;
                else
                    val=0;
                System.out.print(val + "\t");
            }

            System.out.println();
            nst++;
            row++;
        }
    }
}
