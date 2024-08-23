package ex0717_jyj;

// TwoDmArrayExam.java

class TwoDmArray {
    // String을 저장하는 twoDmArray 배열 선언
    String[][] twoDmArray = new String[10][];

    // 메소드 make2DmArray
    // twoDmArray 배열에 값을 할당
    public void make2DmArray() {
        for (int i = 0; i < twoDmArray.length; i++) {
        	twoDmArray[i] = new String [i+1];
            for (int j = 0; j < twoDmArray[i].length; j++) {
                twoDmArray[i][j] = (j + 1) + "동" + (i + 1) + "호";
                System.out.print(twoDmArray[i][j] + " \t");
            }
            System.out.println();
        }
        System.out.println("----------------------------------------------------------------------------------------------");
    }

    // 메소드 print2DmArray
    // twoDmArray 배열의 값을 주어진 형식으로 출력
    public void print2DmArray() {
		
		  for (int j = 0; j < twoDmArray.length; j++) { 
			  for (int k = 0; k <  j; k++) {
				  System.out.print("\t");
			  }
			  for(int i = j ; i<10;i++) {
				  System.out.print(twoDmArray[i][j] + " \t");
			  }
			  System.out.println();
		  }
    }
}

public class TwoDmArrayExam {
    // main 메소드에서
    public static void main(String[] args) {
        // TwoDmArray 객체 생성
        TwoDmArray td = new TwoDmArray();
        // TwoDmArray 객체의 make2DmArray 메소드 호출
        td.make2DmArray();
        // TwoDmArray 객체의 print2DmArray 메소드 호출
        td.print2DmArray();
    }
}
