package boj;

import java.util.Scanner;

public class ex1018 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int count = 64;
        int m = sc.nextInt(); int n = sc.nextInt();
        sc.nextLine();

        char[][] wb = new char[m][n];
        for (int i = 0; i < m; i++) {
            String s = sc.nextLine();
            for (int j = 0; j < n; j++) {
                wb[i][j] = s.charAt(j);
            }
        }
        count = getCount(wb, count, n, m);
        System.out.println(count);
    }

    private static int getCount(char[][] wb, int count, int n, int m) {
        int k=0;
        int l=0;
        while (true){
            int t = wb[k][l] == 'W' ? 1:0;
            int c1 =0;
            for (int i = 0; i < 8; i++) {
                for (int j = 0; j < 8; j++) {
                    if (t == 1){
                        if (wb[i+k][j+l] == 'W'){
                            t=0;
                        }else {
                            c1++;
                            t=0;
                        }
                    }else {
                        if (wb[i+k][j+l] == 'B'){
                            t=1;
                        }else {
                            t=1;
                            c1++;
                        }
                    }
                }
                if(t == 1) {
                    t = 0;
                }else {
                    t = 1;
                }
            }
            int cMin = Math.min(c1,64-c1);

            if (count > cMin){
                count = cMin;
            }

            if(n > l+8){
                l++;
            } else if (m > k+8) {
                l = 0;
                k++;
            }else {
                break;
            }

        }
        return count;
    }
}
