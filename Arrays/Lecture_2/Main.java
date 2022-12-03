import java.util.Arrays;
import java.util.Scanner;

class Main {

    static void printArray(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }

    

    public static void main(String[] args) {
        try (// Taking input from user
                Scanner scan = new Scanner(System.in)) {
            // System.out.println("Enter size of array:");
            // int n = scan.nextInt();
            // System.out.println("Enter "+n+" array elements:");
            // int [] arr = new int[n];
            // for(int i=0; i<n; i++){
            // arr[i] = scan.nextInt();
            // }
            // System.out.println("User Array:");
            // printArray(arr);

            // // Try to make copy of arr to arr_2
            // int [] arr_2 = arr;
            // System.out.println("Copy array before changing:");
            // printArray(arr_2);

            // // Changing some value of arr_2
            // arr_2[0] = 9;
            // arr_2[1] = 9;
            // System.out.println("Copy array after changing:");
            // printArray(arr_2);
            // System.out.println("Original array:");
            // printArray(arr);

            // // Deep copy assign new memory
            // int [] arr_3 = arr.clone();
            // System.out.println("Using clone method copy array: "+arr_3);

            // // Copy of array using Array.copy(kiski, kitni len ki)
            // int [] arr_4 = Arrays.copyOf(arr, arr.length);
            // System.out.println("Copy using util package .copy() "+arr_4);

            

        }
    }
}