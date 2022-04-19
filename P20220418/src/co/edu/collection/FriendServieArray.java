package co.edu.collection;

import co.edu.friend.Friend;

//배열의 기능
public class FriendServieArray implements FriendService {
	
	Friend[] friends =new Friend[10];

	@Override
	public void addFriend(Friend friend) {
		System.out.println("정보를 추가합니다.");

	}

	@Override
	public void modFriend(Friend friend) {
		System.out.println("정보를 수정합니다.");

	}

	@Override
	public void remFriend(String name) {
		System.out.println("정보를 삭제합니다.");

	}

	@Override
	public Friend findFriend(String name) {
		System.out.println("정보를 조회합니다.");
		return null;
	}

}
