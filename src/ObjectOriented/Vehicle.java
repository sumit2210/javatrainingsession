package ObjectOriented;

import java.util.Scanner;

public class Vehicle {
    private String name ="";
    private int numWheels =0;
    private int numPassengers=0;
    private String type="";


    Scanner scanner = new Scanner(System.in);

    public void vehicledetails(){
        System.out.println("provide vehicle name");
        name =scanner.next();
        System.out.println("provide vehicle type");
        numWheels = scanner.nextInt();
        System.out.println("provide number of passenger");
        numPassengers = scanner.nextInt();
        System.out.println("provide vehicle type");
        type = scanner.next();
        

    }

    public void summary(){
        System.out.println("my demand is for " +type+" "+name+"having" +numWheels+"wheels and have capacity of+"+numPassengers+"");

    }

}
