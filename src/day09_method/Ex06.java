package day09_method;

import java.util.Scanner;

public class Ex06 {
	public static void main(String[] args) {
		Ex06_method ex = new Ex06_method();
		ex.dsplay();
		
		System.out.println("--- main ���� ---");
		Scanner input = new Scanner(System.in);
		int n1,n2;
		System.out.println("�� �� �Է�");
		n1 = input.nextInt();
		n2 = input.nextInt();
		int sum = ex.test(n1,n2);
		ex.printSum(n1,n2,sum);
		
	}
}
