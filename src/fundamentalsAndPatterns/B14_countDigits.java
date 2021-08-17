package fundamentalsAndPatterns;

import java.util.Scanner;

public class B14_countDigits {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int dig = scn.nextInt();
        int found = 0;
        for(int i = n;i > 0; i/=10){
            int check = i%10;
            if(check == dig)
                found++;
//            System.out.println(i%10);
        }
        System.out.println(found);
    }
}
