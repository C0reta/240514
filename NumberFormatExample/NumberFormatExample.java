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
				System.out.println("�Է� ���� ����! ������ �Է��ϼ���.");
				input.nextLine(); // �װ� �Ծ��...
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
				System.out.println("�Է� ���� ����! �Ǽ��� �Է��ϼ���.");
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

		int1 = getInt("������ �Է��ϼ���.: ");
		double1 = getDouble("�Ǽ��� �Է��ϼ���.: ");

		getResult(int1, double1);

	}

}
