package thread;

public class Car extends Thread{

    private String carName;

    public Car(String carName) {
        this.carName = carName;
    }

    @Override
    public void run() {
        System.out.println("Car " + carName + " reached destination.");
    }
}

