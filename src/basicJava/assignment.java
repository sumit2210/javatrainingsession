package basicJava;

public class assignment {
    public static void main(String[]args){

      /* int year=2020;

        if(((year % 4 ==0) && (year % 100 !=0)) || (year % 400==0)){

            System.out.println("LEAP YEAR");

        }

        else{

            System.out.println("COMMON YEAR");

        }
       */

     /* int marks=65;



    if(marks<50){

        System.out.println("fail");

    }

    else if(marks>=50 && marks<60){

        System.out.println("D grade");

    }

    else if(marks>=60 && marks<70){

        System.out.println("C grade");

    }

    else if(marks>=70 && marks<80){

        System.out.println("B grade");

    }

    else if(marks>=80 && marks<90){

        System.out.println("A grade");

    }else if(marks>=90 && marks<100){

        System.out.println("A+ grade");

    }else{

        System.out.println("Invalid!");

    }
      */
        //Specifying month number

        int month=7;

        String monthString="";

        //Switch statement

        switch(month){

            //case statements within the switch block

            case 1: monthString="1 - January";

                break;

            case 2: monthString="2 - February";

                break;

            case 3: monthString="3 - March";

                break;

            case 4: monthString="4 - April";

                break;

            case 5: monthString="5 - May";

                break;

            case 6: monthString="6 - June";

                break;

            case 7: monthString="7 - July";

                break;

            case 8: monthString="8 - August";

                break;

            case 9: monthString="9 - September";

                break;

            case 10: monthString="10 - October";

                break;

            case 11: monthString="11 - November";

                break;

            case 12: monthString="12 - December";

                break;

            default:System.out.println("Invalid Month!");

        }

        //Printing month of the given number

        System.out.println(monthString);


    }


}
