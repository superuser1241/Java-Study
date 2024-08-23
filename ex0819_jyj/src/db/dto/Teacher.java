package db.dto;

public class Teacher {
	private int teacherNo;
	private String teacherName;
	private String teacherJumin;
	private String teacherPhone;
	private String teacherAddr;
	private String teacherEmail;
	
	private String sugangCode;
	
	//과목정보
	private Subject subject;
	
	//강의실정보
	private Room room;
	

	public Teacher() {}

	public Teacher(int teacherNo, String teacherName, String teacherJumin, String teacherPhone, String teacherAddr,
			String teacherEmail, String sugangCode) {
		super();
		this.teacherNo = teacherNo;
		this.teacherName = teacherName;
		this.teacherJumin=teacherJumin;
		this.sugangCode = sugangCode;
		this.teacherPhone = teacherPhone;
		this.teacherAddr = teacherAddr;
		this.teacherEmail = teacherEmail;
		
	}
	
	public Teacher(int teacherNo, String teacherName, String sugangCode, String subjectName, int roomCount, int roomNo) {
        this.teacherNo = teacherNo;
        this.teacherName = teacherName;
        this.sugangCode = sugangCode;

        this.subject = new Subject();
        this.subject.setSubjectName(subjectName);

        this.room = new Room();
        this.room.setRoomNo(roomNo);
        this.room.setRoomCount(roomCount); 
    }
	

	public int getTeacherNo() {
		return teacherNo;
	}

	public void setTeacherNo(int teacherNo) {
		this.teacherNo = teacherNo;
	}

	public String getTeacherName() {
		return teacherName;
	}

	public void setTeacherName(String teacherName) {
		this.teacherName = teacherName;
	}

	public String getTeacherJumin() {
		return teacherJumin;
	}

	public void setTeacherJumin(String teacherJumin) {
		this.teacherJumin = teacherJumin;
	}

	public String getTeacherPhone() {
		return teacherPhone;
	}

	public void setTeacherPhone(String teacherPhone) {
		this.teacherPhone = teacherPhone;
	}

	public String getTeacherAddr() {
		return teacherAddr;
	}

	public void setTeacherAddr(String teacherAddr) {
		this.teacherAddr = teacherAddr;
	}

	public String getTeacherEmail() {
		return teacherEmail;
	}

	public void setTeacherEmail(String teacherEmail) {
		this.teacherEmail = teacherEmail;
	}

	public String getSugangCode() {
		return sugangCode;
	}

	public void setSugangCode(String sugangCode) {
		this.sugangCode = sugangCode;
	}
	
	

	public Subject getSubject() {
		return subject;
	}

	public void setSubject(Subject subject) {
		this.subject = subject;
	}

	public Room getRoom() {
		return room;
	}

	public void setRoom(Room room) {
		this.room = room;
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("Teacher [teacherNo=");
		builder.append(teacherNo);
		builder.append(", teacherName=");
		builder.append(teacherName);
		builder.append(", teacherJumin=");
		builder.append(teacherJumin);
		builder.append(", teacherPhone=");
		builder.append(teacherPhone);
		builder.append(", teacherAddr=");
		builder.append(teacherAddr);
		builder.append(", teacherEmail=");
		builder.append(teacherEmail);
		builder.append(", sugangCode=");
		builder.append(sugangCode);
		builder.append("]");
		return builder.toString();
	}

}
