package day09_method;

public class Ex05_method {
	public int sumFunc(int num1, int num2) {
		int sum = num1 + num2;
		return sum;
	}
	public void test(int n) {
		//void는 return값이 없을때
		if(n==1) {
		System.out.println("if");
		}else {
			System.out.println("else");
			return;
			//해당 메소드를 바로 종료, 값을 돌려줄 때
		}
		System.out.println("test 메소드 종료");
	}
	public String text02() {
		int num = 1;
		if(num == 1) 
			return "안녕하세요";
		return null;
		}
	}