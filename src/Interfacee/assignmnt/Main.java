package Interfacee.assignmnt;

public class Main {
    public static void main(String[] args) {
        Circle circle = new Circle(5.0f);
        Square square = new Square(4);
        Rectangle rectangle  = new Rectangle(10.0f,20.0f);

        System.out.println(circle.getNAme()+"perimeter:" + circle.calculatePerimeter()+"Area:"+circle.calculateArea());
        circle.draw();

        square.draw();
        square.calculateArea();
        square.calculatePerimeter();

        rectangle.getNAme();
        rectangle.draw();
        rectangle.calculateArea();
        rectangle.calculatePerimeter();



    }
}
