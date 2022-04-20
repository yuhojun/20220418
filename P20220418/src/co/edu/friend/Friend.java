package co.edu.friend;

// 친구의 주소록 : 이름, 연락처.
// 학교친구 : 학교이름, 전공과목.
// 회사친구 : 회사이름, 부서.
public class Friend {
	// 필드.
	private String name;
	private String phone;
	private Gender gender; // 맨, 우먼

	// 생성자.
	public Friend() {

	}
	  public Gender getGender() {
	      return gender;
	   }

	   public void setGender(Gender gender) {
	      this.gender = gender;
	   }

	public Friend(String name, String phone) {
		super();
		this.name = name;
		this.phone = phone;

	}

	public Friend(String name, String phone, Gender gender) {
		super();
		this.name = name;
		this.phone = phone;
		this.gender = gender;
	}

	// 메소드.
	public String getName() {
		return name;
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

	public Gender getGender() {
		return gender;
	}

	public void setGender(Gender gender) {
		this.gender = gender;
	}

	@Override
	public String toString() {
		return "Friend [name=" + name + ", phone=" + phone + ", 성별은 = " + gender +"입니다]";
	}

}
