package boj;


import java.io.*;
import java.util.*;
import java.util.stream.Collectors;

public class ex9506 {
    public static void main(String[] args){
        ArrayList<Integer> list = new ArrayList<>();
        Scanner sc = new Scanner(System.in);

        int num;
        int total = 0;

        while (true){
            num = sc.nextInt();
            if(num == -1){
                break;
            }
            for(int i =1; i < num; i++){
                if(num % i == 0){
                    list.add(i);
                    total += i;
                }
            }

            String elements = list.stream()
                    .map(String::valueOf)
                    .collect(Collectors.joining(" + "));
            String result = String.format("%d = %s", num, elements);

            if(num == total){
                System.out.println(result);
                total = 0;
                list.clear();
            }else {
                System.out.println(num + " is NOT perfect.");
                total = 0;
                list.clear();
            }
        }

    }
}
