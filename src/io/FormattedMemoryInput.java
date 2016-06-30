package io;

import java.io.ByteArrayInputStream;
import java.io.DataInputStream;
import java.io.EOFException;
import java.io.IOException;

public class FormattedMemoryInput {
	public static void main(String[] args) {
		try {
			DataInputStream in = new DataInputStream(new ByteArrayInputStream(
					new BufferedInputFile().read("E:/Java/thinkinjava/src/io/FormattedMemoryInput.java").getBytes()));
			while (true) {
				System.out.println((char) in.readByte());
			}
		} catch (EOFException e) {
			System.err.println(););
		}
	}
}
