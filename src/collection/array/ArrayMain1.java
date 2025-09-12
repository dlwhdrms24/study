package collection.array;

import java.util.Arrays;

public class ArrayMain1 {

    public static void main(String[] args) {
        int[] arr = new int[5];
        //index 입력: O(1)
        System.out.println("==index 입력: O(1)==");

        arr[0]=1;
        arr[1]=2;
        arr[2]=3;
        System.out.println(Arrays.toString(arr));

        System.out.println("==index 변경: O(1)==");
        arr[2] = 10;
        System.out.println(Arrays.toString(arr));

        System.out.println("==index 조회: O(1)==");
        System.out.println("arr[2] = " + arr[2]);

        System.out.println("==배열 검색: O(n)==");
        System.out.println(Arrays.toString(arr));
        int value = 10;
        for (int i = 0; i < arr.length ; i++) {
            System.out.println("arr[" + i + "]: " + arr[i]);
            if(arr[i] == value){
                System.out.println(value + " 찾음");
                break;
            }

            //배열 index 는 배열을 찾아갈때 배열주소 + (자료의크기 * 인덱스위치) 근데 그렇다면 파이썬에서는 어떻게 찾아가지?
            //파이썬에서 데이터가 저장된 메모리 주소(참조값)를 순서대로 저장하는 배열 이 주소값들은 크기가 모두 동일
            //배열에서 순차 검색해서 찾는경우 최악의경우 배열의크기가 n이면 n만큼 필요하다
        }
    }
}
