package fundamentalsAndPatterns;

import java.util.Scanner;

public class C22_helpRamu {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int N = scn.nextInt();
        int i;
        for(i = 0; i < N; i++){
            int c1,c2,c3,c4;
            int n, m;
            c1 = scn.nextInt();
            c2 = scn.nextInt();
            c3 = scn.nextInt();
            c4 = scn.nextInt();
            n = scn.nextInt();
            m = scn.nextInt();
            int[] ai = new int[n];
            int[] bi = new int[m];
            for(int j = 0;j<n;j++){
                ai[j] = scn.nextInt();
            }
            for(int j = 0;j<m;j++){
                bi[j] = scn.nextInt();
            }
            int rCost;
            int cCost;
            //int cost = 0;
            int rtemp = 0;
            int ctemp = 0;

            for(int j = 0;j<n;j++){
                rtemp += Math.min(ai[j]*c1, c2);
            }
            for(int j = 0;j<m;j++){
                ctemp += Math.min(bi[j]*c1, c2);
            }
            rCost = Math.min(rtemp,c3);
            cCost = Math.min(ctemp,c3);

            int totalCost = Math.min(rCost + cCost, c4);

            System.out.println(totalCost);

        }
    }
}


/*System.out.println("Printing");
System.out.println(c1 + " " + c2 + " " + c3 + " " + c4);
System.out.println(n + " " + m);
for(int j = 0;j<n;j++){
    System.out.print(ai[j] + " ");
}
System.out.println();
for(int j = 0;j<m;j++){
    System.out.print(bi[j] + " ");
}
System.out.println();*/
