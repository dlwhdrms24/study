package boj;

import java.io.*;
import java.util.*;

public class ex11650 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        ArrayList<XY> xyList = new ArrayList<>();

        for (int i = 0; i < n; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            int x = Integer.parseInt(st.nextToken());
            int y = Integer.parseInt(st.nextToken());
            xyList.add(new XY(x, y));
        }

//        Collections.sort(xyList);
        xyList.sort(null);
        StringBuilder sb = new StringBuilder();
        for (XY xy : xyList) {
            sb.append(xy.getX()).append(" ").append(xy.getY()).append("\n");
        }
        System.out.println(sb);

    }

}

class XY implements Comparable<XY>{
    private int x;
    private int y;


    public XY(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }


    @Override
    public int compareTo(XY other) {
        if(this.x == other.x){
            return this.y -other.y;
        }else {
            return this.x -other.x;
        }
    }
}
