package boj;

import java.io.*;
import java.util.*;

public class ex2750 { //수 정렬하기
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int  n = Integer.parseInt(br.readLine());

        ArrayList<Integer> list = new ArrayList<>();

        for (int i = 0; i < n; i++) {
            list.add(Integer.parseInt(br.readLine()));
        }

        Collections.sort(list);
        StringBuilder sb = new StringBuilder();
        list.forEach(num -> sb.append(num).append('\n'));
        System.out.println(sb);

//        list.stream().forEach(System.out::println); n번 출력함

/*        int[] num = new int[n];
        for (int i = 0; i < n; i++) {
            num[i] = Integer.parseInt(br.readLine());
        }
        Arrays.sort(num);
        Arrays.stream(num).forEach(System.out::println);
        for (int i = 0; i < n; i++) {
            System.out.println(num[i]);
        }*/
    }
}
