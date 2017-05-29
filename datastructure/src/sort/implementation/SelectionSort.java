package sort.implementation;

/*
* 1. �־��� ����Ʈ �߿� �ּҰ��� ã�´�.
* 2. �� ���� �� �տ� ��ġ�� ���� ��ü�Ѵ�.
* 3. �� ó�� ��ġ�� �� ������ ����Ʈ�� ���� ������� ��ü�Ѵ�.
* ó������ ������ �����ϸ鼭 �ּڰ�(�Ǵ� �ִ�)�� �����Ͽ� �����ϴ� �˰���
*/

public class SelectionSort {
  public static void main(String[] args) {
    int[] index = { 5, 4, 7, 1, 8, 3, 2, 6 };
    int i, j, min;
    int temp = 0;

    for (i = 0; i < index.length; i++) {
      min = index[i];
      for (j = i; j < index.length - 1; j++) {
        if (min > index[j + 1]) {
          min = index[j + 1];
          temp = j + 1;
        }
      }
      index[temp] = index[i];
      index[i] = min;
    }
    for (i = 0; i < index.length; i++) {
      System.out.print(index[i] + " ");
    }
  }
}