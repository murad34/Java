

package Algorithmic_Tasks;

import java.util.Arrays;
import java.util.Scanner;

public class Arrays_task {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Please insert number of rows");
        int a = sc.nextInt();
        System.out.println("Please insert number of columns");
        int b = sc.nextInt();

        int[][] arr = new int[a][b];

        for (int i=0; i<arr.length; i++) {

            for (int j=0; j<arr[i].length; j++) {

                System.out.println("i = " + i +", j = " + j + " insert number");
                arr[i][j] = sc.nextInt();

            }

        }

        for (int i=0; i<a; i++) {
            System.out.println(Arrays.toString(arr[i]));
        }

    }

}

