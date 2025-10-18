package boj;

import java.util.Scanner;
//블랙잭
public class ex2798 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int loop = sc.nextInt();
        int max = sc.nextInt();
        int sum=0;

        int[] num = new int[loop];
        for(int i=0; i < loop; i++){
            num[i] = sc.nextInt();
        }

        for (int i=0; i < loop;i++){
            for (int j=0; j < loop;j++){
                for (int k=0; k < loop;k++){
                    if(num[i] == num[j] || num[i] == num[k] || num[j] == num[k]){
                        continue;
                    }
                    int n = num[i] + num[j] + num[k] ;
                    if(n <= max){
                        if(max-sum >= max-n){
                            sum = n;
                        }
                    }
                }
            }
        }
        System.out.println(sum);
    }
}
