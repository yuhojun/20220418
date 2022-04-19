package co.edu.friend;

public class ComFriend extends Friend{
	
	private String company;
	private String department;
	
	public ComFriend() {
		super();
	}
	
	public ComFriend(String name, String phone, String company, String department) {
		super(name, phone);
		this.company = company;
		this.department = department;
		// TODO Auto-generated constructor stub
		
		
	}

	public String getCompany() {
		return company;
	}

	public void setCompany(String company) {
		this.company = company;
	}

	public String getDepartment() {
		return department;
	}

	public void setDepartment(String department) {
		this.department = department;
	}
	@Override
	public void setName(String name) {
		super.setName("이름은" + name);
	}
	@Override
	public String toString() {
		return "ComFriend [company=" + company + ", department=" + department + "]";
	}


}
