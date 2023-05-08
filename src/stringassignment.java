import java.util.Scanner;

public class stringassignment {

    public static void main(String[] args) {

        // question no. 1
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a string: ");
        String inputString = scanner.nextLine().toLowerCase();


        int vowelCount = 0;
        int consonantCount = 0;


        for (int i = 0; i < inputString.length(); i++) {
            char ch = inputString.charAt(i);


            if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') {
                vowelCount++;
            } else if (ch >= 'a' && ch <= 'z') {
                consonantCount++;
            }
        }


        System.out.println("Number of vowels in the string: " + vowelCount);
        System.out.println("Number of consonants in the string: " + consonantCount);
    }
}
