package sorting;

public class SelectionSort {

	public static void main(String[] args) {
		int data[] = {23,16,8,33,17,51};
		System.out.println("原始資料:");
		for (int k=0; k < data.length; k++) {
			System.out.print(data[k]+" ");
		}
		System.out.println();
		for (int i=0; i < data.length -1; i++) {
			//從第一個位置開始擺
			int min = i;
			for (int j=i; j < data.length; j++) {
				if(i != j) {
					if(data[j] < data[min]) {
						min = j;
					}
				}
			}
			int tmp = data[i];
			data[i] = data[min];
			data[min] = tmp;
			System.out.println();
			System.out.println("第"+(i+1)+"次排序:");
			for (int k=0; k < data.length; k++) {
				System.out.print(data[k]+" ");
			}
		}
		System.out.println();
		System.out.println();
		System.out.println("Selection Sort 排序結果 : ");
		for (int k=0; k < data.length; k++) {
			System.out.print(data[k] + " ");
		}
	}

}
