package Algorithmic_Tasks;

import java.util.Scanner;

public class Task9 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int day = sc.nextInt();

        System.out.println(getDay(day));

    }

    public static String getDay(int day) {

        String dayName = "";

        switch (day) {
            case 1:
                dayName="Monday";
                break;
            case 2:
                dayName="Tuesday";
                break;
            case 3:
                dayName="Wednesday";
                break;
            case 4:
                dayName="Thursday";
                break;
            case 5:
                dayName="Friday";
                break;
            case 6:
                dayName="Saturday";
                break;
            case 7:
                dayName="Sunday";
                break;
            default:
                dayName="Error";
        }

        return dayName;
    }

}
