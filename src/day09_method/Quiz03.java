package day09_method;

import java.util.Scanner;

public class Quiz03 {
	public static void main(String[] args) {
	Scanner input = new Scanner(System.in);
	Quiz03_method ex = new Quiz03_method();
	
	int num = 0, re =0;
	System.out.print("╪Ж ют╥б : ");
	num = input.nextInt();
	re = ex.add(num);
	ex.sum(re);
	
	}
}
