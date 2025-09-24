package school.ex.ex2;

import java.util.Arrays;

class EnglishScore implements Comparable<EnglishScore> {
    String name;
    int score;

    public EnglishScore(String name, int score) {
        this.name = name;
        this.score = score;
    }

    @Override
    public String toString() {
        return name + ", " + score;
    }

    @Override
    public int compareTo(EnglishScore other) {
        return this.score - other.score;
    }
}

class MathScore implements Comparable<MathScore> {
    String name;
    int score;

    public MathScore(String name, int score) {
        this.name = name;
        this.score = score;
    }

    @Override
    public String toString() {
        return name + ", " + score;
    }

    @Override
    public int compareTo(MathScore other) {
        return this.score - other.score;
    }
}

public class ScoreTest {

    static <T extends Comparable<T>> T findBest(T[] a) {
        if (a == null || a.length == 0) return null;
        Arrays.sort(a);
        return a[a.length - 1];
    }


    static <T> T findScore(T[] a, String name) {
        for (T s : a) {

            if (s.toString().substring(0, 3).equals(name)) {
                return s;
            }
        }
        return null;
    }

    public static void main(String[] args) {

        EnglishScore[] ea = {
                new EnglishScore("김삿갓", 77),
                new EnglishScore("장영실", 88),
                new EnglishScore("홍길동", 99)
        };
        MathScore[] ma = {
                new MathScore("김삿갓", 80),
                new MathScore("장영실", 98),
                new MathScore("홍길동", 89)
        };


        System.out.println("영어 최고 점수 : " + findBest(ea));
        System.out.println("수학 최고 점수 : " + findBest(ma));


        if (args.length > 0) {
            String name = args[0];
            System.out.println("영어   점수 : " + findScore(ea, name));
            System.out.println("수학   점수 : " + findScore(ma, name));
        } else {
            System.out.println("명령행 인자가 없습니다.");
        }
    }
}