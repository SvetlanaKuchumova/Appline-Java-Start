import java.util.Scanner;

public class Matrix10 {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        //Input matrix dimension
        System.out.print("Input matrix dimension:\nnumber of lines:");
        int linesCount = scan.nextInt();
        System.out.print("number of columns:");
        int columnsCount = scan.nextInt();

        double matrix[][] = new double[linesCount][columnsCount];

        //Input matrix elements
        System.out.println("Input matrix elements:");
        for(int i = 0; i < linesCount; i++ )
            for(int j = 0; j < columnsCount; j++ ){
                matrix[i][j] = scan.nextDouble();
            }

        //Output matrix
//        System.out.println("Matrix:");
//        for(int i = 0; i < linesCount; i++ ){
//            for(int j = 0; j < columnsCount; j++ ){
//                System.out.print(matrix[i][j] + "   ");
//            }
//            System.out.print("\n");
//        }

        //Output 1st line matrix * 3
        System.out.println("First line matrix * 3");
        for(int i = 0; i < columnsCount; i++ ){
                System.out.printf("%.2f   ", matrix[0][i] * 3);
        }


    }
}
