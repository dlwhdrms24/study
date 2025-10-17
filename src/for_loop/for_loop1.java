package for_loop;

import java.util.Scanner;

public class for_loop1 {
    public static void main(String[] args) { //백준에서 문제를 풀다가 반복문에대해서 깨달은걸 적어보려함
        int sum = 0;
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        for(int i = 1; i < n - 1;i++){ // (n-2) 1부터 시작해서 n-2임
            for(int j = i + 1; j < n; j++){ //(n-1)
                for(int k = j + 1; k <= n; k++){ //(n)

                }
            }
        }
        /*(n)  이셋을합치면 n * (n-1) * (n-2) 인데 이건 조합의갯수다 중복해서나올수있는
        그리고 i =  1 j = i+1  k = j+1 이방식때문에 1*2*3해서 나눠줘야한다.
        그러면 (n * (n-1) * (n-2)) / (1*2*3) 이렇게되는데 이게 중복을 제거한 조합에대한 뽑는 횟수가된다. 즉 반복문 횟수다.
         */
    }
}
