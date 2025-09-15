package collection.test.ex1;

import java.util.ArrayList;
import java.util.Scanner;

public class ArrayEx3 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        ArrayList<Integer> list = new ArrayList<>();

        System.out.println("n개의 정수를 입력하세요 (종료 0)");
        while (true){
          int input  = sc.nextInt();
            if(input == 0){
                break;
            }
            list.add(input);
        }
        int total = 0;

        for(int i :list){
            total += i;
        }
        System.out.println("입력한 정수의 합계: " + total);
        System.out.println("입력한 정수의 평균: " + (double)(total / list.size()));
    }
}
