package sort.implementation;

/*
 * ����Ʈ ����� �ϳ��� ���Ҹ� ��(pivot ����)
 * pivot �տ��� pivot���� ���� ���� ����, pivot �ڿ��� pivot���� ū ������ ������ ����Ʈ�� �ѷ� �����Ѵ�.
 * ���ҵ� �� ���� ����Ʈ�� ���� ����Լ��� ���� �� ������ �ݺ��Ѵ�.
 * �ð����⵵ : �־� O(n^2), ��� O(nlogn)
 */

public class QuickSort {

	public static void main(String[] args) {
		int[] arrs = { 69, 10, 30, 2, 16, 8, 31, 22 };
	    quickSort(arrs, 0, arrs.length - 1);
	    
	    for (int i : arrs) {
	        System.out.print(i + " ");
	    }
	}
	
	// ���� ���ϰ� �ο�� ���̸� �̵���Ű�鼭 ���� ��ȯ�� �̷������ �Լ�
	public static int partition(int arr[], int left, int right){
		int pivot = arr[(left + right) / 2];
		
		while (left < right){
			while((arr[left] < pivot) && (left < right))
				left++;
			while((arr[right] > pivot) && (left < right))
				right--;
			
			if(left < right){
				int temp = arr[left];
				arr[left] = arr[right];
				arr[right] = temp;
			}
		}
		
		return left;
	}
	
	public static void quickSort(int arr[], int left, int right){
		if(left < right){
			// ���� ���ϰ� �ο�� ���̸� �̵���Ű�鼭 ���� ��ȯ�� �̷������ �Լ�
			int pivotNewIndex = partition(arr, left, right);
			// �� ������ ���� ������ '���', '����' �̶�� ����Ǿ����� �κ�
			quickSort(arr, left, pivotNewIndex - 1);
			quickSort(arr, pivotNewIndex + 1, right);
		}
	}

}
