package day09_method;

public class Quiz03_method {
	public int add(int num) {
		if(num % 3 == 0) return 0;
		else return 1;
	}
	public void sum(int re) {
		if(re == 0) System.out.println("3의 배수");
		else System.out.println("3의배수가 아님");
	}
}
