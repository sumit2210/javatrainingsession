package Interfacee.assignmnt;

public class Rectangle implements Shape,Drawable{
    float length;
    float breadth;

    public Rectangle(float length , float breadth){
        this.length = length;
        this.length = breadth;
    }

    @Override
    public float calculatePerimeter() {
        return 2*length;
    }

    @Override
    public float calculateArea() {
        return length*breadth;
    }

    @Override
    public void draw() {
        System.out.println("Drawing rectangle");

    }

    @Override
    public String getNAme() {
        return "Rectangle";
    }
}
