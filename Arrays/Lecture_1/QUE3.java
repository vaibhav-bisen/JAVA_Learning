package Assignment;

import java.util.Scanner;

public class QUE3 {
    static void evenElement(){
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter size of array: ");
        int n = scan.nextInt();
        int [] arr = new int[n];
        for(int i=0; i<n; i++){
            arr[i] = scan.nextInt();
        }
        System.out.println("Required array is:");
        for (int i : arr) {
            if(i%2==0){
                System.out.println(i);
            }
        }
    }
    public static void main(String[] args) {
        evenElement();
    }
}
