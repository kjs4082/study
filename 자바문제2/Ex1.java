package 자바문제2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Ex1 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		String name;
		int kor, eng, mat;
		
		System.out.print("Input name : ");
		name = br.readLine();
		
		System.out.print("kor : ");
		kor = Integer.parseInt(br.readLine());
		
		System.out.print("eng : ");
		eng = Integer.parseInt(br.readLine());
		
		System.out.print("mat : ");
		mat = Integer.parseInt(br.readLine());
		
		System.out.println();
		System.out.println("이름 : "+name);
		int total = kor + eng + mat;
		System.out.println("합계점수 : "+total);
		System.out.printf("평균점수 : %.1f", (total/3.0));
	}

}
