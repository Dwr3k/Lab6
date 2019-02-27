import static org.junit.Assert.*;

import org.junit.Test;

public class BinStringTest {

	@Test
	public void testConvert() 
	{
		String target = "11001000";
		assertEquals(target, BinString.convert("Yo"));
		
		target = "1011100100";
		assertEquals(target, BinString.convert("derrick"));
	}

	@Test
	public void testSum() {
		int expected = 487;
		assertEquals(expected, BinString.sum("Angel"));
		
		expected = 639;
		assertEquals(expected, BinString.sum("Torres"));
	}

	@Test
	public void testDecimalToBinary() 
	{
		String expected = "11111010";
		assertEquals(expected, BinString.decimalToBinary(250));
		
		expected = "1111";
		assertEquals(expected, BinString.decimalToBinary(15));
	}

	@Test
	public void testBinaryToDecimal() {
		int expected = 38;
		assertEquals(expected, BinString.binaryToDecimal("100110"));
		
		expected = 107;
		assertEquals(expected, BinString.binaryToDecimal("1101011"));
	}

}
