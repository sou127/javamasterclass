package fundamentalsAndPatterns;

import java.util.Scanner;

public class C23_printReverse {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int i;
        int temp = 0;
        for(i=n;i!=0;i/=10){
            int check = i%10;
            temp = temp*10 + check;

        }
        System.out.println(temp);
    }
}
