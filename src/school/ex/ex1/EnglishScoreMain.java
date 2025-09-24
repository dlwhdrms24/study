package school.ex.ex1;

import java.util.Arrays;

public class EnglishScoreMain {
    static EnglishScore findBest(EnglishScore[] a){

        EnglishScore best = a[0];
        Arrays.sort(a);
        best = a[a.length-1];
        return best;
    }

    public static void main(String[] args) {
        EnglishScore[] ea = {new EnglishScore("김삿갓",77),
                new EnglishScore("장영실",88), new EnglishScore("홍길동",99)};
        System.out.println("영어 최고 점수 : " + findBest(ea));
    }
}
