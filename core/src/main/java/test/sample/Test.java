package test.sample;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;

public class Test {

	public static void main(String[] args) {
		try (InputStream input = new FileInputStream("in.txt");
				OutputStream output = new FileOutputStream("out.txt")) {
			byte[] buf = new byte[1024];
			int len;
			while ((len = input.read(buf)) >= 0)
				output.write(buf, 0, len);
		} catch (IOException e) {
			e.printStackTrace();
		}

	}
}
