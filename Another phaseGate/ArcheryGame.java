import java.util.Scanner;
import java.util.Arrays;
import java.security.SecureRandom;
public class ArcheryGame{
Scanner input = new Scanner(System.in);
static SecureRandom scanner = new SecureRandom();

public static int playerScore(int[][] number){
int countWin = 0;
int[][] thePlayersScore = new int [4][4];

for(int count = 1; count <= 4; count++){
while(count < 3){
int generateScore = scanner.nextInt(0, 10);
thePlayersScore(generateScore);
}
}









}
}

