import java.util.Scanner;
 public class CheckOutApp {
  public static void main(String[] args){

  Scanner sc = new Scanner(System.in);
  System.out.println("What is the customer's name?: ");
  String name = sc.nextLine();
  System.out.println();

 System.out.println("What did the user buy?: ");
 String item = sc.nextLine();
 System.out.println();

 System.out.println("How much per unit?: ");
double perUnit = sc.nextDouble();
System.out.println();

System.out.println("Do you want to add more item? (yes/no): ");
String userReply = sc.next();

int userReply = 0;

while  (userReply.equal("yes")) {

System.out.println("What did the user buy?: ");
String items = sc.nextLine();

System.out.println("How many pieces: ");
int pieces = sc.nextInt();

System.out.println("How much per unit: ");
double perUnit = sc.nextDouble();

 } else (!relpy.equalsIgnoreCase("yes")){
System.out.println("Invalid input.Please enter a correct input: ");
}
   if  (reply.equalsIgnoreCase("no")) {
 System.out.println("What did the user buy?: ");
String items = sc.nextLine();

System.out.println("How many pieces: ");
int pieces = sc.nextInt();

System.out.println("How much per unit: ");
double perUnit = sc.nextDouble();

 } else if (!reply.equalsIgnoreCase("no")) {
 System.out.println("Invalid input.Please enter a correct input: ");
 } 
   
    }
 }