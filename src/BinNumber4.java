import java.util.Scanner;

public class BinNumber4 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Input a binary number: ");
        //Input a binary number
        String BinNumber = scan.nextLine();
        //Convert binary number to decimal
        int DecNumb = Integer.parseInt(BinNumber, 2);
        //Output a decimal number
        System.out.print("Decimal number: ");
        System.out.println(DecNumb);
    }
}
