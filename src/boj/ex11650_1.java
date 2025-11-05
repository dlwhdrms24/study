package boj;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.StringTokenizer;

public class ex11650_1{
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        ArrayList<XY_1> xyList = new ArrayList<>();

        for (int i = 0; i < n; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            int x = Integer.parseInt(st.nextToken());
            int y = Integer.parseInt(st.nextToken());
            xyList.add(new XY_1(x, y));
        }

        xyList.sort((xy1,xy2) -> {
            if (xy1.getX() == xy1.getX()){
                return xy1.getY() - xy2.getY();
            }else {
                return xy1.getX() - xy2.getX();
            }
        });

//        xyList.sort(Comparator.comparingInt(XY::getX)
//                .thenComparingInt(XY::getY));

        StringBuilder sb = new StringBuilder();
        for (XY_1 xy : xyList) {
            sb.append(xy.getX()).append(" ").append(xy.getY()).append("\n");
        }
        System.out.println(sb);

    }

}

class XY_1 {
    private int x;
    private int y;

    public XY_1(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }

}
