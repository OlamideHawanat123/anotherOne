public class DivisibleNumber{
public static int calulateSumOfNumbersDivisibleByThree(int number){
int sumOfNumbers = 0;
for(int count = 0; count <= number; count+= 3){
sumOfNumbers+= count;
}
return sumOfNumbers;
}

public static void main(String...args){
int number = 60;
System.out.print(calulateSumOfNumbersDivisibleByThree(number));
}









}