import java.util.Scanner;

public class CompareWithConstants7 {
    public static void main(String[] args) {

        //Constants
        double X = 10.001;
        double Y = 11.0099;
        double Z = 1200;

        System.out.print("Input a number: ");
        Scanner scan = new Scanner(System.in);

        //Input number
        double number = scan.nextDouble();

        if( ( number == X ) || ( number == Y ) || ( number == Z ) ) {
            System.out.print("Данное значение имеется в константах");
        }
        else {
            System.out.print("Такой константы нет!");
        }
    }
}
