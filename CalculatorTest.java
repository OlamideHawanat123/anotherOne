import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
public class CalculatorTest{
	@Test
public void testThatCalculatorCanAddTwoNumbers(){

	Calculator input = new Calculator();
                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                          	int numberOne = 5;
	int numberTwo = 6;

	int expectedResult = input.add(numberOne, numberTwo);
	assertEquals(11, expectedResult);
	}

	@Test
public void testThatCalculatorCanSubtractANumberFromAnother(){

	Calculator input = new Calculator();

	int numberOne = 6;
	int numberTwo = 9;

	int expectedResult = input.subtract(numberOne, numberTwo);
	assertEquals(-3, expectedResult);
	}

	@Test
public void testThatCalculatorCanMultiplyTwoNumbers(){
	Calculator input = new Calculator();

	int numberOne = 6;
	int numberTwo = 7;

	int expectedResult = input.multiply(numberOne, numberTwo);
	assertEquals(42, expectedResult);
	}

	@Test
public void testThatCalculatorCanDivideANumberFromAnother(){
	Calculator input = new Calculator();

	int numberOne = 12;
	int numberTwo = 6;

	int expectedResult = input.divide(numberOne, numberTwo);
	assertEquals(2, expectedResult);
	}

	@Test

public void testThatCalculatorCanGiveTheRemainderBetweenTwoDividedNumbers(){
	Calculator input = new Calculator();

	int numberOne = 57;
	int numberTwo = 5;

	int expectedResult = input.remainder(numberOne, numberTwo);
	assertNotEquals(2, expectedResult);
	}

	
}

}