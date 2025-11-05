package boj;

import java.io.*;
import java.util.*;

public class ex10989 {
    public static void main(String[] args) throws IOException {
//        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
//        int  n = Integer.parseInt(br.readLine());
//
//        int[] arr = new int[n];
//
//        for (int i = 0; i < n; i++) {
//            arr[i] = Integer.parseInt(br.readLine());
//        }
//
//        Arrays.sort(arr);
//        StringBuilder sb = new StringBuilder();
//        for (int num : arr){
//            sb.append(num).append('\n');
//        }
//        System.out.println(sb);

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());

        int[] counts = new int[10001];

        for (int i = 0; i < n; i++) {
            int num = Integer.parseInt(br.readLine());
            counts[num]++;
        }

        StringBuilder sb = new StringBuilder();

        for (int i = 0; i < counts.length; i++) {
            for (int j = 0; j < counts[i]; j++) {
                sb.append(i).append('\n');
            }
        }
        System.out.println(sb);
    }
}
