import java.util.Scanner;

public class TrianglePrintingProgram {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("enter the base length of a triangle between 1 and 10: ");
        int userInput = input.nextInt();

        for (int count = 1; count <= userInput; count++) {
            for (int counter = 1; counter <= count ; counter++) {
                System.out.print(" *");
            }
            	System.out.println(" ");
        }

	for (int count = userInput; count <= 1; count--) {
            for (int counter = 1; counter <= count ; counter++) {
                System.out.print(" *");
            }
            System.out.println(" ");
 
        }



    }
}