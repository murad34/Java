package StudentManagementSystem;

import java.util.Scanner;

public class MenuUtil {

    public static Menu showMenu() {

        Menu.showAllMenu();

        Scanner sc = new Scanner(System.in);
        System.out.println("Select menu");
        int selectedMenu = sc.nextInt();

        return Menu.find(selectedMenu);
    }

    public static void processMenu(Menu menu) {
        menu.process();
    }

}
