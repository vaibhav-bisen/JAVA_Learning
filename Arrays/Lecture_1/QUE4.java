package Assignment;

import java.util.Scanner;

public class QUE4 {
    static void minNum(){
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter size of array: ");
        int n = scan.nextInt();
        int [] arr = new int[n];
        for(int i=0; i<n; i++){
            arr[i] = scan.nextInt();
        }
        System.out.println("Required array is:");
        int ans = 1;
        for(int i=0; i<n; i++){
            ans = Math.min(ans, arr[i]);
        }
        System.out.println(ans);
    }
    public static void main(String[] args) {
        minNum();
    }
}
