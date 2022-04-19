package co.edu.project;

import java.util.Scanner;

public class MainExe {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		DAO dao = new OracleDAO();
		while (true) {
			System.out.println("1.입력 2.수정 3.삭제 4.목록");
			System.out.println("선택>");
			int menu = sc.nextInt();
			if(menu==1) {
				dao.insert();
			}else if (menu==2) {
				dao.update();
			}else if (menu==3) {
				dao.delete();
			}else if (menu==4) {
				dao.list();
			}else {
				break;
			}
		}
		System.out.println("프로그램 종료");
	}

}
