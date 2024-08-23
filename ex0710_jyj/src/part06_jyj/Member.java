package part06_jyj;

public class Member {
	private String name;
	private String id;
	private String password;
	private int age;
	
	public Member() {}
	public Member(String name,String id) {
		this.name=name;
		this.id=id;
	}
	public Member(String name, String id, String password, int age) {
		this(name,id);
		this.password=password;
		this.age=age;
	}
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	
	
	public static void main(String[] args) {
		Member user = new Member("홍길동","hong");
	}
	
}
