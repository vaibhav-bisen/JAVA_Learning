package Assignment;

import java.util.Scanner;

public class QUE2 {

    public static void main(String[] args) {

        Scanner scn = new Scanner(System.in);

        System.out.println("Enter the length of arrays: ");

        int n = scn.nextInt();

        int m = scn.nextInt();

        int[] a = new int[n];

        int[] b = new int[n];

        for (int i = 0; i < n; i++) {

            a[i] = scn.nextInt();

        }
        for (int i = 0; i < m; i++) {

            b[i] = scn.nextInt();

        }

        for (int i = 0; i < n; i++) {

            boolean check = false;

            for (int j = 0; j < m; j++) {

                if (a[i] == b[j]) {

                    check = true;

                    break;

                }

            }

            if (check==false) {

                System.out.println(b[i]);

            }

        }
    }
}
