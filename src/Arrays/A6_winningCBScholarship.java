package Arrays;

import java.util.Scanner;

public class A6_winningCBScholarship {
    static Scanner scn = new Scanner(System.in);
    public static void main(String[] args) {
        long N = scn.nextInt();  //students competing
        long M = scn.nextInt();  //tickets available
        long X = scn.nextInt();  //tickets needed to win a 100% scholarship
        long Y = scn.nextInt();  //students paying X tickets

        long low = 0;
        long high = N;
        long ans = 0;
        while(low <= high){
            long mid = low + (high-low)/2;
            if((mid*X) <= (M+(N-mid)*Y)){
                ans = mid;
                low = mid + 1;
            }else {
                high = mid - 1;
            }
        }

        System.out.println(ans);

    }
}
