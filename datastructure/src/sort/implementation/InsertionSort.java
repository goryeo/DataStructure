package sort.implementation;

/*
 * 데이터를 하나씩 적절한 위치에 삽입해 가며 전체 데이터를 정렬하는 알고리즘
 * 1. 시작은 두번째 리스트 부터 한다. 이유는 첫번째 리스트는 하나이기 때문에 정렬이 되어있다고 본다.
 * 2. 두번째 리스트를 첫번째 리스트와 비교하여 적절한 위치에 삽입한다.
 * 3. 새번째 리스트를 이전단계 까지 정렬되어있는 리스트에서 들어갈 위치를 찾은 후 그 곳에 삽입한다.
 * 4. 위와 같은 방법으로 네번째 리스트 이후로 그 리스트가 끝날 때 까지 계속해서 삽입한다.
 */

public class InsertionSort {

	public static void main(String[] args) {
		int[] index = { 4, 1, 3, 5, 2, 6, 8, 7 };
	    int i, j, temp;
	    
	    for(i = 1; i < index.length; i++){
	    	temp = index[i];
	    	for(j = i - 1; j >= 0 && temp < index[j]; j--){
	    		index[j + 1] = index[j];
	    	}
	    	index[j + 1] = temp;
	    }
	    
	    for(i = 0; i < index.length; i++){
	    	System.out.print(index[i] + " ");
	    }
	}
}
