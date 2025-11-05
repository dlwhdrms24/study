package boj;

import java.util.*;
import java.io.*;

public class ex1427 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new BufferedReader(new InputStreamReader(System.in)));
        String s = br.readLine();
        int[] num = new int[10];

        for (int i = 0; i < s.length(); i++) {
            int n = s.charAt(i) -'0';
            num[n]++;
        }

        StringBuilder sb = new StringBuilder();
        for (int i = 9; i >= 0; i--) {
            for (int j = 0; j < num[i]; j++) {
                sb.append(i);
            }
        }

        System.out.println(sb);
    }
}
