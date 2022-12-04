package Assignments;

import java.util.Scanner;

public class QUE2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter size of array:");
        int n = sc.nextInt();
        int []arr = new int[n];
        System.out.println("Enter "+n+" elements of array:");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        System.out.println("Enter value of x:");
        int x = sc.nextInt();
        int ans = 0;
        for(int i=0; i<n; i++){
            if(arr[i]==x){
                ans++;
            }
        }
        System.out.println(ans);
    }
}
