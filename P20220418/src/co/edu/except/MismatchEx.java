package co.edu.except;

import java.util.InputMismatchException;
import java.util.Scanner;

public class MismatchEx {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		while (true) {
			System.out.println("1.추가 2.종료");
			System.out.println("선택>>");
			int menu = 0;
			
			try {
				Class.forName("java.lang.String"); //최상위 Exception
			} catch (ClassNotFoundException e2) {
				e2.printStackTrace();
			}
			
			try {
				// "10이라는 숫자값을 -> 정수 10으로 변경 ) "ten" -> 10 X  "" -> 10
				menu = Integer.parseInt(sc.next());//sc.nextInt(); //RuntimeException
				//return true; (여기까지 실행하겠다) 
			} catch (InputMismatchException  | NumberFormatException e2) { //예외인상황
				System.out.println("숫자선택.");
				sc.nextLine();
			} catch(ArrayIndexOutOfBoundsException e1 ) {
				System.out.println("배열의 범위 넘어서 처리하려고 합니다.");
				sc.nextLine();
				
			} catch (Exception e3) {
				System.out.println("알수 없는 예외 발생.");
			
			} finally { //반드시 실행해야되는 파일은 파이널리에 넣어준다.
				System.out.println("예외처리에서 반드시 한번은 실행.");
			}

			if (menu == 1) {
				System.out.println("추가작업.");
			} else if (menu == 2) {
				break;
			}
		}
		System.out.println("end of prog.");
	}
}
