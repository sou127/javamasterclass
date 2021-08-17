package fundamentalsAndPatterns;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Enumeration;
import java.util.Scanner;

public class C24_helpPrateek {
    static int MAX_SIZE = 1000005;

    static ArrayList<Integer> primes = new ArrayList<Integer>();

    static void SieveOfEratosthenes()
    {

        boolean [] IsPrime = new boolean[MAX_SIZE];

        for(int i = 0; i < MAX_SIZE; i++)
            IsPrime[i] = true;

        for (int p = 2; p * p < MAX_SIZE; p++)
        {

            if (IsPrime[p])
            {
                for (int i = p * p; i < MAX_SIZE; i += p)
                    IsPrime[i] = false;
            }
        }

        for (int p = 2; p < MAX_SIZE; p++)
            if (IsPrime[p])
                primes.add(p);
    }

    public static void main (String[] args)
    {

        SieveOfEratosthenes();
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        ArrayList<Integer> ari = new ArrayList<Integer>();
        while(n!=0){
            int t = scn.nextInt();
            ari.add(primes.get(t-1));
            n--;
        }
        Enumeration<Integer> e = Collections.enumeration(ari);
        while(e.hasMoreElements())
            System.out.println(e.nextElement());
    }
}
