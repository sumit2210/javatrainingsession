package multi;

public class PersonDemo {
    public static void main(String[] args) {
        Person p1 = new Person("john",100f);
        Employee p2 = new Person("john",350f);
        Salaried p3 = new Person("john",150f);

        Person p4 = (Person)p2;

        System.out.println("name is : "+p1.getNAme());
        System.out.println("salary is :" +p1.getSalary());
        p1.commonMethod();

        System.out.println("name is : "+p2.getNAme());
        p2.commonMethod();


        System.out.println("salary is : "+p3.getSalary());

    }
}
