package 자바문제1;

public class Ex1 {

	public static void main(String[] args) {
		int pay = 1500000; // 기본급
		int tpay = 55000; // 수당
		double tax = 0.1; // 세금
		
		int money = (int)((pay+tpay)-(pay*tax));
		System.out.println("실수령액 : "+ money);
		
	}

}
