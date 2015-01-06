/**
 * 
 */
package com.java7.features.trywithresource;

import java.io.BufferedInputStream;
import java.io.FileInputStream;
import java.io.IOException;

/**
 * @author Eedanna
 * 
 */
public class TryWithMultipleResourcesNewStyle {

	/**
	 * 
	 */
	public TryWithMultipleResourcesNewStyle() {
		// TODO Auto-generated constructor stub
	}

	/**
	 * @param args
	 * @throws IOException
	 * @throws
	 */
	public static void main(String[] args) throws IOException {

		try (FileInputStream input = new FileInputStream("file.txt");
				BufferedInputStream bufferedInput = new BufferedInputStream(
						input)) {
			int data = bufferedInput.read();
			while (data != -1) {
				System.out.print((char) data);
				data = bufferedInput.read();
			}
		}

	}

}
