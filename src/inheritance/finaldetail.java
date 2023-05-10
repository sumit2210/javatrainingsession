package inheritance;

public class finaldetail {

    public static void main(String[] args) {

        Vehicle obj1 = new Vehicle("truck",2515421);
        obj1.printdetail();

        Truck obj2 = new Truck("truck",45000,"50 tons");
        obj2.printdetail();
        Bus obj3 = new Bus("bus",46664,25);
        obj3.printdetail();
    }

}
