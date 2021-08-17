package fundamentalsAndPatterns;

import java.util.Scanner;

public class B10_pascalsTriangle {

    public static long factorial(int number) {
        long result = 1;

        for (int factor = 2; factor <= number; factor++) {
            result *= factor;
        }

        return result;
    }

    static long combination(int a, int b){
        if (a==1 && b==1)
            return 1;
        else
            return factorial(a)/(factorial(b)*factorial(a-b));
    }

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int row=1;
        int nsn=1;
        int val=0;

        while(row<=n){
            val=row-1;

            //numbers work
            for(int csn=0;csn<nsn;csn++){
                System.out.print(combination(val, csn) + "\t");
            }

            System.out.println();
            nsn++;
            row++;
        }

    }
}
