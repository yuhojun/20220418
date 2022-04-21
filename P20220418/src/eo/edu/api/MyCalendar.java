package eo.edu.api;

import java.util.Scanner;

public class MyCalendar {
	public static void main(String[] args) {
		String y = "2020";
		String m = "02"; // "06" 또는 "6";
		
		showCal(y, m);
	}
	
	// 달력
	public static void showCal(String year, String month) {
		Scanner sc = new Scanner(System.in);
		
		
		System.out.println("년도를 입력>>");
		int y = sc.nextInt();
		System.out.println("월 입력");
		int m = sc.nextInt();
		
		
		System.out.println("Sun, Mon, Tue, Wed, Thr, Fri, Sat");
		System.out.println("==================================");
		System.out.println("");
		System.out.println("");
		System.out.println("");
		System.out.println("");
		System.out.println("==================================");
	}
	
}
