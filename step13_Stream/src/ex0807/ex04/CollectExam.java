package ex0807.ex04;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class CollectExam {
	public CollectExam() {
		List<Student> list = new ArrayList<Student>();
		list.add(new Student("영준","남", 100));
		list.add(new Student("효민","남", 85));
		list.add(new Student("재석","남", 90));
		list.add(new Student("민서","여", 75));
		list.add(new Student("나영","여", 80));
		
		//남학생만 list로 만들고 싶을 때
		List<Student> maleList =list.stream()
		.filter(s->s.getGender().equals("남"))
		.collect(Collectors.toList());
		
		maleList.stream().forEach(s->System.out.println(s));
		
		System.out.println("----List --> Map으로 변환-----");
		
		//학생의 이름을 key, 학생의 점수를 value로 갖는 Map 만들기
		Map<String, Integer> map = 
				list.stream()
				.collect(Collectors.toMap(s->s.getName(), s->s.getScore()));
		System.out.println(map);
	}
	public static void main(String[] args) {
		new CollectExam();
	}

}
