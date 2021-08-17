package fundamentalsAndPatterns;

import java.util.Scanner;

public class A9_incDecSequence {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int first = scn.nextInt();
        boolean isValid = true;
        boolean isDecreasing = true;

        while(n!=1) {
            int second = scn.nextInt();
            if (first == second) {
                isValid = false;
                break;
            } else if (first < second) {
                isDecreasing = false;
            } else if(!isDecreasing && first > second) {
                isValid = false;
                break;
            }
            first = second;
            n--;
        }
        System.out.println(isValid);
    }
}





