import java.util.Arrays;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class MaxAndMinTest{
	@Test
	
public void testThatMaxAndMinReturnsLowestAndHighestValuesInAnArray(){
	MaxAndMin input = new MaxAndMin();
	int[] number = {1, 2, 3, 4, 5};
	int[] expectedResult = input.highestAndMinimum(number);
	assertArrayEquals(new int[] {5, 1}, expectedResult);

	}
	
}