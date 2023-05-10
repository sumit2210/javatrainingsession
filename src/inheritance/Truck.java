package inheritance;

public class Truck extends Vehicle{

    String loadcapacity;

    public Truck(String name, int number,String capacity){

        super(name,number);
        this.loadcapacity = capacity;

    }
        public void  printdetail(){

        super.printdetail();
            System.out.println("this "+vehiclename+ "can take a load of " +loadcapacity);
        }
}
