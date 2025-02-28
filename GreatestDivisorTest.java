import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;
public class GreatestDivisorTest{

	@Test
public void testThatGreatestDivisorCanGiveTheGratestDivisorBetweenTwoNumbers(){

	GreatestDivisor input = new GreatestDivisor();
int numberOne = 125;
int numberTwo = 2525;

int expectedResult = input.commonDivisor(numberOne, numberTwo);
assertEquals(25,expectedResult);
} 
}


