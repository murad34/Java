package UnibookApp;

public class Main {

    public static void main(String[] args) {

        while (true) {

            int menu = Input.requiredNumber("Which option" +
                    "\n1. Register student\" " +
                    "\n2. Show all sdudents\" " +
                    "\n3. Find student\" " +
                    "\n4. Update student" +
                    "\n5. Exit");

            if (menu == 1) {

                Register.registerStudent();

            } else if (menu == 2) {

                Register.printRegisteredStudents();

            } else if (menu == 3) {

                Register.findStudentsAndPrint();

            } else if (menu == 4) {

                Register.update();

            } else if (menu == 5) {

                System.exit(0);

            }

        }

    }

}
