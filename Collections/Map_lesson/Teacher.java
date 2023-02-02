package Map_lesson;

public class Teacher extends Person {

    public Teacher(int id, String name, String surname) {
        super(id, name, surname);
    }

    @Override
    public int hashCode() {
        System.out.println("Teacher hashCode = " + getName() + " " + getSurname());
        return 1;
    }

}
