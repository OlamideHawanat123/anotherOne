import java.util.Scanner;
import java.security.SecureRandom;
public class AirlineReservationSystem{
Scanner input = new Scanner(System.in);
static SecureRandom scanner = new SecureRandom();

public static int firstClassSeats(){
int firstClassSeat = scanner.nextInt(1, 5);
System.out.println("""
-------------------------------------------------------------------
Welcome to Semicolon International Airline
You're on first class"""); 
System.out.print("Your seat number is Seat Number " + firstClassSeat);
return firstClassSeat;
}

public static int economySeats(){
int economySeat = 1 + scanner.nextInt(5, 10);
System.out.println("""
-------------------------------------------------------------------
Welcome to Semicolon International Airline
You're on Economy""");
System.out.print("Your seat number is this Seat Number " + economySeat) ;
return economySeat;
}

public static boolean seatingChart(boolean[] numberOfSeats){
for int 

public static void main(String...args){
Scanner input = new Scanner(System.in);



System.out.print("Please type '1' for First Class and type '2' for Economy : ");
int choice = input.nextInt();

switch (choice){
	case 1:
		firstClassSeats();
		break;
	case 2:
		economySeats();
		
		break;





}


}
}

