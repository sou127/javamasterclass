package fundamentalsAndPatterns;

import java.util.Scanner;

public class D30_vonLovesBinary {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int[] arr = new int[n];

        int i;
        for (i=0;i<n;i++){
            int snum = scn.nextInt();
            int sb = 2;
            arr[i] = decToOct(snum,sb);
        }
        for (i=0;i<n;i++){
            System.out.println(arr[i]);
        }

    }

    public static int decToOct(int snum, int sb){
        int ans=0;
        int multiplier = 1;
        while(snum!=0){
            int rem = snum%10;
            ans = ans + (rem*multiplier);
            multiplier=multiplier*sb;
            snum=snum/10;
        }
        return ans;
    }
}
