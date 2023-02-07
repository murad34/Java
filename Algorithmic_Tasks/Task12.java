package Algorithmic_Tasks;

import java.util.Scanner;

public class Task12 {

    public static void main(String[] args) {

        System.out.println(check());

    }

    public static boolean check() {

        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();

        String s = String.valueOf(a);

        for (int i=0; i<s.length(); i++) {

            if (s.charAt(i) != s.charAt(s.length()-1-i)) {
                return false;
            }

        }

        return true;
    }

}
