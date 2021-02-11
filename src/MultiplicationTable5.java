import java.util.Scanner;

public class MultiplicationTable5 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Input a number: ");

        //Input a number
        double Number = scan.nextDouble();
        //Counter from 1 to 10
        int i = 1;

        //Output the multiplication table
        System.out.println(i + " x " + Number + " = " + Number*i++);
        System.out.println(i + " x " + Number + " = " + Number*i++);
        System.out.println(i + " x " + Number + " = " + Number*i++);
        System.out.println(i + " x " + Number + " = " + Number*i++);
        System.out.println(i + " x " + Number + " = " + Number*i++);
        System.out.println(i + " x " + Number + " = " + Number*i++);
        System.out.println(i + " x " + Number + " = " + Number*i++);
        System.out.println(i + " x " + Number + " = " + Number*i++);
        System.out.println(i + " x " + Number + " = " + Number*i++);
        System.out.println(i + " x " + Number + " = " + Number*i);
    }
}
