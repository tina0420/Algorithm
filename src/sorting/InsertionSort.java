package sorting;

public class InsertionSort {

	public static void main(String[] args) {
		           // 0  1  2 3  4   5
		int data[] = {23,16,8,33,17,51};
		System.out.println("原始資料 : ");
		for (int k=0; k < data.length; k++) {
			System.out.print(data[k]+" ");
		} 
		System.out.println();
		for (int i=1;i < data.length; i++) {
			System.out.println("處理中的數字: "+data[i]);
			int j = i-1;
			while(j >= 0 && data[i] < data[j]) {
				data[j+1] = data[j];
				int tmp = data[i];
				data[i] = data[j];
				data[j] = tmp;
				j--;
			}
		}
		System.out.println();
		System.out.println("Insertion Sort 排序結果 : ");
		for (int k=0; k < data.length; k++) {
			System.out.print(data[k]+ " ");
		}
	
	}
}

//for(int j=i-1; j >= 0 && data[i] < data[j]; j--) {
//System.out.println("和 "+data[j]+"比");
//System.out.println();
//if(data[i] < data[j]) {
//	data[j+1] = data[j];
//	int tmp = data[i];
//	data[i] = data[j+1];
//	data[j] = tmp;
//}
//}