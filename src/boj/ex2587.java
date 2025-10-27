package boj;
import java.util.*;
import java.io.*;
public class ex2587 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        ArrayList<Integer> list = new ArrayList<>();
        int sum = 0;
        for (int i = 0; i < 5; i++){
            list.add(Integer.parseInt(br.readLine()));
        }

        for (Integer i : list) {
            sum += i;
        }
        int avg = sum / 5;
        Collections.sort(list);
        System.out.println(avg);
        System.out.println(list.get(2));
/*
        StringBuilder sb = new StringBuilder();
        sb.append(avg).append('\n').append(list.get(2));
        System.out.println(sb);

 */
    }
}
