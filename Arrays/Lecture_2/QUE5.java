package Assignment;

import java.util.Scanner;

public class QUE5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int [] arr1 = new int[n];
        int [] arr2 = new int[n];
        for(int i=0; i<n; i++){
            arr1[i] = sc.nextInt();
        }
        boolean ans= true;
        for(int i=0; i<n; i++){
            arr2[i] = sc.nextInt();
            
            if(arr1[i] != arr2[i]){
                ans = false;
            }
            
        }
        System.out.println(ans);
    }
}
