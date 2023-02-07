package Algorithmic_Tasks;

import java.util.Scanner;

public class Task13 {

    public static void main(String[] args) {

//        System.out.println(check1());
//        System.out.println(check2());
        System.out.println(check3());

    }

    public static char check1() {

        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        int i = sc.nextInt();

        char index = s.charAt(i);

        return index;
    }

    ///////////////////////////////////////////////////////////////////////////////////////////////////////////////////

    public static boolean check2() {

        Scanner sc = new Scanner(System.in);
        String s1 = sc.next();
        String s2 = sc.next();

        if (s1.length() == s2.length()) {

            for (int i = 0; i < s1.length(); i++) {

                if (s1.charAt(i) != s2.charAt(i)) {
                    return false;
                }

            }

        } else {
            return false;
        }

        return true;
    }

    ///////////////////////////////////////////////////////////////////////////////////////////////////////////////////

    public static String check3() {

        Scanner sc = new Scanner(System.in);
        String s1 = sc.nextLine();

        String s2 = s1.trim();

        return s2;
    }

    ///////////////////////////////////////////////////////////////////////////////////////////////////////////////////

}
