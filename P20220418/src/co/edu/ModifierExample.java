package co.edu;

import co.edu.friend.Friend;

class Friend2 extends Friend{
	
	public Friend2() {
		super(); //생성자 호출.
		this.getName(); //protected
		this.getPhone();// default 접근불가
	}
}

public class ModifierExample {
	public static void main(String[] args) {
		Friend friend = new Friend();
	}

}
