package 자바문제1;

public class Ex3 {

	public static void main(String[] args) {
		String name = "민들래";
		int kor = 90;
		int eng = 70;
		int mat = 75;
		int total = kor+eng+mat;
		
		System.out.println("이름 : "+name);
		System.out.println("합계점수 : "+total+"점");
		System.out.printf("평균점수 : %.1f", (total/3.0));
	}

}
