package Comparable_Comparator;

public class Person implements Comparable<Person>{

    private int age;

    public Person(int age) {
        this.age = age;
    }

    public int getAge() {
        return age;
    }

    @Override
    public String toString() {
        return "Person{age=" + age + '}';
    }

    @Override
    public int compareTo(Person person) {
        return this.age-person.age;
    }

}