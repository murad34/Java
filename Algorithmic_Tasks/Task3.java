package Algorithmic_Tasks;

import java.util.Scanner;

public class Task3 {

    public static void main(String[] args) {

        System.out.println("Please insert the number");

        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();

        int sum=0;

        while (a>0) {

            int qalig = a % 10;
            sum += qalig;
            System.out.println(qalig);

            a /= 10;

        }

        System.out.println(sum);


    }

}
