package fundamentalsAndPatterns;

import java.util.*;

public class B19_checkPrime {
    public static void main(String args[]) {
        Scanner scn = new Scanner(System.in);
        long n = scn.nextInt();
        int count=0;
        for(int i=1;i<=n;i++){
            if(n%i == 0)
                count++;
            System.out.println(count);
        }
        if(count>2)
            System.out.println("Not Prime");
        else
            System.out.println("Prime");
    }
}