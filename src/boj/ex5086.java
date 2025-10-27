package boj;

import java.util.Scanner;

public class ex5086 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        while (true){
            int n1 = sc.nextInt();
            int n2 = sc.nextInt();

            if(n1 == 0 && n2 == 0){
                break;
            }
            String result = getRelationship(n1, n2);
            System.out.println(result);
        }
    }
    public static String getRelationship(int num1, int num2) {
        return (num2 % num1 == 0) ? "factor" : (num1 % num2 == 0) ? "multiple" : "neither";
    }
}


