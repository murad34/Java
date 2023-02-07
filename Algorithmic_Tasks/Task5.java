package Algorithmic_Tasks;

import java.util.Scanner;

public class Task5 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();

        int faktorial = 1 ;

        for (int i=1; i<=a; i++) {

            faktorial *= i;

        }

        System.out.println(faktorial);

    }

}
