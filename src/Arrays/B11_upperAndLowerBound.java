package Arrays;
import java.util.Scanner;

public class B11_upperAndLowerBound {
    static Scanner scn = new Scanner(System.in);
    public static void main(String[] args) {
        int[] arr = takeInput();
        int[] queries = takeInput();
        for (int query : queries)
            System.out.println(lowerBound(arr, query) + " " + upperBound(arr, query));
    }

    public static int lowerBound(int[] arr, int item){
        int ans = -1;
        int low, mid, high;
        low = mid = 0;
        high = arr.length-1;
        while(low<=high){
            if(arr[mid] == item) {
                high = mid-1;
                ans = mid;
            }
            else if(arr[mid] > item)   high = mid - 1;
            else    low = mid + 1;
            mid = (low+high)/2;
        }
        return ans;
    }

    public static int upperBound(int[] arr, int item){
        int ans = -1;
        int low, mid, high;
        low = mid = 0;
        high = arr.length-1;
        while(low<=high){
            if(arr[mid] == item) {
                low = mid+1;
                ans = mid;
            }
            else if(arr[mid] > item)  high = mid - 1;
            else    low = mid + 1;
            mid = (low+high)/2;
        }
        return ans;
    }

    public static int[] takeInput(){
        int n = scn.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++)
            arr[i] = scn.nextInt();
        return arr;
    }
}
