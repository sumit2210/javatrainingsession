package Interfacee.assignmnt;



public class Runner {
    public static void main(String[] args) {
        Circle circle = new Circle(5.0f);
        Square square = new Square(4);
        Rectangle rectangle = new Rectangle(10.0f, 20.0f);

        circle.draw();
        System.out.println(circle.getNAme() + " perimeter: " + circle.calculatePerimeter() +  " Area: " + circle.calculateArea());


        square.draw();
        System.out.println(square.getNAme() + " Perimeter: " + square.calculatePerimeter()  + " Area " + square.calculateArea());

        rectangle.draw();
        System.out.println(rectangle.getNAme() + " Perimeter " + rectangle.calculatePerimeter()  +  " Area " + rectangle.calculateArea());


    }
}
