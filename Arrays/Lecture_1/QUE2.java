package Assignment;

import java.util.Scanner;

public class QUE2 {
    static void oddPlace(){
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter size of array: ");
        int n = scan.nextInt();
        String [] str = new String[n];
        for(int i=0; i<n; i++){
            str[i] = scan.next();
        }
        System.out.println("Required array is:");
        for(int i=0; i<n; i++){
            if(i%2!=0){
                System.out.println(str[i]);
            }
        }
    }
    public static void main(String[] args) {
        oddPlace();
    }
}
