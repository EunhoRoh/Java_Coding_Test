import java.util.*;

public class BJ_16935 {
    static int N; //배열크기 행
    static int M; //배열크기 열
    static int R; //연산의 수
    static int[][] map; //배열
    static int[][] transMap; // 결과 저장 배열
    static int num; //연산번호
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        N = sc.nextInt(); //배열크기 행
        M = sc.nextInt(); //배열크기 열
        R = sc.nextInt(); //연산의 수
        map = new int[N][M]; //배열

        //배열값 입력
        for(int i=0;i<N;i++) {
            for(int j=0;j<M;j++) {
                map[i][j] = sc.nextInt();
            }
        }


        //연산의 수만큼 반복
        for(int i=0;i<R;i++) {
            num = sc.nextInt(); //연산번호

            switch(num) {
                //상하반전
                case 1 :
                    upDown();
                    break;

                //좌우반전
                case 2 :
                    leftRight();
                    break;

                //오른쪽 90도 회전
                case 3 :
                    rightRotation();
                    break;

                //왼쪽 90도 회전
                case 4 :
                    leftRotation();
                    break;

                //1->2, 2->3, 3->4, 4->1 이동
                case 5 :
                    fiveMove();
                    break;

                //1->4, 4->3, 3->2, 2->1 이동
                case 6 :
                    sixMove();
                    break;
            }
        }

        //배열 결과 출력
        for(int i=0;i<N;i++) {
            for(int j=0;j<M;j++) {
                System.out.print(map[i][j]+" ");
            }
            System.out.println();
        }
    }

    //상하반전 1
    public static void upDown() {
        int[][] transMap = new int[N][M]; //결과 저장 배열

        for(int i=0;i<N;i++) {
            for(int j=0;j<M;j++) {
                //N-i-1을 하면 거꾸로 입력이 된다.
                transMap[N-i-1][j] = map[i][j];
            }
        }
        map = transMap;
    }

    //좌우반전 2
    public static void leftRight() {
        transMap = new int[N][M]; //결과 저장 배열

        for(int i=0;i<N;i++) {
            for(int j=0;j<M;j++) {
                //M-j-1을 하면 맨 뒤의 열부터 채워진다.
                transMap[i][M-j-1] = map[i][j];
            }
        }
        map = transMap;
    }

    //오른쪽 90도 회전 3
    public static void rightRotation() {
        transMap = new int[M][N]; //결과 저장 배열

        int C = N-1;
        for(int i=0;i<N;i++) {
            for(int j=0;j<M;j++) {
                transMap[j][C] = map[i][j];
            }
            C--;
        }

        //크기 변환
        int temp = N;
        N = M;
        M = temp;

        map = transMap;
    }

    //왼쪽 90도 회전 4
    public static void leftRotation() {
        transMap = new int[M][N]; //결과 저장 배열

        for(int i=0;i<N;i++) {
            for(int j=0;j<M;j++) {
                transMap[M-j-1][i] = map[i][j];
            }
        }

        //크기 변환
        int temp = N;
        N = M;
        M = temp;

        map = transMap;
    }

    //1->2, 2->3, 3->4, 4->1 이동 5
    public static void fiveMove() {
        transMap = new int[N][M]; //결과 저장 배열

        int N_mid = N/2; //행 중앙값
        int M_mid = M/2; //열 중앙값

        //1->2
        for(int i=0;i<N_mid;i++) {
            for(int j=0;j<M_mid;j++) {
                transMap[i][M_mid+j] = map[i][j];
            }
        }

        //2->3
        for(int i=0;i<N_mid;i++) {
            for(int j=M_mid;j<M;j++) {
                transMap[N_mid+i][j] = map[i][j];
            }
        }

        //3->4
        for(int i=N_mid;i<N;i++) {
            int C = 0;
            for(int j=M_mid;j<M;j++,C++) {
                transMap[i][C] = map[i][j];
            }
        }

        //4->1

        int Row = 0;

        for(int i=N_mid;i<N;i++, Row++) {
            for(int j=0;j<M_mid;j++) {
                transMap[Row][j] = map[i][j];
            }
        }
        map = transMap;
    }

    //1->4, 4->3, 3->2, 2->1 이동 6
    public static void sixMove() {
        transMap = new int[N][M]; //결과 저장 배열

        int N_mid = N/2; //행 중앙값
        int M_mid = M/2; //열 중앙값

        //1->4
        for(int i=0;i<N_mid;i++) {
            for(int j=0;j<M_mid;j++) {
                transMap[N_mid+i][j] = map[i][j];
            }
        }

        //4->3
        for(int i=N_mid;i<N;i++) {
            for(int j=0;j<M_mid;j++) {
                transMap[i][M_mid+j] = map[i][j];
            }
        }

        //3->2
        int Row = 0;
        for(int i=N_mid;i<N;i++,Row++) {
            for(int j=M_mid;j<M;j++) {
                transMap[Row][j] = map[i][j];
            }
        }

        //2->1
        for(int i=0;i<N_mid;i++) {
            int C = 0;
            for(int j=M_mid;j<M;j++,C++) {
                transMap[i][C] = map[i][j];
            }
        }
        map = transMap;
    }
}
