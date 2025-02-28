public class SumUniqueElement {
    public static int NonUniqueElements(int[] number) {
	int unique = 0;
        for (int count = 0; count < number.length; count++) {
	if (number[count] == number[count]) {
	unique+= number[count];
	}
	}
	return unique;

       }

public static void main(String[] args) {
        int[] number = {1, 2, 3, 2};
        int uniqueSum = NonUniqueElements(number);
	System.out.print(uniqueSum);
    	}

	}
