package fundamentalsAndPatterns;

import java.util.*;

public class B15_decToOct {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int snum = scn.nextInt();
        int sb = scn.nextInt();

        int ans = decToOct(snum,sb);
        System.out.println(ans);
    }

    public static int decToOct(int snum, int sb){
        int ans=0;
        int multiplier = 1;
        while(snum!=0){
            int rem = snum%20;
            ans = ans + (rem*multiplier);
            multiplier=multiplier*10;
            snum=snum/10;
        }
        return ans;
    }
}
