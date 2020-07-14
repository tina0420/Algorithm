package sorting;

public class BubbleSort {
	public static void main(String[] args) {
		int data[] = {23,16,8,33,17,51};
		System.out.println("原始資料 : ");
		for (int k=0; k<data.length; k++) {
			System.out.print(data[k]+ " ");
		}
		for (int i=0; i<=data.length-1; i++) {
			for (int j=0; j<= data.length-1; j++) {
				if(data[i] < data[j]) {
					int tmp = data[i];
					data[i] = data[j];
					data[j] = tmp;
				}
			}
		}
		System.out.println();
		System.out.println("Bubble Sort 排序結果 : ");
		for(int k=0; k < data.length; k++) {
			System.out.print(data[k] + " ");
		}
	}

}
