/**
 * 
 */
package com.java7.features.trywithresource;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;

/**
 * @author Eedanna
 * 
 */
public class TryWithResourceOldStyle {

	/**
	 * 
	 */
	public TryWithResourceOldStyle() {
		// TODO Auto-generated constructor stub
	}

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		InputStream input = null;
		int data;

		try {
			try {
				input = new FileInputStream("file.txt");
				data = input.read();
				while (data != -1) {
					System.out.print((char) data);
					data = input.read();
				}
			} catch (FileNotFoundException e) {
				e.printStackTrace();
			} catch (IOException e) {
				e.printStackTrace();
			}

		} finally {
			if (input != null) {
				try {
					input.close();
				} catch (IOException e) {
					e.printStackTrace();
				}
			}
		}

	}
}
