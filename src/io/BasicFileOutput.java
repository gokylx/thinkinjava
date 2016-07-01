package io;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.io.StringReader;

public class BasicFileOutput {
	static String outfile = "E:/Java/thinkinjava/src/io/BasicFileOutput.out";
	static String srcfile = "E:/Java/thinkinjava/src/io/BasicFileOutput.java";

	public static void main(String[] args) throws IOException {
		BufferedReader in = new BufferedReader(new StringReader(BufferedInputFile.read(srcfile)));
		PrintWriter out = new PrintWriter(new BufferedWriter(new FileWriter(outfile)));

		String s;
		int lineCount = 1;

		while ((s = in.readLine()) != null) {
			out.println(lineCount++ + ":" + s);
		}

		out.close();
	}
}
