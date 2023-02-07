package Algorithmic_Tasks;

import java.util.Scanner;

public class Task1 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int value = sc.nextInt();

        Task1.find(value);

    }
    public static void find(int value) {

        System.out.println("Please insert value");

        for (int i=0; i<=value; i++) {
            if (i%2==0) {
                System.out.println(i);
            }
        }

    }

}
