package Assignment;

import java.util.Scanner;

public class QUE4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter size of array:");
        int n =sc.nextInt();
        int [] arr = new int [n];
        for(int i=0; i<n; i++){
            arr[i] = sc.nextInt();
        }
        System.out.println("Enter Sub-arrays sum:");
        int s = sc.nextInt();
        int i =0;
        int j =0;
        int st = 0;
        int end = -1;
        int sum = 0;
        while (j<n && sum+arr[j]<=s) {
            sum+=arr[j];
            j++;
        }
        if (sum == s) {
            System.out.println(i+1+" "+ j);
        }
        while (j<n) {
            sum+=arr[j];
            while (sum>s) {
                sum-=arr[i];
                i++;
            }
            if(sum == s){
            st =i+1;
            end = j+1;
            break;
            }
            j++;
        }
        System.out.println(st+" "+end);

    }
}
