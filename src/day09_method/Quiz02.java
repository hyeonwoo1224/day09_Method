package day09_method;

import java.util.Scanner;

public class Quiz02 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		Quiz02_method ex = new Quiz02_method();
		
		System.out.print("╪Ж ют╥б : ");
		int n1 = input.nextInt();
		
		ex.hj(n1);
	}
}
