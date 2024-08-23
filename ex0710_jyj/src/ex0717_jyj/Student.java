package ex0717_jyj;

public class Student {
    private String name;
    private int age;
    private String addr;
    
    
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		if(age<18) {
			System.out.println("변경할 수 없습니다");
			return ;
		}
		this.age = age;
	}
	public String getAddr() {
		return addr;
	}
	public void setAddr(String addr) {
		this.addr = addr;
	}
    
    
}
