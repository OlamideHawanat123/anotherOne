import java.util.ArrayList;

public class SimpleRemoveDuplicates {

	public static void main(String[] args) {
        	int[] numbers = {1, 2, 2, 3, 7, 8};
        	int[] result = removeDuplicates(numbers);
        	for (int number : result) {
            		System.out.print(number + " ");
        	}
	}

    public static int[] removeDuplicates(int[] numbers) {
        ArrayList<Integer> uniqueNumbers = new ArrayList<>();
        for (int number : numbers) {
            if (!uniqueNumbers.contains(number)) {
                uniqueNumbers.add(number);
            }
        }
        int[] result = new int[uniqueNumbers.size()];
        for (int count = 0; count < uniqueNumbers.size(); count++) {
            result[count] = uniqueNumbers.get(count);
        }
        return result;
    }

}
