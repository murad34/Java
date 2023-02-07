package Algorithmic_Tasks;

import java.util.Scanner;

public class Task11 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        String a = sc.next();

        for (int i=0; i<a.length(); i++) {

            if (a.charAt(i) != a.charAt(a.length()-1-i)) {
                System.out.println(false);
                return;
            }

        }

        System.out.println(true);

    }

}
