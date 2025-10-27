package boj;

import java.util.Scanner;

public class ex2231 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = 0;

        for(int i=1; i < n; i++){
            int num = i;
            int sum = 0;

            while (num > 0){
                sum += num % 10;
                num /= 10;
            }

            if (sum + i == n){
                m = i;
                break;
            }
        }
        System.out.println(m);
    }
}
