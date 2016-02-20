package cse360assign3;

import static org.junit.Assert.*;

import org.junit.Test;

public class CalculatorTest {

	@Test
	public void testCalculator() {
		Calculator myCalc = new Calculator();
		assertNotNull(myCalc);
	}

	@Test
	public void testGetTotal() {
		Calculator myCalc = new Calculator();
		assertEquals(myCalc.getTotal(), 0);
	}

	@Test
	public void testAdd() {
		Calculator myCalc = new Calculator();
		myCalc.add(5);
		assertEquals(myCalc.getTotal(), 5);
		myCalc.add(12);
		assertEquals(myCalc.getTotal(), 17);
	}

	@Test
	public void testSubtract() {
		Calculator myCalc = new Calculator();
		myCalc.subtract(5);
		assertEquals(myCalc.getTotal(), -5);
		myCalc.subtract(12);
		assertEquals(myCalc.getTotal(), -17);
	}

	@Test
	public void testMultiply() {
		Calculator myCalc = new Calculator();
		myCalc.multiply(5);
		assertEquals(myCalc.getTotal(), 0);
		myCalc.add(5);
		assertEquals(myCalc.getTotal(), 5);
		myCalc.multiply(3);
		assertEquals(myCalc.getTotal(), 15);
	}

	@Test
	public void testDivide() {
		Calculator myCalc = new Calculator();
		myCalc.add(12);
		assertEquals(myCalc.getTotal(), 12);
		myCalc.divide(3);
		assertEquals(myCalc.getTotal(), 4);
		myCalc.divide(0);
		assertEquals(myCalc.getTotal(), 0);
	}

	@Test
	public void testGetHistory() {
		Calculator myCalc = new Calculator();
		myCalc.add(12);
		myCalc.divide(3);
		myCalc.subtract(1);
		myCalc.multiply(5);
		myCalc.divide(0);
		assertEquals(myCalc.getTotal(), 0);
		assertEquals(myCalc.getHistory(), "0 + 12 / 3 - 1 * 5 / 0");
	}

}
