import java.util.Scanner;

public class Practice {

    static int pairSum(int[] arr, int x) {
        int ans = 0;
        for (int i = 0; i < arr.length; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[i] + arr[j] == x) {
                    ans++;
                }
            }
        }
        return ans;
    }

    static int triplatSum(int[] arr, int x) {
        int ans = 0;
        int n = arr.length;
        for (int i = 0; i < n; i++) {
            for (int j = i + 1; j < n; j++) {
                for (int k = j + 1; k < n; k++) {
                    if (arr[i] + arr[j] + arr[k] == x) {
                        ans++;
                    }
                }
            }
        }
        return ans;
    }

    static int uniqueNum(int[] arr) {
        int n = arr.length;
        int ans = -1;
        for (int i = 0; i < n; i++) {
            for (int j = i + 1; j < n; j++) {
                if (arr[i] == arr[j]) {
                    arr[i] = -1;
                    arr[j] = -1;
                }
            }
        }
        for (int i = 0; i < n; i++) {
            if (arr[i] > 0) {
                ans = arr[i];
            }
        }
        return ans;
    }

    static int maxValue(int[] arr) {
        int maxValue = Integer.MIN_VALUE;
        for (int i = 0; i < arr.length; i++) {
            maxValue = Math.max(maxValue, arr[i]);
        }
        return maxValue;
    }

    static int secondLargestNum(int[] arr) {
        int max = maxValue(arr);
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == max) {
                arr[i] = Integer.MIN_VALUE;
            }
        }
        int secondMax = maxValue(arr);
        return secondMax;
    }

    static int firstRepeatValue(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[i] == arr[j]) {
                    return arr[i];
                }
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter size of array:");
        int n = sc.nextInt();
        int[] arr = new int[n];
        System.out.println("Enter " + n + " element os array:");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        System.out.println("Enter target value:");
        int x = sc.nextInt();

        ///// Pattern: Targeted sum /////
        // Q- Find the total sum of pairs in the Array whose sum is equal to the given
        ///// value x.
        // System.out.println(pairSum(arr, x));

        // Q- Count the number of triplats whose sum is equal to the give value of x.
        // System.out.println(triplatSum(arr, x));

        ///// Pattern: Array Manipulation /////
        // Q- Find the unique number in given Array where all the elements are being
        ///// repeated twice with one value being unique.
        // i/p = arr[] = {1,2,3,4,1,2,3}
        // o/p = 4
        // System.out.println(uniqueNum(arr));

        // Q- Find the second largest element in the given Array.
        // System.out.println(secondLargestNum(arr));

        // Q- Given an Arrayb 'a' consisting of an integers. Return the first value that
        // is repeating in this arrray.
        // If no value is being repeated , return -1.
        // System.out.println(firstRepeatValue(arr));
        
    
    }
}
