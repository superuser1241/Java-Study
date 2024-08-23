package InheritanceExam;

class CarCenter{
	public void engineer(Car cd){
		System.out.print(cd.carname+" 수리완료!\t");
		System.out.println("청구비용"+cd.cost+" 원");
		
		//실행도중 ClassCastException이 발생할 확률을 낮추기 위해 instanceof 연산자 사용
		if(cd instanceof Excel) {
			//cd가 Excel 타입이 될 수 있는가?
			/**
			 * 부모타입 변수로는 자식부분 접근불가
			 * 부모타입을 자식타입으로 변환하면 자식부분을 접근할 수 있다
			 */
			//부모타입을 자식변수에 저장하기 위해 다운캐스팅 해야함
			Excel e = (Excel)cd;
			System.out.println(e);
			System.out.println(e.cost);
		}
	}
}

public class PolymorphismExam{
	public static void main(String[] args) {
		
		CarCenter cc=new CarCenter();
		EfSonata ef=new EfSonata();
		Carnival ca=new Carnival();
		Excel ex=new Excel();
		
		Car car= new Car();
		
		System.out.println(ex);
		
		cc.engineer(car);//
		cc.engineer(ef);//
		cc.engineer(ca);//
		cc.engineer(ex);//
	}
}

