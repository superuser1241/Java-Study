package ex0716_jyj;

public class SortExam01 {
	int arr[] = {5,7,1,2,4,3,8,9,6,10};
	int temp;
	
	public void bubbleSort() {
		for(int i = 0	;  i<arr.length-1;  i++) {
			for(int j = 0; j <arr.length-1; j++) {
				if(arr[j]>arr[i+1]) {
					temp = arr[j];
					arr[j] = arr[i+1];
					arr[i+1] = temp;
				}
			}
		}
	}
	public void printArray() {
        for(int i = 0; i<arr.length; i++) {
        	System.out.print(arr[i]+" ");
        }
    }

	public static void main(String[] args) {
		SortExam01 sort = new SortExam01();
		sort.bubbleSort();
		sort.printArray();
	}

}
