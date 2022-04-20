package co.edu.collection;

import java.util.ArrayList;
import java.util.Scanner;

import co.edu.friend.ComFriend;
import co.edu.friend.Friend;
import co.edu.friend.Gender;

// 친구목록저장하기 위한 App.
// 추가, 수정, 삭제, 조회
// 1)배열 2)컬렉션 <= 인터페이스 구현.
public class FriendApp {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		FriendService service = new FriendServieArray();
		// FriendService service = new FriendServieList();

		// 추가, 수정, 삭제, 조회 => 컨트롤 역할을 할 수 있도록.
		while (true) {
			System.out.println("1.추가 2.수정 3.삭제 4.조회 5.남자 6.여자");
			System.out.println("선택>");

			int menu = sc.nextInt();

			if (menu == FriendService.ADD) {
				System.out.println("이름>>");
				String name = sc.next();
				System.out.println("연락처>>");
				String phone = sc.next();
				System.out.println("성별>> ex)남자 / 여자");
				String gender = sc.next();
				Gender gen = Gender.MEN;
				if (gender.startsWith("남")) {
					gen = Gender.MEN;
				} else if (gender.startsWith("여")) {
					gen = Gender.WOMEN;
				}
				Friend friend = new Friend(name, phone, gen);
				service.addFriend(friend);

			} else if (menu == FriendService.MOD) {
				System.out.println("이름>>");
				String name = sc.nextLine();
				System.out.println("연락처>>");
				String phone = sc.nextLine();
				Friend friend = new Friend(name, phone);
				service.modFriend(friend);

			} else if (menu == FriendService.DEL) {
				System.out.println("삭제할 친구이름>>");
				String name = sc.nextLine();
				service.remFriend(name);

			} else if (menu == FriendService.SEARCH) {
				System.out.println("조회할 친구이름>>");
				String name = sc.nextLine();
				Friend searchFriend = service.findFriend(name);
				service.findFriend(searchFriend.toString());
				
			} else if (menu == FriendService.FIND_MEN) { //남자친구 리스트
				ArrayList<Friend> list = service.findGender(Gender.MEN);
				for(Friend friend : list) {
					System.out.println(friend.toString());
				} 
			}else if (menu == FriendService.FIND_WOMEN) {
				ArrayList<Friend> list = service.findGender(Gender.WOMEN);
				for(Friend friend : list) {
					System.out.println(friend.toString());
				}
			} else {
				System.out.println("프로그램을 종료");
				break;
			}

		}
		System.out.println("end of prog.");
	}
}
