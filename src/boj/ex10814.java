package boj;

import java.io.*;
import java.util.*;

public class ex10814 {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());

        ArrayList<User> users = new ArrayList<>();

        for (int i = 0; i < n; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            int age = Integer.parseInt(st.nextToken());
            String name = st.nextToken();
            users.add(new User(age,name));
        }
        users.sort(null);

        StringBuilder sb = new StringBuilder();
        for (User user : users) {
            sb.append(user.getAge()).append(' ').append(user.getName()).append('\n');
        }
        System.out.println(sb);
    }
}
class User implements Comparable<User>{
    private int age;
    private String name;

    public User(int age, String name) {
        this.age = age;
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public String getName() {
        return name;
    }

    @Override
    public int compareTo(User o) {
        return this.age - o.age;
    }
}
