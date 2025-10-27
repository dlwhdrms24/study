package boj;


import java.io.*;

public class ex1436 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(br.readLine());

        int count = 0;
        int num = 0;
        while (n > count){
            num++;
            String stNum = Integer.toString(num);
            if(stNum.contains("666")){
                count++;
            }
        }
        System.out.println(num);
    }
}
