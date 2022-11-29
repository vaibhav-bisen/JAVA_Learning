package Assignment;

import java.util.Scanner;

class PositiveNo{
    void positiveNum(int n, int [] arr){
        System.out.println("Positive number are: ");
        for(int i=0; i< arr.length; i++){
            if(arr[i]>-1){
                System.out.println(arr[i]);
            }
        }
    }
}
public class QUE1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Size of array: ");
        int n = sc.nextInt();
        int [] arr = new int [n];
        for(int i=0; i<n; i++){
            arr[i] = sc.nextInt();
        }
        PositiveNo obj = new PositiveNo();
        obj.positiveNum(n, arr);
    }
}
