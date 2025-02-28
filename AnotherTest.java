import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotEquals;
public class AnotherTest{

 

	@Test
	public void testThatCanAddNumber(){
		Another another = new Another();
		int sum = another.addTwoNumbers(2, 6);
		assertNotEquals(sum, 10);
	}


	@Test
	public void testThatCanSubtractNumbers(){
		Another another = new Another();
		int num = another.sub(5,3);
		assertEquals(num, 12);
	}
	










}
