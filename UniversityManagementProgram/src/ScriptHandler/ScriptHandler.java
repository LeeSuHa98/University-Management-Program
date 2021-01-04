package ScriptHandler;

import java.util.Scanner;

public class ScriptHandler {
	Scanner sc = new Scanner(System.in);

	public char getChar(String msg) {
		char value;

		System.out.print(msg);
		value = sc.next().charAt(0);

		return value;
	}

	public String getString(String msg) {
		String value;

		System.out.print(msg);
		value = sc.next();

		return value;
	}

	public int getInteger(String msg) {
		int value;

		System.out.print(msg);
		value = sc.nextInt();

		return value;
	}
}
