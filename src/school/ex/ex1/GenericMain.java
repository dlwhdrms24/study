package school.ex.ex1;

import java.util.Arrays;

public class GenericMain {
    static <T extends Comparable<T>> T findBest(T[] a){
        T best = a[0];
        Arrays.sort(a);
        return a[a.length - 1];
    }

    public static void main(String[] args) {
        EnglishScore[] ea = {new EnglishScore("김삿갓",77),
                new EnglishScore("장영실",88), new EnglishScore("홍길동",99)};
        MathScore[] ma = {new MathScore("김삿갓",80),
                new MathScore("장영실",98), new MathScore("홍길동",70)};

        System.out.println("영어 최고 점수 : " + findBest(ea));
        System.out.println("수학 최고 점수 : " + findBest(ma));
    }
}
