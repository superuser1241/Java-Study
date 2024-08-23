package ex0719.contsructor.goods;
/**
  요청 결과를 출력할 view
*/
public class EndView{
   /**
     성공여부 메시지를 출력하는 메소드 
   */
   public static void printMessage(String message){
      System.out.println(message+"\n");
   }

   /**
     전체검색 결과를 출력하는 메소드
   */
   public static void printSelectAll(Goods [] arr){//service에 있는 주소가 전달되었다.
	  for(int i = 0; i<GoodsService.count; i++) {
		  System.out.print("코드:"+arr[i].getCode()+"|");
		  System.out.print("과자 이름:"+arr[i].getName()+"|");
		  System.out.print("가격:"+arr[i].getPrice()+"|");
		  System.out.print("맛 설명:"+arr[i].getExplain()+"\n");
	  }
   }

   /**
     상품코드에 해당하는 상세정보 출력하는 메소드 
   */
   public static void printSelectByCode(Goods goods){
	   System.out.println(goods.getCode()+"의 정보");
	   System.out.printf("가격:%d | 과자 이름: %s | 맛 설명:%s%n ", goods.getPrice(),goods.getName(), goods.getExplain());
   }
}