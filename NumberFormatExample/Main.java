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
				System.out.println("�Է� ���� ����! �ٽ� �Է��ϼ���.");
				input.nextLine();
				continue;
			}
			break;
		}
		return num;
	}

	public static void main(String[] args) {
		int num1, num2;
		num1 = getInt("���� 1�� �Է��ϼ���.: ");
		num2 = getInt("���� 2�� �Է��ϼ���.: ");

		System.out.printf("[result]\nnum1: %d\nnum2: %d\n", num1, num2);
	}
}
