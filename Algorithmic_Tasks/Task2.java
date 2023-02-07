package Algorithmic_Tasks;

import java.util.Scanner;

public class Task2 {

    public static void main(String[] args) {

        System.out.println("Please insert number");

        Scanner sc = new Scanner(System.in);
        int value = sc.nextInt();

        int sum = 0;

//        for ( ; value>0; value--) {
//            sum+=value;
//        }

        while (value>0) {
            sum+=value;
            value--;
        }

        System.out.println(sum);

    }

}
