package day09_method;

public class Ex05_method {
	public int sumFunc(int num1, int num2) {
		int sum = num1 + num2;
		return sum;
	}
	public void test(int n) {
		//void�� return���� ������
		if(n==1) {
		System.out.println("if");
		}else {
			System.out.println("else");
			return;
			//�ش� �޼ҵ带 �ٷ� ����, ���� ������ ��
		}
		System.out.println("test �޼ҵ� ����");
	}
	public String text02() {
		int num = 1;
		if(num == 1) 
			return "�ȳ��ϼ���";
		return null;
		}
	}