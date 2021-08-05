package day09_method;

import java.util.Scanner;

public class Quiz01_method {
	public int sc(int n1,int n2) {
		if(n1>n2) return n1;
		else return n2;
	}
	public void a(int n1,int n2,int re) {
		System.out.println(n1 + "과" + n2 + "중 더 큰수" + re);
	}
}