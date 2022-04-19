package co.edu.friend;

public class UnivFriend extends Friend {

	private String univ;
	private String major;

	public UnivFriend(String name, String phone, String univ, String major) {
		super(name, phone);
		this.univ = univ;
		this.major = major;
	}

	@Override
	public String toString() {
		return "UnivFriende [name=" + this.getName() + ", phone=" + super.getPhone() + ", univ=" + univ +"]";
	}
}
