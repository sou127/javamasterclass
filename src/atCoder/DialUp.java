package atCoder;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class DialUp {
    static Scanner scn = new Scanner(System.in);
    public static void main(String[] args) {
        int N = scn.nextInt();
        int M = scn.nextInt();
        ArrayList<Integer> S = new ArrayList<Integer>();
        ArrayList<Integer> T = new ArrayList<Integer>();
        for (int i = 0; i < N; i++) {
            S.add(scn.nextInt());
        }
        for (int i = 0; i < M; i++) {
            T.add(scn.nextInt());
        }

        ArrayList<Integer> b = new ArrayList<Integer>();
        int count = 0;

        while(!b.equals(T)){

            if(T.size()==1 && !T.equals(S)){
                count = -1;
                break;
            }else if(T.size()!=1 && S.size()==1 && T.contains(1) && T.contains(0)){
                count = -1;
                break;
            }else{
                System.out.println("Done 1");
                for (int i = 0; i < T.size(); i++) {
                    if(T.get(i).equals(S.get(0))){
                        b.add(S.get(0));
                    }else{
                        Collections.rotate(S, 1);
                        count++;
                    }
                }
                break;
            }
        }

        if(count == -1){
            System.out.println(-1);
        }else{
            System.out.println(count+T.size());
        }
    }

}
