package 자바문제3;

public class Ex1 {

	public static void main(String[] args) {
		System.out.println("더하기 : "+sum(3,5));
		System.out.println("빼기 : "+sub(7,2));
		System.out.println("곱하기 : "+mul(4,5));
		System.out.printf("나누기 : %.2f", div(7,3));
	}	
	public static int sum(int a, int b) {
		return a+b;
	}
	public static int sub(int a, int b) {
		return a-b;
	}
	public static int mul(int a, int b) {
		return a*b;
	}
	public static double div(double a, double b) {
		return a/b;
	}

}
