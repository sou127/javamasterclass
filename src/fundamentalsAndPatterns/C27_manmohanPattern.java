package fundamentalsAndPatterns;

import java.util.Scanner;

public class C27_manmohanPattern {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int row = 1,cst,nst = 1;

        while(row<=n){

            for(cst = 1; cst <= nst; cst++){
                if(row==1)
                    System.out.print(row);
                else {
                    int val = row - 1;
                    if(cst == 1 || cst == nst) {
                        System.out.print(row - 1);
                    }else{
                        System.out.print("0");
                    }
                }
            }
            System.out.println();

            nst++;
            row++;
        }
    }
}
