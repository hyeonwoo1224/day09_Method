package day09_method;

import java.util.Scanner;

public class Quiz01 {
	public static void main(String[] args) {
		Quiz01_method ex = new Quiz01_method();
		Scanner input = new Scanner(System.in);
		System.out.print("두 수 입력 : ");
		int n1 = input.nextInt();
		int n2 = input.nextInt();
		int re = ex.sc(n1, n2);
		
		ex.sc(n1, n2);
		ex.a(n1, n2, re);
	}
}
