package boj;

import java.util.*;
import java.io.*;

public class ex2839 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());

        int k = n / 5;

        while (k >= 0){
            int num = n;
            num -= k * 5;
            if (num % 3 == 0){
                System.out.println(k+(num/3));
                break;
            }else {
                k--;
            }
            if (k < 0){
                System.out.println(-1);
            }
        }

    }
}
