/**
 * 
 */
package com.java7.features.multicatch;

/**
 * @author Eedanna
 * 
 */
public class MultiCatchException {

	/**
	 * 
	 */
	public MultiCatchException() {
		// TODO Auto-generated constructor stub
	}

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int num1 = 10;
		int num2 = 0;
		int result = 0;
		int arr[] = new int[5];

		try {
			arr[0] = 0;
			arr[1] = 1;
			arr[2] = 2;
			arr[3] = 3;
			arr[4] = 4;
			arr[5] = 5;

			result = num1 / num2;
			System.out.println("Result : " + result);
		
		// Before Java -7 
		/*} catch (ArithmeticException e) {
			System.out.println("Err: Divided by Zero");

		} catch (ArrayIndexOutOfBoundsException e) {
			System.out.println("Err: Array Out of Bound");
		}*/
		
	    // Java 7- Multi Catch Exception block
		} catch (ArithmeticException | ArrayIndexOutOfBoundsException ex) {
			System.out.println("Err: Divided by Zero | Array Out of Bound");

		}
	}

}
