import java.util.Arrays;
public class TwoHighestNumbers{
public static int[] twoHighest(int[] number){

int[] highests = new int [2];
int maximum = number[0];
int secondMaximum = number[1];


for(int count = 0; count < number.length; count++){
if(number[count] > maximum){
maximum = number[count];
}
for(int counter = 0; counter < number.length; counter++){
if(number[counter] > secondMaximum && number[counter] < maximum){
secondMaximum = number[counter];

highests[0] = maximum;
highests[1] = secondMaximum;

}
}
}
return highests;
}

public static void main(String...args){
int[] number = {1, 4, 5, 6, 9, 7, 10, 9};
int[] highests = twoHighest(number);
System.out.print(Arrays.toString(highests));
}








}