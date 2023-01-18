package UnibookApp;

public class Register {

    public static Student fillStudent() {

        String name = Input.requiredText("Enter name");
        String surname = Input.requiredText("Enter surname");
        int age = Input.requiredNumber("Enter age");
        int classNumber = Input.requiredNumber("Enter class");

        Student st = new Student(name, surname, age, classNumber);

        return st;

    }

    public static void printRegisteredStudents() {

        if (Config.students == null) {
            return;
        }

        for (int i = 0; i < Config.students.length; i++) {

            Student st = Config.students[i];
            System.out.println( (i+1) + " " + st.getFullInfo());

        }

    }

    public static void registerStudent() {

        int count = Input.requiredNumber("How many students ? ");

        Config.students = new Student[count];

        for (int i = 0; i < count; i++) {

            System.out.println("Register number " + (i + 1));

            Config.students[i] = Register.fillStudent();

        }

        System.out.println("Registration completed successfully");

        Register.printRegisteredStudents();

    }

    public static Student[] findStudent(String text) {

        int count = 0;
        for (int i = 0; i < Config.students.length; i++) {

            Student st = Config.students[i];
            if (st.getName().contains(text) || st.getSurname().contains(text)) {
                count++;
            }
        }

        Student[] result = new Student[count];

        int found = 0;
        for (int i = 0; i < Config.students.length; i++) {

            Student st = Config.students[i];
            if (st.getName().contains(text) || st.getSurname().contains(text)) {

                result[found] = st;
                found++;

            }
        }

        return result;
    }

    public static void findStudentsAndPrint() {

        String text = Input.requiredText("name or surname");
        Student[] result = findStudent(text);

        for (int i=0; i<result.length; i++) {

            System.out.println(result[i].getFullInfo());

        }

    }

    public static void update() {

        Register.printRegisteredStudents();

        int number = Input.requiredNumber("Whicn index of student ? ");

        System.out.println("New info ");

        Student selectedStudent = Config.students[number-1] ;

        String changeParameter = Input.requiredText("Which parameter ? 'name' 'surname' 'age' 'class number' ");

        if (changeParameter.contains("'name'")) {
            selectedStudent.setName(Input.requiredText("name")); }

        if (changeParameter.contains("'surname'")) {
            selectedStudent.setSurname(Input.requiredText("surname")); }

        if (changeParameter.contains("'age'")) {
            selectedStudent.setAge(Input.requiredNumber("age")); }

        if (changeParameter.contains("'class number'")) {
            selectedStudent.setClassNumber(Input.requiredNumber("class number")); }

    }


}
