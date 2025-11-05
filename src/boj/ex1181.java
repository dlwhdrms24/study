package boj;

import java.io.*;
import java.util.*;

public class ex1181 {

    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());

        Comparator<String> lc = (s1,s2) -> {
            if (s1.length() != s2.length()) {
                return s1.length() - s2.length();
            }else {
                return s1.compareTo(s2);
            }
        };

        TreeSet<String> set = new TreeSet<>(lc);
        for (int i = 0; i < n; i++) {
            set.add(br.readLine());
        }

        StringBuilder sb = new StringBuilder();

        for (String s : set) {
            sb.append(s).append('\n');
        }

        System.out.println(sb);
    }
}
