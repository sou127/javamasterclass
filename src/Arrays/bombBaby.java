package Arrays;

import java.math.BigInteger;
import java.util.Scanner;

public class bombBaby {

    static Scanner scn = new Scanner(System.in);

    public static void main(String[] args) {
        String M = scn.nextLine();
        String F = scn.nextLine();

        System.out.println(solution(M, F));

    }

    public static String solution(String x, String y) {
        int first = Integer.parseInt(x);
        int second = Integer.parseInt(y);
        int count = 0;
        while(first!=second){
            int temp = 0;
            if(first<second){
                if((second-first)%first > 0) temp = 1;
                int impVal = Math.floorDiv(second - first,second) + temp;
                count+=impVal;
                first=first;
                second = second - impVal * first;
            }else {
                if((first-second)%second > 0) temp = 1;
                int impVal = Math.floorDiv(first - second, second) + temp;
                count+=impVal;
                first = first - impVal * second;
                second=second;
            }
        }

        if(first==1 || second==1)
            return String.valueOf(count);
        else
            return "impossible";
    }
}

/*        BigInteger first = new BigInteger(M);
        BigInteger second = new BigInteger(F);*/
