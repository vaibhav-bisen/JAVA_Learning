import java.util.Arrays;

public class TryThis {
    static void countOf(int[] arr, int x) {
        int count = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == x) {
                count++;
            }
        }
        System.out.println("Count of " + x + " is: " + count);
    }

    static void lastOcc(int[] arr, int y) {
        int last = -1;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == y) {
                last = i;
            }
        }
        System.out.println("Last occurrance of " + y + " on index: " + last);
    }

    static void greater(int[] arr, int z) {
        int greater = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > z) {
                greater++;
            }
        }
        System.out.println("In the given array " + greater + " element is greater than " + z);
    }

    static boolean isSorted(int[] arr, int a) {
        boolean ans = true;
        for (int i = 1; i < arr.length; i++) {
            if (arr[i - 1] > arr[i]) {
                ans = false;
                break;
            }
        }
        return ans;
    }

    static int[] smallestAndGreater(int [] arr){
        Arrays.sort(arr);
        int [] ans = {arr[0], arr[arr.length-1]};
        return ans;
    }

    public static void main(String[] args) {
        //////// TRY THIS /////////

        // Q1- Count the number of occurrences of a particular element x.
        int[] arr_1 = { 4, 4, 5, 2, 4, 4, 7, 7, 4, 2 };
        int x = 4;
        countOf(arr_1, x);

        // Q2- Find the last occurrance of an element x in a given array.
        int[] arr_2 = { 4, 4, 5, 4, 5 };
        int y = 4;
        lastOcc(arr_2, y);

        // Q3- Count the number of element strictly greater than value x.
        int[] arr_3 = { 4, 4, 5, 4, 5 };
        int z = 4;
        greater(arr_3, z);

        // Q4- Check if the given array is sorted or not.
        int[] arr_4 = { 1, 3, 3, 4, 7, 9 };
        int a = 4;
        if (isSorted(arr_4, a)) {
            System.out.println("It is sorted array.");
        } else {
            System.out.println("It is un-sorted array.");
        }

        // Q5- Return  smallest and greater element in the array in the form of array [smallest, greater].
        int[] arr_5 = { 1, 3, 3, 4, 7, 9 };
        int [] ans = smallestAndGreater(arr_5);
        System.out.println(ans[0] + ", "+ ans[1]);

    }
}
