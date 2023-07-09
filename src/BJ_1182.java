// [백준] 1182. 부분수열의 합 백트래킹(Java)

import java.io.IOException;
import java.util.Scanner;

public class BJ_1182 {
    public static int n, s;
    public static int[] arr;
    public static int ans = 0;

    public static void DFS(int i, int cnt) {
        if (i == n) { // 끝까지 돌았을 때
            return;

        } else {
            if (arr[i] + cnt == s) {

                ans++;

            }

            DFS(i + 1, cnt);// 지금꺼 넘어가기
            DFS(i + 1, cnt + arr[i]);// 지금꺼 더하기

        }

    }

    public static void main(String[] args) throws NumberFormatException, IOException {
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
        s = sc.nextInt();
        arr = new int[n];

        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        DFS(0, 0);
        System.out.println(ans);

    }

}

