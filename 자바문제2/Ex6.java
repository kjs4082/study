package 자바문제2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Ex6 {

	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int x , y;
		int res=1;
		
		System.out.print("x의 값을 입력하시오 : ");
		x = Integer.parseInt(br.readLine());
		
		System.out.print("y의 값을 입력하시오 : ");
		y = Integer.parseInt(br.readLine());
		
		for(int i=0; i<y; i++) {
			res = res*x;
		}
		System.out.println(x+"의 "+y+"승은 "+res);
	}

}
