package ex0716_jyj;

public class LottoExam01 {
	int[] lotto = new int[6];
	
	public void lottoNum() {
		int index = 0;
		while(index<6) {
			int num = (int)(Math.random()*45)+1;
			
			//boolean??
			boolean bool = false;
            for (int i = 0; i < index; i++) {
                if (lotto[i] == num) {
                    bool = true;
                    break;
                }
            }
            
            if (!bool) {
                lotto[index] = num;
                index++;
            }
		}
		sort();
	}
	public  void sort() {
		for (int i = 0; i < lotto.length - 1; i++) {
            for (int j = 0; j < lotto.length - 1 - i; j++) {
                if (lotto[j] < lotto[j + 1]) {
                	//내림차순 정렬
                    int temp = lotto[j];
                    lotto[j] = lotto[j + 1];
                    lotto[j + 1] = temp;
                    
                }
            }
        }
    }
	public void printNum() {
        for (int i = 0 ; i<lotto.length; i++) {
            System.out.print(lotto[i] + " ");
        }
        System.out.println();
    }
	
	public static void main(String[] args) {
		LottoExam01 lote = new LottoExam01();
		lote.lottoNum();
		lote.printNum();
		
	}

}
