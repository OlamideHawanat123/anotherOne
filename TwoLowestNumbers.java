import java.util.Arrays;
public class TwoLowestNumbers{

public static int[] twoLowValues(int[] number){
	int lowest = number[2];
	int secondLowest = number[0];
	int[] newArray = new int [1]; 

	for(int count = 0; count < number.length; count++){ 
	if(number[count] < lowest){
	lowest = number[count];
	}
	for(int counter = 0; counter < number.length; counter++){
	if(number[counter] < secondLowest ){
	secondLowest = number[count];
	
	newArray[0] = lowest;
	newArray [1] = secondLowest;
	
}
	}
	}
	
	return newArray;
	}

public static void main(String...args){
	int[] number = {1, 2, 3, 4, 5};
	int[] lowest = twoLowValues(number);
	System.out.print(Arrays.toString(lowest));
	}











}