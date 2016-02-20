
package cse360assign3;

public class Calculator {

	private int total;
	
	/**
	 * Default constructor
	 */
	public Calculator () {
		total = 0;  // not needed - included for clarity
	}
	
	/**
	 * 
	 * @return
	 */
	public int getTotal () {
		return total;
	}
	
	/**
	 * 
	 * @param value Integer to add
	 */
	public void add (int value) {
		total = total + value;
	}
	
	/**
	 * 
	 * @param value Integer to subtract
	 */
	public void subtract (int value) {
		total = total - value;
	}
	
	/**
	 * 
	 * @param value Integer to multiply
	 */
	public void multiply (int value) {
		total = total * value;
	}
	
	/**
	 * 
	 * @param value Integer to divide
	 */
	public void divide (int value) {
		if (value == 0)
			total = 0;
		else
			total = total / value;
	}
	
	/**
	 * 
	 * @return
	 */
	public String getHistory () {
		return "";
	}
}
