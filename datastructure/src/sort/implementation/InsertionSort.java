package sort.implementation;

/*
 * �����͸� �ϳ��� ������ ��ġ�� ������ ���� ��ü �����͸� �����ϴ� �˰���
 * 1. ������ �ι�° ����Ʈ ���� �Ѵ�. ������ ù��° ����Ʈ�� �ϳ��̱� ������ ������ �Ǿ��ִٰ� ����.
 * 2. �ι�° ����Ʈ�� ù��° ����Ʈ�� ���Ͽ� ������ ��ġ�� �����Ѵ�.
 * 3. ����° ����Ʈ�� �����ܰ� ���� ���ĵǾ��ִ� ����Ʈ���� �� ��ġ�� ã�� �� �� ���� �����Ѵ�.
 * 4. ���� ���� ������� �׹�° ����Ʈ ���ķ� �� ����Ʈ�� ���� �� ���� ����ؼ� �����Ѵ�.
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
