package day09_method;

import java.util.Scanner;

public class Ex07_method {
	public void reverse() {
		Scanner input = new Scanner(System.in);
		int su = 0, temp = 0;
		System.out.println("�� �Է�");
		su = input.nextInt();
		while(true) {
			temp = su % 10;
			su = su / 10;
			System.out.println(temp+", ");
			if(su == 0) {
				break;
			}
		}
	}
}
