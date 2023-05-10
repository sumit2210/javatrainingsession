package inheritance;

public class Bus extends Vehicle{

    int passenger;

    public Bus(String name , int number , int count){

        super(name,number);
        this.passenger=count;
    }
        public void printdetail(){

        super.printdetail();
            System.out.println("Capacity of" +vehiclename+ "is" +passenger);
        }
}
