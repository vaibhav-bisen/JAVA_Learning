package Assignment;

import java.util.Scanner;

public class QUE5 {
    static void peakElement(){
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter size of array: ");
        int n = scan.nextInt();
        int [] arr = new int[n];
        for(int i=0; i<n; i++){
            arr[i] = scan.nextInt();
        }
        System.out.println("Required array is:");
        for(int i=1; i<n-1; i++){
            if(arr[i-1] <arr[i] && arr[i]>arr[i+1]){
                System.out.println(arr[i]);
                break; 
            }
        }
        
    }
    public static void main(String[] args) {
        peakElement();
    }
}
