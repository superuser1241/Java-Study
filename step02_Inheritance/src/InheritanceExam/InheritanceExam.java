package InheritanceExam;



	class Car{
		public String carname;
		public int cost;
		
		protected void printAttributes(){
			System.out.println("carname="+carname+"\tcost="+cost);
		}
	}
	//Car를 상속받는 EfSonata, Excel, Carnival 3개 클래스 작성	
	//각 클래스에 인수를 받지않는 생성자 작성
	//각 클래스의 생성자의 구현부에서 carname과 cost에 적당한 값 할당
	class EfSonata extends Car {
		public EfSonata() {
			carname = "소나타";
			super.cost = 50;// super는 부모를 지칭하는 키워드
		}
	}
	
	class Excel extends Car{
		public Excel() {
			carname = "엑셀";
			super.cost = 550;
		}
	}
	
	class Carnival extends Car{
		public Carnival() {
			carname = "카니발";
			cost = 5000;
		}
	}

	public class InheritanceExam{
	//메인메소드에서 
	public static void main(String [] args) {
		//Car, EfSonata, Excel, Canival 네개의 객체를 생성
				Car car = new Car();
				EfSonata efsonata = new EfSonata();
				Excel excel = new Excel();
				Carnival carnival = new Carnival();
				
				System.out.println(car);
				System.out.println(efsonata);
				System.out.println(excel);
				System.out.println(carnival);
				
				// 각 클래스에서 Car calss에있는 printAttributes()메소드를 호출할수있다.
				car.printAttributes();
				efsonata.printAttributes();
				excel.printAttributes();
				carnival.printAttributes();
	}
}



