package 자바문제2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

// 문제8번
public class Ex5 {

	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int a, b; // 중간, 기말
		int c, d; // 과제, 출석
		double sum;
		char grade;
		String result;
		
		System.out.print("중간고사를 입력하시오 : ");
		a = Integer.parseInt(br.readLine());
		
		System.out.print("기말고사를 입력하시오 : ");
		b = Integer.parseInt(br.readLine());
		
		System.out.print("과제점수를 입력하시오 : ");
		c = Integer.parseInt(br.readLine());
		
		System.out.print("출석점수를 입력하시오 : ");
		d = Integer.parseInt(br.readLine());
		
		sum = ((a+b)/2)*0.6+(c*0.2)+(d*0.2);
		
		if(sum>=90 && sum<=100)
			grade = 'A';
		else if(sum>=80 && sum<90)
			grade = 'B';
		else if(sum>=70 && sum<80)
			grade = 'C';
		else if(sum>=60 && sum<70)
			grade = 'D';
		else
			grade = 'F';
		
		switch(grade) {
		case 'A' :
		case 'B' :
			result = "excellent";
			break;
		case 'C' :
		case 'D' :
			result = "good";
			break;
		case 'F' :
			result = "poor";
			break;
			default:
				result = "오류입니다.";
		}
		
		System.out.printf("성적 = %.2f\n", sum);
		System.out.println("학점 = "+grade);
		System.out.println("평가= "+result);
		
	}

}
