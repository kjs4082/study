package �ڹٹ���2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Ex2 {

	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		System.out.println("**** �ﰢ���� ���� ���ϱ� ****");
		
		int w, h;
		
		System.out.print("�غ� : ");
		w = Integer.parseInt(br.readLine());
		
		System.out.print("���� : ");
		h = Integer.parseInt(br.readLine());
		
		System.out.println();
		
		double area = (w * h)/2;
		System.out.printf("���� : %.2f", area);
	}

}
