public class ArraysAsiignment {
    public static void main(String[] args) {

        int[] arr = { 10, 20, 30, 40, 50 };
        int sum = 0;

        for (int i = 0; i < arr.length; i++) {
            sum += arr[i];
        }

        System.out.println("The sum of array elements is: " + sum);
        System.out.println("average of array element is " + sum/2);

    }
}
