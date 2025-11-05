package school.ex.ex3.ch;

import java.util.*;
import java.io.*;

public class Chapter11_8 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        ArrayList<Integer> list = new ArrayList<>();
        while (true){
            System.out.print("점수를 입력하세요 :");
            int score = Integer.parseInt(br.readLine());
            if (score < 0){
                break;
            }
            list.add(score);
        }
        System.out.println("전체 학생은 " + list.size() +"명이다.");
        System.out.print("학생들의 성적 : ");
        list.forEach(s-> System.out.print(s + " "));
        System.out.println();
//        int max = -1;
//        for (Integer i : list){
//            if (max < i) {
//                max = i;
//            }
//        }
        int max = Collections.max(list);
        int count = 0;
        for (Integer i : list){
            String g;
            if (max - 10 <= i){
                g = "A";
            } else if (max - 20 <= i) {
                g = "B";
            } else if (max - 30 <= i) {
                g = "C";
            } else if (max - 40 <= i) {
                g = "D";
            }else {
                g = "F";
            }
            System.out.println(count + "번 학생의 성적은 " + i +"이며 등급은 " + g +"이다." );
            count++;
        }
    }
}
