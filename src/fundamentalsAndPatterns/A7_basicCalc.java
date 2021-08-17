package fundamentalsAndPatterns;

import java.util.Scanner;

public class A7_basicCalc {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int ans = 0;
        char ch;
        do{
            ch = scn.next().charAt(0);
            if (ch == '+' || ch == '-' || ch == '*' || ch == '/' || ch == '%') {
                int N1 = scn.nextInt();
                int N2 = scn.nextInt();
                if(ch == '+'){
                    ans = N1+N2;
                }else if(ch == '-'){
                    ans = N1-N2;
                }else if(ch == '*'){
                    ans = N1*N2;
                }else if(ch == '/'){
                    ans = N1/N2;
                }else{
                    ans = N1%N2;
                }
                System.out.println(ans);
            }else if(ch == 'x' || ch == 'X'){
                System.exit(0);
            }else{
                System.out.println("Invalid operation. Try again.");
            }

        }while(true);

    }
}
