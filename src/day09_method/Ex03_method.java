package day09_method;

import java.util.Scanner;

public class Ex03_method {
	public void sumFunc() {
		Scanner input = new Scanner(System.in);
		int num, su, sum;
		System.out.println("ù �� �Է�");
		num = input.nextInt();
		System.out.println("�� �� �Է�");
		su = input.nextInt();
		sum = num + su;
		System.out.println("�� �� : " + sum);
	}
}
