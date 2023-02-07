package Algorithmic_Tasks;

import java.util.Scanner;

public class Task4 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        long a = sc.nextLong();

        int number=0;

        while (a>0) {

            a /= 10;
            number++;
        }

        System.out.println(number);

    }

}
