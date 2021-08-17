package fundamentalsAndPatterns;

import java.util.Scanner;

public class B11_fahrenheitToCelsius {
    public static void main(String args[]) {
        Scanner scn = new Scanner(System.in);
        int fmin = scn.nextInt();
        int fmax = scn.nextInt();
        int step = scn.nextInt();
        int current = fmin;

        while(current<=fmax){
            System.out.println(current + "\t" + (int)((5.0/9.0)*(current-32.0)));
            current+=step;
        }
    }
}
