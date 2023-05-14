package Abstract;

import java.util.Scanner;

public class ShapeExample {
    public static void main(String[] args) {

       Shape shape = null ;

        Scanner sc = new Scanner(System.in);

        System.out.println("which shape do ou want");
        String shapeType = sc.next();

        if (shapeType.equals("Triangle")) {
            shape = new Triangle();
        } else if (shapeType.equals("square")) {
            shape = new Sqaure();
        } else {
            System.out.println("not valid input");
        }
        if (shape != null) {
            shape.draw();
        }
    }
}