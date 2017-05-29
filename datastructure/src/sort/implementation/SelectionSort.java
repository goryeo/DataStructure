package sort.implementation;

/*
* 1. 주어진 리스트 중에 최소값을 찾는다.
* 2. 그 값을 맨 앞에 위치한 값과 교체한다.
* 3. 맨 처음 위치를 뺀 나머지 리스트를 같은 방법으로 교체한다.
* 처음부터 끝까지 조사하면서 최솟값(또는 최댓값)을 선택하여 정렬하는 알고리즘
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