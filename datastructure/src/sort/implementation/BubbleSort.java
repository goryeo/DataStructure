package sort.implementation;

/*
 * 1.��������?
 * ���ӿ� �ִ� ��ǰ�� �������� ���ۺ��� �ϰ� �ö���� ��ó��,
 * ���� ���ſ� ���Ұ� �迭�� �ֻ�ܱ��� �ö󰡴� ������ ��ġ ��ǰ�� �ö󰡴� �Ͱ� ���� �Ͽ� 
 * �̸��� ���������̶� �������ϴ�.
 * 2.�ð� ���⵵
 * ��O ǥ������� O(n^2)
 * ��ó: http://mommoo.tistory.com/65 [�����ڷ� Ȧ�� ����]
 * 
 */

public class BubbleSort {

    public static void main(String[] args) {
        int[] index = { 8, 4, 7, 3, 1, 6, 5, 2 };
        int i, j, temp;
        
        for(i = 0; i < index.length - 1; i++){
            for(j = 0; j < index.length -1 - i; j++){
                if(index[j] > index[j + 1]){
                    temp = index[j];
                    index[j] = index[j + 1];
                    index[j + 1] = temp;   
                }
            }
        }
        
        for(i = 0; i < index.length; i++){
            System.out.print(index[i] + " ");
        }
    }

}
