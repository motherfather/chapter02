package chapter02;

//import java.io.BufferedReader;
//import java.io.IOException;
//import java.io.InputStream;
import java.io.*;

public class Echo {

	public static void main(String[] args) throws IOException {

		InputStreamReader input = new InputStreamReader(System.in);

		BufferedReader reader = new BufferedReader(input);
		String keyboardinput = reader.readLine();

		System.out.print(keyboardinput);
		System.out.println("has entered.");
	}
}
