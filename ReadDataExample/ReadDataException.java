package ReadDataExample;

import java.util.InputMismatchException;
import java.util.Scanner;

public class ReadDataException {
	public static Scanner input = new Scanner(System.in);

	public static int readInt() {
		int integer;
		while (true) {
			try {
				System.out.print("정수를 입력하세요.: ");
				integer = input.nextInt();
			} catch (InputMismatchException e) {
				System.out.println("Input error, re-enter.: ");
				input.nextLine();
				continue;
			}
			break;
		}
		return integer;

	}

	public static double readDouble() {
		double double1;
		while (true) {
			try {
				System.out.print("실수를 입력하세요.: ");
				double1 = input.nextDouble();
			} catch (InputMismatchException e) {
				System.out.println("Input error, re-enter.: ");
				input.nextLine();
				continue;
			}
			break;
		}

		return double1;

	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num1 = readInt();
		double double1 = readDouble();

		System.out.printf("[result]\nint1: %d\ndouble1: %f\n", num1, double1);

	}
}
