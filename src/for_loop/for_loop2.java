package for_loop;

import java.util.Scanner;

public class for_loop2 {
    public static void main(String[] args) {//파이썬이긴하지만 시험에서 못푼 반복문에 대해서

        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        for(int i = n; i > 0; i--){
            for(int j = 0; j < n - i; j++){
                System.out.print(" ");
            }
            for (int k = 0; k < i; k++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
