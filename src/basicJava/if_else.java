package basicJava;

import java.util.Scanner;
public class if_else{
    public static void main(String[] args) {

        int value1 = 0;
        int value2 = 0 ;
        int operation = 0;


        Scanner scanner = new Scanner(System.in);
        System.out.println("enter the value1");
        value1 = scanner.nextInt();

        System.out.println("enter the value2");
        value2 = scanner.nextInt();

        System.out.println("enter 1 for add , 2 for substract , 3 for multiplication , 4 for division");
        operation = scanner.nextInt();

        if(operation == 1 ){
            int output = value1+value2;
            System.out.println(output);

            if(output%2 == 0){
                System.out.println( "even output");
            }else {
                System.out.println("odd output");
            }

        }else if(operation==2){
            System.out.println(value1-value2);
        }
        else if(operation==3){
            System.out.println(value1*value2);
        }

        else if(operation==4){
            System.out.println(value1/value2);
        }

        else{
            System.out.println("unsupported operation");
        }



    }
}