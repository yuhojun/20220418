package co.edu.friend;
// 친구의 주소록 : 이름, 연락처.
// 학교친구 : 학교이름, 전공과목.
// 회사친구 : 회사이름, 부서.
public class Friend {
	//필드.
	private String name;
	private String phone;
	
	//생성자.
	protected Friend() {
		
	}
	public Friend(String name, String phone) {
		super();
		this.name = name;
		this.phone = phone;
		
	}
	// 메소드.
	protected String getName() {
		return name;
	}
	public Friend() {
		super();
		// TODO Auto-generated constructor stub
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getPhone() {
		return phone;
	}
	public void setPhone(String phone) {
		this.phone = phone;
	}
	@Override
	public String toString() {
		return "Friend [name=" + name + ", phone=" + phone + "]";
	}
	
	
}
