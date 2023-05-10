package ObjectOriented;

public class Person {

    String name;
    int age;

    public Person(String name) {
        this.name = name;
        this.age = 0;
    }

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public void summaryOfPerson() {
        if (age == 0) {
            System.out.println("His name is " + name);
        } else {
            System.out.println("His name is " + name + " and his age is " + age);
        }
    }
}
