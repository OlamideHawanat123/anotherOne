import java.util.Arrays;
public class HighestAndLowest{
public static int[] highestAndLowestValues(int[] number){

int highest = number[0];
int lowest = number[0];
int[] newArray = new int[2];

for(int count = 0; count < number.length; count++){
if(number[count] > highest){
highest = number[count];
}
if(number[count] < lowest){
lowest = number[count];
}
newArray[0] = highest;
newArray[1] = lowest;
}
return newArray;
}

public static void main(String...args){
int[] number = {10, 20, 30, 40};
int[] newArray = highestAndLowestValues(number);
System.out.print(Arrays.toString(newArray));
}










}