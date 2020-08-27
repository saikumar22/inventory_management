package model;

public class Employee {
	private String Id;
	private String name;
	private String age;
	private String emailid;
	private String mobile;
	private String education;
	private String salary;


	public Employee(String Id, String name, String age, String emailid, String mobile, String education,String salary) {
		// TODO Auto-generated constructor stub
		this.Id=Id;
		this.name=name;
		this.age=age;
		this.emailid=emailid;
		this.mobile=mobile;
		this.education=education;
		this.salary=salary;
		
	}
	public String getId() {
		return Id;
	}
	public void setId(String Id) {
		this.Id = Id;
	}
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getage() {
		return age;
	}
	public void setAge(String age) {
		this.age = age;
	}
	public String getemailId() {
	return emailid;
    }
	public void setEmailId(String emailid) {
	this.emailid = emailid;
	}
	public String getmobile() {
	return mobile;
	}
	public void setMobile(String mobile) {
	this.mobile = mobile;
	}
	public String geteducation() {
	return education;
	}
	public void setEducation(String education) {
	this.education = education;
	}
	public String getsalary() {
	return salary;
	}
	public void setSalary(String salary) {
	this.salary = salary;
	}
}