import java.util.Scanner;
public class Adder {
    private int input1 = 10;
    private int input2 = 20;
    private Scanner scanner = new Scanner(System.in);

    public Adder(int i1, int i2){
        this.input1 = i1;
        this.input2 = i2;
    }
    public Adder(int input1){
        this.input1 = input1;
        this.input2 = input1;
    }
    public String takeFirstInputFromUser(){
        System.out.println("Enter first input");
        input1 = scanner.nextInt();
        return "success";
    }
    public String takeSecondInputFromUser() {
        System.out.println("Enter Second input");
        input2 = scanner.nextInt();
        return "success";
    }
    public void sumandprintresult(){
        System.out.println("Sum is :" +performsum(input1,input2));
    }
    private int performsum(int i1, int i2){
        int sum = input1 + this.input2;
        return sum;
    }

}

