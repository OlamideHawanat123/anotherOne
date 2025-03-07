import java.util.HashMap;
import java.util.Scanner;

public class MovieAppFunctions{
    public static void main(String...args){
        Scanner scanner = new Scanner(System.in);
        MovieRatingApp input = new MovieRatingApp();

        HashMap<String, String> movies = new HashMap<String, String>();

        input.display();
        System.out.print("Enter your choice from above: ");
        int choice = scanner.nextInt();

        switch (choice){
            case 1:
                System.out.print("Enter the name of movie: ");
                String movie = scanner.nextLine();
              

        }
    }
}