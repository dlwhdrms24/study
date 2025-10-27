package boj;

import java.util.Scanner;

public class ex24263 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long n = sc.nextLong();
        long sum = 0;
        for(int i = 1; i < n; i++){
            for (int j = i + 1; j <= n; j++){
                System.out.println("i =" + i +", j =" + j);
                sum++;
            }
        }
        System.out.println(sum);
        System.out.println(2);
    }
}
