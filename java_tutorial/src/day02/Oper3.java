package day02;

public class Oper3 {
	public static void main(String[] args) {
		// 자료형 변환
		double pi = 3.14;
		
		System.out.println(pi);
		System.out.println((int)pi);
		System.out.println((double)9/4);
		
		// 합계와 평균 구하기
		int 수학 = 77, 영어 = 82, 국어 = 100;
		// 합계 : 259
		// 평균 : 86.3333333
		System.out.println("합계 : "+(수학+영어+국어));
		System.out.println("평균 : "+(((double)수학+영어+국어)/3));
		
	}
}
