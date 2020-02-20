package 자바문제2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Ex3 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		String name;
		char gender;
		int age;
		double tall;
		
		System.out.print("Input name : ");
		name = br.readLine();
		
		System.out.print("Input gender : ");
		gender = br.readLine().charAt(0);
		
		System.out.print("Input age : ");
		age = Integer.parseInt(br.readLine());
		
		System.out.print("Input tall : ");
		tall = Double.parseDouble(br.readLine());
		
		System.out.println();
		System.out.println("이름 : "+name);
		if(gender == 'M')
			System.out.println("성별 : 남자");
		else if(gender == 'F')
			System.out.println("성별 : 여자");
		System.out.println("나이 : "+age+"세");
		System.out.println("신장 : "+tall+"cm");
	}

}
