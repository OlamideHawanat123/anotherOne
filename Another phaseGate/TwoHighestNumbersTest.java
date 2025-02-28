import java.util.Arrays;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
public class TwoHighestNumbersTest{

@Test
public void testThatTwoHighestNumbersCanPrintTwoHighestNumbersInAnArray(){
TwoHighestNumbers input = new TwoHighestNumbers();

int[] number = {1, 2, 3, 4, 5};
int[] expectedResult = input.twoHighest(number);
assertArrayEquals(new int[] {5, 4}, expectedResult);
}
}


//javac -cp "junit-platform-console-standalone-1.10.2.jar" GreatestCommonDivisorTest.java GreatestCommonDivisor.java

//java -jar junit-platform-console-standalone-1.10.2.jar --class-path . --scan-classpath --include-classname GreatestCommonDivisorTest