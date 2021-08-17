package fundamentalsAndPatterns;

import java.util.Scanner;

public class B12_binToDec {
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




    /*
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        String binN = scn.nextLine();
        int count = 0;

        for(int i=0;i<binN.length();i++){
            int posVal = (binN.charAt(binN.length() - i - 1) - '0');
            int secPow = (int) Math.pow(2,i);
            count += posVal*secPow;
        }
        System.out.println(count);

    }

     */
}
