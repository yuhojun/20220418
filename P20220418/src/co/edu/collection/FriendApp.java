package co.edu.collection;

import java.util.Scanner;

import co.edu.friend.ComFriend;

// 친구목록저장하기 위한 App.
// 추가, 수정, 삭제, 조회
// 1)배열 2)컬렉션 <= 인터페이스 구현.
public class FriendApp {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		FriendService service = new FriendServieArray();
		// FriendService service = new FriendServieList();
		// 추가, 수정, 삭제, 조회 => 컨트롤 역할을 할 수 있도록.
		
		while(true) {
			System.out.println("1.추가 2.수정 3.삭제 4.조회");
			System.out.println("선택>");
			int menu = sc.nextInt();
			
			if(menu == 1) {
				service.addFriend(null);
				System.out.println(">>");
				String addFriend = sc.next();
				System.out.println(">>");
				String modFriend = sc.next();
				new ComFriend(name, phone);
		}else if (menu ==2) {
			service.modFriend(null);
		}else if (menu ==3) {
			service.remFriend(null);
		}else if (menu ==4) {
			service.findFriend(null);
		}else {
			break;
		}

	}
	}
}
