package Assignments;

import java.util.Scanner;

public class QUE1 {
    
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
        for(int i=0; i<n; i++){
            for(int j=i+1; j<n; j++){
                if(arr[j] - arr[i]==x){
                    System.out.println("Yes");
                    return;
                }
            }
        }
        System.out.println("No");
    }
}