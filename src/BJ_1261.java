// [백준] 1261. 알고스팟 (Java)

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.util.PriorityQueue;
import java.util.Arrays;

public class BJ_1261 {
    static int N, M;
    static char [][] arr;
    static int [][] dist;
    static int [] dy = {-1, 0, 1, 0};
    static int [] dx = {0, 1, 0, -1};

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String [] inputs = br.readLine().split(" ");
        M = Integer.parseInt(inputs[0]);
        N = Integer.parseInt(inputs[1]);
        arr = new char[N][M];
        dist = new int[N][M];
        for (int i = 0; i < N; i++) {
            arr[i] = br.readLine().toCharArray();
            Arrays.fill(dist[i], Integer.MAX_VALUE);
        }
        dijkstra();

        System.out.print(dist[N-1][M-1]);
    }

    public static void dijkstra() {
        PriorityQueue<Point> pq = new PriorityQueue<Point>();
        dist[0][0] = 0;
        pq.offer(new Point(0, 0, 0));
        while(!pq.isEmpty()) {
            Point cur = pq.poll();

            for (int i = 0; i < 4; i++) {
                int nextY = cur.y + dy[i];
                int nextX = cur.x + dx[i];
                int nextBroken = cur.broken;
                if (nextY < 0 || nextY >= N || nextX < 0 || nextX >= M)
                    continue;
                if (arr[nextY][nextX] == '1')
                    nextBroken++;
                if (dist[nextY][nextX] > nextBroken) {
                    dist[nextY][nextX] = nextBroken;
                    pq.offer(new Point(nextY, nextX, nextBroken));
                }
            }
        }
    }

    static class Point implements Comparable<Point>{
        int y;
        int x;
        int broken;

        public Point(int y, int x, int broken) {
            this.y = y;
            this.x = x;
            this.broken = broken;
        }

        @Override
        public int compareTo(Point p) {
            return this.broken - p.broken;
        }
    }
}