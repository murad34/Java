package UnibookApp;

import java.util.Scanner;

public class Input {

    public static String requiredText(String title) {

        Scanner sc = new Scanner(System.in);
        System.out.println(title);
        String answer = sc.nextLine();

        return answer;
    }

    public static int requiredNumber(String title) {

        Scanner sc = new Scanner(System.in);
        System.out.println(title);
        int answer = sc.nextInt();

        return answer;
    }

}
