package multi;

public class Person implements Employee,Salaried{
    String name;
    float salary;

    public Person(String name,float salary){
        this.name=name;
        this.salary=salary;
    }
    @Override
    public String getNAme() {
        return this.name;
    }

    @Override
    public void commonMethod() {
        System.out.println("common method");

    }

    @Override
    public float getSalary() {
      return this.salary;
    }
}
