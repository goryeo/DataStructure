package sort.implementation;

/*
 * 1.버블정렬?
 * 물속에 있는 거품이 수면위로 보글보글 하게 올라오는 것처럼,
 * 제일 무거운 원소가 배열의 최상단까지 올라가는 과정을 마치 거품이 올라가는 것과 같다 하여 
 * 이름을 버블정렬이라 지었습니다.
 * 2.시간 복잡도
 * 빅O 표기법으로 O(n^2)
 * 출처: http://mommoo.tistory.com/65 [개발자로 홀로 서기]
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
