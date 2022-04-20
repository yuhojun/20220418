package co.edu.collection;

import java.util.ArrayList;

import co.edu.friend.Friend;
import co.edu.friend.Gender;

//배열의 기능
public class FriendServieArray implements FriendService {

	Friend[] friends = new Friend[10];

	@Override
	public void addFriend(Friend friend) { // 매개변수와 리턴타입을 알아야함
		for (int i = 0; i < friends.length; i++) {
			if (friends[i] == null) {
				friends[i] = friend;
				break;
			}
		}
	}

	@Override
	public void modFriend(Friend friend) {
		for (int i = 0; i < friends.length; i++) {
			if (friends[i] != null && friends[i].getName().equals(friend.getName())) {
				friends[i].setPhone(friend.getPhone());
				break;
			}
		}
	}

	@Override
	public void remFriend(String name) {

		for (int i = 0; i < friends.length; i++) {
			if (friends[i] != null && friends[i].getName().equals(name)) {
				friends[i] = null;
				break;
			}
		}
	}

	@Override
	public Friend findFriend(String name) {

		for (int i = 0; i < friends.length; i++) {
			if (friends[i] != null && friends[i].getName().equals(name)) {
				return friends[i];
			}
		}
		return null;
	}

	@Override
	public ArrayList<Friend> findGender(Gender gender) {
		ArrayList<Friend> list = new ArrayList<Friend>();
		for(int i = 0; i<friends.size()); i++) {
			if(friends.get(i).getGender() == gender) {
				// 열거형타입 클래스타입과 같은 참조타입.
				// 기본타입 == 비교연산자.
				// 열거형 == 비교연산자로 비교.
				list.add(friends.get(i));
			}
		}
		return list;
	}

	@Override
	public ArrayList<Friend> findGender(Gender gender) {
		
		return null;
	}

}
