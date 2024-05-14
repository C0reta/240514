package NumberFormatExample;

import java.util.Scanner;
import java.util.InputMismatchException;

public class NumberFormatExample {
	public static Scanner input = new Scanner(System.in);

	public static int getInt(String message) {
		int num = 0;
		while (true) {
			try {
				System.out.print(message);
				num = input.nextInt();
				break;
			} catch (InputMismatchException e) {
				System.out.println("입력 형식 오류! 정수를 입력하세요.");
				input.nextLine(); // 그거 먹어가기...
				continue;
			}
		}
		return num;
	}

	public static double getDouble(String message) {
		double num = 0;
		while (true) {
			try {
				System.out.print(message);
				num = input.nextDouble();
			} catch (InputMismatchException e) {
				System.out.println("입력 형식 오류! 실수를 입력하세요.");
				input.nextLine();
				continue;
			}
			break;
		}
		return num;
	}

	public static void getResult(int int1, double double1) {
		System.out.println("int1: " + int1);
		System.out.println("double1: " + double1);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int int1;
		double double1;

		int1 = getInt("정수를 입력하세요.: ");
		double1 = getDouble("실수를 입력하세요.: ");

		getResult(int1, double1);

	}

}
