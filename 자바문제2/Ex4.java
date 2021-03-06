package 자바문제2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Ex4 {

	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		double x, y;
		char operator;
		double div;
		
		System.out.print("x값을 입력하시오 : ");
		x = Integer.parseInt(br.readLine());
		
		System.out.print("y값을 입력하시오 : ");
		y = Integer.parseInt(br.readLine());
		
		System.out.print("연산자를 입력(+,-,*,/) : ");
		operator = br.readLine().charAt(0);
		
		switch(operator) {
		case '+' :
			System.out.println((int)x+"+"+(int)y+"="+(int)(x+y));
			break;
		case '-' :
			System.out.println((int)x+"-"+(int)y+"="+(int)(x-y));
			break;
		case '*' :
			System.out.println((int)x+"*"+(int)y+"="+(int)(x*y));
			break;
		case '/' :
			div = x/y;
			System.out.printf("x/y=%.2f", div);
			break;
			default:
				System.out.println("연산자 error");
		}
		
	}

}
