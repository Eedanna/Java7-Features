/**
 * 
 */
package com.java7.features.trywithresource;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

/**
 * @author Eedanna
 * 
 */
public class TryWithResourceNewStyle {

	/**
	 * 
	 */
	public TryWithResourceNewStyle() {
		// TODO Auto-generated constructor stub
	}

	/**
	 * @param args
	 * @throws IOException
	 * @throws FileNotFoundException
	 */
	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		try (FileInputStream input = new FileInputStream("file.txt")) {

			int data = input.read();
			while (data != -1) {
				System.out.print((char) data);
				data = input.read();
			}
		}

	}

}
