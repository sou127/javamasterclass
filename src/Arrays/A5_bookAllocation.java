package Arrays;
import java.util.Scanner;

public class A5_bookAllocation {
    static Scanner scn = new Scanner(System.in);

    public static void main(String[] args) {
        int t = scn.nextInt();
        for (int i = 0; i < t; i++) {
            int n = scn.nextInt();
            int m = scn.nextInt();
            int[] arr = new int[n];
            for (int j = 0; j < n; j++) {
                arr[j] = scn.nextInt();
            }
            System.out.println(solution(arr, n, m));
        }
    }

    public static int solution(int[] arr, int N, int M){
        int low = arr[N-1];
        int sum = 0;
        int ans = 0;
        for (int i = 0; i < N; i++) {
            sum += arr[i];
        }
        int high = sum;

        while(low<=high){
            int mid = low + (high - low)/2;

            if(isPossible(arr, mid, M)){
                ans = mid;
                high = mid - 1;
            }else {
                low = mid + 1;
            }
        }
        return ans;
    }

    public static boolean isPossible(int[] arr, int mid, int M){
        int sum = 0;
        int students = 1;
        for (int j : arr) {
            sum += j;
            if (sum > mid) {
                sum = j;
                students++;
            }
        }
        return students<=M;
    }
}

