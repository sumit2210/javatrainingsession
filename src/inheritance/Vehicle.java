package inheritance;


public class Vehicle{

    String vehiclename = "";
    int registrationum = 0;

    public Vehicle(String name, int number) {
        this.vehiclename = name;
        this.registrationum = number;

    }
        public void printdetail(){

            System.out.println("Vehicle is "+vehiclename+" whose registration number is "+registrationum);
        }

}
