import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;
public class SecondCalculatorTest{

	@Test
	public void testThatCalculatorCanAddTwoNumbers(){
	
	//Precondition
	SecondCalculator myCalculator = new SecondCalculator();
	
	// Action
	int sum = myCalculator.add(2, 4);
	
	//Check/Assert
	assertEquals(6, sum);


}

@Test
public void testThatCalculatorCanSubtractANumberFromAnother(){

	SecondCalculator myCalculator = new SecondCalculator();
	int subtraction = myCalculator.subtract(7, 15);
	assertEquals(-8, subtraction);
	}

@Test
public void testThatCalculatorCanMultiplyTwoNumbers(){
	SecondCalculator myCalculator = new SecondCalculator();

	int numberOne = 8;
	int numberTwo = 2;

	int expectedResult = myCalculator.multiply(numberOne, numberTwo);
	assertEquals(16, expectedResult);
	}


	




}