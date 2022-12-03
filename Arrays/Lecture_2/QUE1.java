package Assignment;

import java.util.Scanner;

public class QUE1 {

    static int[] posNeg(int [] arr, int n){
        int [] ans = new int [n];
        int index = 0;
        for(int i=0; i<n; i++){
            if(arr[i]>=0){
                ans[index] = arr[i];
                index++;
            }
        }
        for(int i=0; i<n; i++){
            if(arr[i]<0){
                ans[index] = arr[i];
                index++;
            }
        }
        return ans;
    }
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        int [] arr = new int [n];
        for(int i=0; i<n; i++){
            arr[i] = scan.nextInt();
        }
        int [] ans = posNeg(arr, n);
        for(int i=0; i<n; i++){
            System.out.print(ans[i]+" ");
        }
    }
}
