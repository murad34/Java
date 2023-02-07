package Algorithmic_Tasks;

import java.util.Arrays;
import java.util.Scanner;

public class Practise {

    public static void main(String[] args) {

//        chechk1();
//        System.out.println(check2());
        System.out.println(check3());

    }

    //////////////////////////////////////////////////////////////////////////////////////////////////////////////////

    public static void chechk1() {

        Scanner sc = new Scanner(System.in);
        System.out.println("Array n ?");

        int number = sc.nextInt();

        int[] array = new int[number];

        int sum = 0 ;

        for (int i=0; i<number; i++) {

            array[i] = sc.nextInt();
            sum+=array[i];

        }

        System.out.println(Arrays.toString(array));
        System.out.println(sum);

    }

    //////////////////////////////////////////////////////////////////////////////////////////////////////////////////

    public static boolean check2() {

        System.out.println("How many elements of array ?");

        Scanner sc = new Scanner(System.in);
        int number = sc.nextInt();

        int[] array = new int[number];

        for (int i=0; i<number; i++) {

            System.out.println("Insert " + i + " number of array");

            array[i] = sc.nextInt();

        }

        for (int i=0; i<number; i++) {

            for (int j = i+1 ; j<number ; j++) {

                if (array[i] == array[j]) {
                    return true;
                }

            }

        }

        return false;
    }

    //////////////////////////////////////////////////////////////////////////////////////////////////////////////////

    public static boolean check3() {

        Scanner sc = new Scanner(System.in);

        System.out.println("n ?");

        int number = sc.nextInt();

        int[] array = new int[number];

        for (int i=0; i<number; i++) {

            array[i] = sc.nextInt();

        }

        for (int i=0; i<number; i++) {

            for (int j=i+1 ; j<number; j++) {

                if (array[i] > array[j]) {
                    return false;
                }

            }

        }

        return true;
    }

    //////////////////////////////////////////////////////////////////////////////////////////////////////////////////

}
