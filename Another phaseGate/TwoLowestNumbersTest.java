import java.util.Arrays;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
public class TwoLowestNumbersTest{
@Test

	public void testThatTwoLowestNumbersPrintsTheTwoLowestNumbers(){
	TwoLowestNumbers input = new TwoLowestNumbers();

	int[] number = {1, 2, 3, 4, 5};
	int[] expectedResult = input.twoLowValues(number);
	assertArrayEquals(new int[] {2, 1}, expectedResult);
}
}
