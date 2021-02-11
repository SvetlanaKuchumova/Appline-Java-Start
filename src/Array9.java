import java.util.Scanner;

public class Array9 {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        //Input number of array elements
        System.out.print("Input number of array elements: ");
        int number = scan.nextInt();

        double arrayNumbers[] = new double[number];

        //Input elements of array
        System.out.println("Input elements:");
        for(int i = 0; i < arrayNumbers.length; i++ ){
            arrayNumbers[i] = scan.nextDouble();
        }

        //Output elements * 2
        System.out.println("Array with elements * 2:");
        for(int i = 0; i < arrayNumbers.length; i++ ){
            System.out.println(arrayNumbers[i] * 2);
        }
    }
}
