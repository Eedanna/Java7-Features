/**
 * 
 */
package com.java7.features.multicatch;

import java.lang.reflect.Field;

/**
 * @author Eedanna
 * 
 * The Class CatchMultipleExceptions
 * 
 */
public class CatchMultipleExceptions {

	/**
	 * 
	 */
	public CatchMultipleExceptions() {
		// TODO Auto-generated constructor stub
	}

	public static void main(final String[] args) {
		oldWayCatch();
		java7Catch();
		System.out.println("Result = " + sum(20, 20));
	}

	static int sum(final Integer in1, final Integer in2) {
		return in1 + in2;
	}

	static void oldWayCatch() {
		try {
			final Field value = Integer.class.getDeclaredField("value");
			value.setAccessible(true);
			final Integer obj = Integer.valueOf(2);
			value.set(obj, 21);
		} catch (final SecurityException e) {
			e.printStackTrace();
		} catch (final NoSuchFieldException e) {
			e.printStackTrace();
		} catch (final IllegalArgumentException e) {
			e.printStackTrace();
		} catch (final IllegalAccessException e) {
			e.printStackTrace();
		}
	}

	static void java7Catch() {
		try {
			final Field value = Integer.class.getDeclaredField("value");
			value.setAccessible(true);
			final Integer obj = Integer.valueOf(2);
			value.set(obj, 21);
		} catch (SecurityException | NoSuchFieldException
				| IllegalArgumentException | IllegalAccessException e) {
			e.printStackTrace();
		}
	}
}
