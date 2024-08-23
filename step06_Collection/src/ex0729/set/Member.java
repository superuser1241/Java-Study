package ex0729.set;

public class Member {
	private String name;
	private int age;
	private String addr;
	
	public Member() {}
	public Member(String name, int age, String addr) {
		super();
		this.name = name;
		this.age = age;
		this.addr = addr;
	}
	
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
		this.age = age;
	}
	public String getAddr() {
		return addr;
	}
	public void setAddr(String addr) {
		this.addr = addr;
	}
	
	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("Member [name=");
		builder.append(name);
		builder.append(", age=");
		builder.append(age);
		builder.append(", addr=");
		builder.append(addr);
		builder.append("]");
		return builder.toString();
	}
	
	
	/*
	super.add(new Member("주영준", 22, "서울"));
	super.add(new Member("주영준", 22, "성남"));
	super.add(new Member("주영준", 22, "분당"));
	*/
	
	@Override
	public int hashCode() {
		//int no = (int)(Math.random()*3);
		//System.out.println("hashCode() call..."+ no);
		System.out.println("hashcode call "+ name.hashCode());
		return name.hashCode()+age;
	}
	
	@Override
	public boolean equals(Object obj) {
		System.out.println("equals() call");
		if(obj instanceof Member m) {
			if(name.equals(m.getName())&& age == m.getAge()) {
				return true;
			}
		}
		return false;
	}

}
