package boj;

import java.util.*;
import java.io.*;

public class ex11651 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new BufferedReader(new InputStreamReader(System.in)));
        int n = Integer.parseInt(br.readLine());

        ArrayList<YX> yxList = new ArrayList<>();
        for (int i = 0; i < n; i++){
            StringTokenizer stk = new StringTokenizer(br.readLine());
            int x = Integer.parseInt(stk.nextToken());
            int y = Integer.parseInt(stk.nextToken());
            yxList.add(new YX(x,y));
        }
        yxList.sort((xy1,xy2) -> {
            if(xy1.getY() == xy2.getY()){
                return xy1.getX() - xy2.getX();
            }else{
                return xy1.getY() - xy2.getY();
            }
        });

        StringBuilder sb = new StringBuilder();
        for (YX yx : yxList) {
            sb.append(yx.getX()).append(" ").append(yx.getY()).append('\n');
        }
        System.out.println(sb);
    }
}

class YX {
    private int x;
    private int y;

    public YX(int x, int y) {
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
