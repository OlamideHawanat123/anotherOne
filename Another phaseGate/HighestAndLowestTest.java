import java.util.Arrays;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
public class HighestAndLowestTest{

	@Test
public void testThatHighestAndLowestValuesCanDetectAndReturnHighestAndLowestValues(){
	HighestAndLowest input = new HighestAndLowest();

	int[] number = {1, 2, 3, 4, 5};
	int[] expectedResult = input.highestAndLowestValues(number);
	assertArrayEquals(new int[]{5, 1}, expectedResult);
	}
}