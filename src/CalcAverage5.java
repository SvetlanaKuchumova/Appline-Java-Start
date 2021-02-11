import java.util.Scanner;

public class CalcAverage5 {
    public static void main(String[] args) {

        System.out.print("Input 3 numbers: ");
        Scanner scan = new Scanner(System.in);

        //Input numbers
        double x = scan.nextDouble();
        double y = scan.nextDouble();
        double z = scan.nextDouble();

        //Output avarage (x, y, z)
        double avg = (x + y + z) / 3 ;
        System.out.printf("Average = %.2f \n", avg);

        int avg_div2 =  (int)avg / 2;
        // System.out.println(avg_div2); -- output avarage / 2

        if (avg_div2 > 3){
            System.out.println("Программа выполнена корректно");
        }
    }
}
