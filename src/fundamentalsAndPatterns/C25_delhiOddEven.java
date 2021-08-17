package fundamentalsAndPatterns;

import java.util.Scanner;

public class C25_delhiOddEven {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int N = scn.nextInt();
        int[] evi = new int[N];
        int[] odi = new int[N];

        for(int j=0;j<N;j++){
            int n = scn.nextInt();
            int i;
            int even = 0, odd = 0;
            for (i = n; i != 0; i = i / 10) {
                int temp = i % 10;
                if (temp % 2 == 0)
                    even += temp;
                else
                    odd += temp;

            }
            evi[j] = even;
            odi[j] = odd;
        }

        for(int j=0;j<N;j++){
            if(odi[j]%3==0 || evi[j]%4==0){
                System.out.println("Yes");
            }else{
                System.out.println("No");
            }
        }
    }
}
