import java.util.Scanner;

public class Triangle {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("enter the base length of a triangle between 1 and 10: ");
        int userInput = input.nextInt();

        for (int firstTriangle = 1; firstTriangle <= userInput; firstTriangle++) {
	for(int secondTriangle = 1; secondTriangle >= userInput; secondTriangle--){
	System.out.print(" *");
}
}
}
}