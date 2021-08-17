package fundamentalsAndPatterns;

import java.util.ArrayList;
import java.util.Scanner;

public class B17_fibonacciPattern {

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int nst=1;
        int row=1;
        int van = n*(n+1)/2;
        ArrayList<Integer> values = new ArrayList<Integer>();

        values.add(0);
        values.add(1);

        for(int i=2;i<=van;i++){
            values.add(values.get(i-1) + values.get(i-2));
        }

        int val = 0;
        while(row<=n){

            for(int cst=1;cst<=nst;cst++){
                System.out.print(values.get(val) + " ");
                val++;

            }
            System.out.println();
            nst++;
            row++;
        }
        System.out.println(values);
    }
}
