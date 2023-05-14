package Interfacee.assignmnt;

public class Circle implements Shape,Drawable{

    float radius;

    public Circle(float radius){
        this.radius=radius;
    }


    @Override
    public float calculatePerimeter() {
        return 2*3.14f * radius;
    }

    @Override
    public float calculateArea() {
        return  radius*radius*3.14f;
    }

    @Override
    public void draw() {
        System.out.println("drawing circle");

    }

    @Override
    public String getNAme() {
        return "Circle";
    }
}
