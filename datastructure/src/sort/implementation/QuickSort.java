package sort.implementation;

/*
 * 리스트 가운데서 하나의 원소를 고름(pivot 선정)
 * pivot 앞에는 pivot보다 작은 값이 오고, pivot 뒤에는 pivot보다 큰 값들이 오도록 리스트를 둘로 분할한다.
 * 분할된 두 개의 리스트에 대해 재귀함수를 통해 이 과정을 반복한다.
 * 시간복잡도 : 최악 O(n^2), 평균 O(nlogn)
 */

public class QuickSort {

	public static void main(String[] args) {
		int[] arrs = { 69, 10, 30, 2, 16, 8, 31, 22 };
	    quickSort(arrs, 0, arrs.length - 1);
	    
	    for (int i : arrs) {
	        System.out.print(i + " ");
	    }
	}
	
	// 값을 비교하고 로우와 하이를 이동시키면서 값의 교환이 이루어지는 함수
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
			// 값을 비교하고 로우와 하이를 이동시키면서 값의 교환이 이루어지는 함수
			int pivotNewIndex = partition(arr, left, right);
			// 퀵 정렬의 자주 나오는 '재귀', '분할' 이라고 설명되어지는 부분
			quickSort(arr, left, pivotNewIndex - 1);
			quickSort(arr, pivotNewIndex + 1, right);
		}
	}

}
