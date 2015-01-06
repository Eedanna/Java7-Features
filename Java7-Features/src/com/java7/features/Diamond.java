/**
 * 
 */
package com.java7.features;

import java.util.HashSet;
import java.util.Set;

import static java.lang.System.out;

/**
 * @author Eedanna
 * 
 * The Class Diamond
 * 
 */
public class Diamond {

	/**
	 * 
	 */
	public Diamond() {
		// TODO Auto-generated constructor stub
	}

	/** Use of "raw" type. */
	@SuppressWarnings({ "unchecked", "rawtypes" })
	private static Set<String> rawWithoutExplicitTyping() {
		final Set<String> names = new HashSet();
		addNames(names);
		return names;
	}

	/** Explicitly specifying generic class's instantiation parameter type. */
	private static Set<String> explicitTypingExplicitlySpecified() {
		final Set<String> names = new HashSet<String>();
		addNames(names);
		return names;
	}

	/**
	 * Inferring generic class's instantiation parameter type with JDK 7's
	 * 'Diamond Operator.'
	 */
	private static Set<String> explicitTypingInferredWithDiamond() {
		final Set<String> names = new HashSet<>();
		addNames(names);
		return names;
	}

	private static void addNames(final Set<String> namesToAddTo) {
		namesToAddTo.add("Struts");
		namesToAddTo.add("Spring");
		namesToAddTo.add("Grails");
	}

	/**
	 * Main executable function.
	 */
	public static void main(final String[] arguments) {
		out.println(rawWithoutExplicitTyping());
		out.println(explicitTypingExplicitlySpecified());
		out.println(explicitTypingInferredWithDiamond());
	}
}
