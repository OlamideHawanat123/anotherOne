import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
public class DivisibleNumberTest{

@Test
public void testThatDivisibleNumberCanSumNumbersThatAreDivisibleByThree(){
DivisibleNumber input = new DivisibleNumber();

int number = 50;
int expectedResult = input.calulateSumOfNumbersDivisibleByThree(number);
assertEquals(408, expectedResult);
}

}