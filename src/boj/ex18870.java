package boj;

//좌표 압축

import java.io.*;
import java.util.*;
public class ex18870 {
    public static void main(String[] args) throws IOException{
        BufferedReader br  = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        StringTokenizer st = new StringTokenizer(br.readLine());

        ArrayList<Integer> list = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            int num = Integer.parseInt(st.nextToken());
            list.add(num);
        }

        TreeSet<Integer> set = new TreeSet<>(list);

        HashMap<Integer,Integer> rankMap = new HashMap<>();
        int rank = 0;
        for (int num : set){
            rankMap.put(num,rank);
            rank++;
        }
        StringBuilder sb = new StringBuilder();

        for (int listNum : list) {
            sb.append(rankMap.get(listNum)).append(' ');
        }
        System.out.println(sb);

    }
}
