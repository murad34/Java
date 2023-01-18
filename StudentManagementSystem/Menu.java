package StudentManagementSystem;

public enum Menu {

    login(1,"Login", new MenuLoginService()),
    register(2,"Register", new MenuRegisterService()),
    add_teacher(3,"Add teacher", null),
    add_student(4,"Add student", null),
    show_all_teacher(5,"Show all teachers", null),
    show_all_student(6,"Show all students", null),
    unknown;


    private String label;
    private MenuService menuService;
    private int number;

    Menu() {

    }

    Menu(int number, String label, MenuService menuService) {
        this.label = label;
        this.menuService = menuService;
        this.number = number;
    }

    public String getLabel() {
        return label;
    }

    @Override
    public String toString() {
        return number + ". " + label  ;
    }

    public void process() {
        menuService.process();
    }

    public int getNumber() {
        return this.number;
    }

    public static Menu find(int number) {

        Menu[] menus = Menu.values();

        for (int i=0; i<menus.length; i++) {

            if (menus[i].getNumber() == number) {
                return menus[i];
            }

        }

        return Menu.unknown;
    }

    public static void showAllMenu() {

        Menu[] menus = Menu.values();

        for (int i=0; i<menus.length; i++) {
            System.out.println(menus[i]);
        }

    }

}
