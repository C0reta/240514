package NumberFormatExample;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {
	public static Scanner input = new Scanner(System.in);

	public static int getInt(String msg) {
		int num = 0;
		while (true) {
			try {
				System.out.print(msg);
				num = input.nextInt();
			} catch (InputMismatchException e) {
				System.out.println("입력 형식 오류! 다시 입력하세요.");
				input.nextLine();
				continue;
			}
			break;
		}
		return num;
	}

	public static void main(String[] args) {
		int num1, num2;
		num1 = getInt("정수 1을 입력하세요.: ");
		num2 = getInt("정수 2를 입력하세요.: ");

		System.out.printf("[result]\nnum1: %d\nnum2: %d\n", num1, num2);
	}
}
