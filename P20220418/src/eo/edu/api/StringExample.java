package eo.edu.api;

import java.util.Scanner;

public class StringExample {
public static void main(String[] args) {

	
	
	String gender1;
	
	// 주민번호 => 생년월일 - 남/여
	
	
	// 950405-2345678 => 95년 4월 5일 생, 여자입니다.
	// 991001-1234567 => 99년 10월 1일 생, 남자입니다.
	// 9704051234567 => 97년 4월 5일 생, 남자입니다.
	// 0505053456789 => 05년 5월5일 생, 남자입니다.
	if (gender == '1') {
		gender1 = "남자";
	} else if (gender == '2') {
		gender1 = "여자";
	} else {
		gender1 = "성별이 없습니다.";
	}
	
	
	String result = checkInfo("950405-2345678");
	System.out.println("95년 4월 5일 생, 여자입니다.");
	
	}
	
	public static String checkInfo(String jumin) {
		// 기능구현.
		Scanner sc = new Scanner(System.in);
		System.out.println("");
		String str = "당신의 주민번호를 입력하세요.";
		String result = str.substring(0, 2);
		String result2 = str.substring(2, 4);
		String result3 = str.substring(4, 6);
		//String result4 = str.substring(0);
		
		System.out.println(result);
		System.out.println(result2);
		System.out.println(result3);
		
		return "95년 4월 5일 생, 여자입니다.";
	}

}
