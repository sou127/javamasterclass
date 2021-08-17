package fundamentalsAndPatterns;

import java.util.Scanner;

public class C26_quadratSolver {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int a = scn.nextInt();
        int b = scn.nextInt();
        int c = scn.nextInt();
        int D = (int) Math.pow(b, 2) - 4 * a * c;
        int root1, root2;

        if(D == 0){
            System.out.println("Real and Equal");
            root1 = (-b)/(2*a);
            System.out.println(root1 + " " + root1);
        }else if(D<0){
            System.out.println("Imaginary");
        }else{
            System.out.println("Real and Distinct");
            root1 = (-b + (int)(Math.sqrt(D)))/(2*a);
            root2 = (-b - (int)(Math.sqrt(D)))/(2*a);
            if(root1 < root2)
                System.out.println((int) root1 + " " + (int) root2);
            else
                System.out.println((int) root2 + " " + (int) root1);
        }

    }
}
