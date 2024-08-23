package ex0729.map;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Properties;
import java.util.Set;

public class MapExam {
	Map<Integer, String> map = new HashMap<>();
	
	public MapExam() {
		/*
		 * put에 리턴은 value를 리턴하는데
		 * key중복이 아니면 null
		 * key중복이면 같은 key에 해당하는 value를 수정하기 전에 value를 리턴해준다.
		 * */
		
		String re = map.put(10, "영준");
		System.out.println("re: "+re);
		
		re = map.put(20, "나영");
		System.out.println("re: "+re);
		
		re = map.put(30, "영준");
		System.out.println("re: "+re);
		
		map.put(50, "미미");
		map.put(60, "서희");
		
		System.out.println("저장된 개수: "+ map.size());
		System.out.println("map: "+map);
		
		//map에 key와 value 조회
		
		//모든 key들의 정보를 먼저 조회해야한다!
		Set<Integer>set = map.keySet();
		Iterator<Integer> keys = set.iterator();
		
		while(keys.hasNext()) {//요소가 있는지 없는지 체크
			int key = keys.next();
			String value = map.get(key);
			System.out.println(key+" : "+value);
		}
		System.out.println();
		
		//개선된 for문으로 변경
		for(Integer key: map.keySet()) {
			String value = map.get(key);
			System.out.println(key+" : "+value);
		}
		System.out.println();
		
		//Map.Entry<K,V>
		Set<Map.Entry<Integer, String>> entrySet = map.entrySet();
		Iterator<Map.Entry<Integer, String>> it = entrySet.iterator();
		
		while(it.hasNext()) {
			Map.Entry<Integer,String> entry = it.next();
			System.out.println(entry.getKey() + "|" + entry.getValue());
			
		}
		
		System.out.println("-------------개선된 for문 변경------------");
		for(Map.Entry<Integer, String> m : map.entrySet()) {
			System.out.println(m.getKey() + "|" + m.getValue());
		}
		
	}
	
	public static void main(String[] args) {
		new MapExam();
	}

}
