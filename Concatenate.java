import java.util.Arrays;

public class Concatenate {

   public static int[] descending(int[] numberOne, int[] numberTwo){
int[] newArray = new int[numberOne.length + numberTwo.length];
int pos = 0;

for(int count : numberOne){
newArray[pos] = count;
pos++;
}

for(int counter: numberTwo){
newArray[pos] = counter;
pos++;
}
for(int element: newArray){

}



for (int i = 0; i < array.length - 1; i++) {
            for (int j = 0; j < array.length - 1 - i; j++) {
                if (array[j] < array[j + 1]) {
                    // Swap elements
                    int temp = array[j];
                    array[j] = array[j + 1];
                    array[j + 1] = temp;
                }





public static void main(String...args){
int[] numberOne = {1, 3, 2};
int[] numberTwo = {4, 7, 5};

int[] result = descending(numberOne, numberTwo);
System.out.print(Arrays.toString(result));
}
}