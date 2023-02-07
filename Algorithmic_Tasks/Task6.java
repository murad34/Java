package Algorithmic_Tasks;

import java.util.Scanner;

public class Task6 {

    public static void main(String[] args) {

        System.out.println("Please insert number for faktorial");
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();

        System.out.println(faktorial(a));

    }

    public static int faktorial(int value) {
        if (value == 0) {
            return 1;
        } else {
            return (value * faktorial(value - 1));
        }
    }

}
