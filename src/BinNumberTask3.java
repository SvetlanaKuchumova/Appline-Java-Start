import java.util.Scanner;

public class BinNumberTask3 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Input a binary number: ");
        //Input a binary number
        String BinNumber = scan.nextLine();
        //Output a decimal number
        System.out.print("Decimal number: ");
        System.out.println(Integer.parseInt(BinNumber, 2));
    }
}
