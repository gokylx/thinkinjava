package io;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class EchoLetterUp {
	public static void main(String[] args) throws IOException {
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		String s;
		while (((s = in.readLine().toUpperCase()) != null) && (s.length() != 0)) {
			System.out.println(s);
		}
	}
}
