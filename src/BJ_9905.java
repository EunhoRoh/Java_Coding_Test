// [백준] 9905. 1,2,3 더하기 기본 dp 문제(Java)

import java.io.*;

class BJ_9905 {
    public static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
    public static int[] dp;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(br.readLine());
        int t;
        dp = new int[12];
        dp[0] = 1;

        for (int i = 0; i < n; i++) {
            t = Integer.parseInt(br.readLine());
            bw.write(calc(t) + "\n");
        }
        bw.flush();
        bw.close();
    }

    public static int calc(int x) {
        if (dp[x] != 0) {
            return dp[x];
        } else {
            for (int i = 1; i <= 3; i++) {
                if (x - i >= 0) {
                    dp[x] = dp[x] + calc(x - i);
                }
            }
            return dp[x];
        }
    }
}
