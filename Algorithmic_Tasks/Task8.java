package Algorithmic_Tasks;

import java.util.Scanner;

public class Task8 {

    public static void main(String[] args) {

        foo2();

    }

    public static void foo() {

        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        int d = sc.nextInt();

        if (a==b || a==c || a==d || b==c || b==d || c==d) {
            System.out.println(true);
        } else {
            System.out.println(false);
        }

    }

    public static void foo2() {

        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        int d = sc.nextInt();

        if (d>c && c>b && b>a) {
            System.out.println(true);
        } else {
            System.out.println(false);
        }

    }

}
