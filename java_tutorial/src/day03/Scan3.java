package day03;

import java.util.Scanner;

public class Scan3 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int 국어, 영어, 수학, 총점;
		System.out.println("국어 점수를 입력하세요 >>");
		국어 = sc.nextInt();
		System.out.println("영어 점수를 입력하세요 >>");
		영어 = sc.nextInt();
		System.out.println("수학 점수를 입력하세요 >>");
		수학 = sc.nextInt();
		
		총점 = 국어+영어+수학;
		// 국어,수학,영어는 전과목 40이상, 총점은 150이상이어야 합격
		if(국어 >= 40 && 영어 >= 40 && 수학 >=40 && 총점 >= 150) {
			System.out.println("합격");
		}else {
			System.out.println("불합격");
		}
	}
}
