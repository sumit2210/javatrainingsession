package Interfacee.assignmnt;

public class Square implements Shape,Drawable{

    int side;

    public Square(int side){
        this.side = side;
    }

    @Override
    public float calculatePerimeter() {
        return 2*side;
    }

    @Override
    public float calculateArea() {
        return side*side;
    }

    @Override
    public void draw() {
        System.out.println("Drawing square");

    }

    @Override
    public String getNAme() {
        return "Square";
    }
}
