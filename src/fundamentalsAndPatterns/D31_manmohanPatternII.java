package fundamentalsAndPatterns;

import java.util.Scanner;

public class D31_manmohanPatternII {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int row = 1, cst, nst = 1;

        while (row <= n) {
            for (cst = 1; cst <= nst; cst++) {
                if (row%2!=0)
                    System.out.print(1);
                else {
                    if (cst == 1 || cst == nst) {
                        System.out.print(1);
                    } else {
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
