package basicJava;

public class ques_2 {
    public static void main(String[] args) {

        String str = "I am the best" ;


        String revstri = "";

       for (int i = str.length()-1 ; i>=0; i--  ){

           revstri =  revstri + str.charAt(i);

       }
        System.out.println(revstri);



    }


}
