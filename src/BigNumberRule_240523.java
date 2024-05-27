import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class BigNumberRule_240523 {

    public static void main(String[] args) throws Exception{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());//하나씩 짤라서 st 배열에 저장하는 건가?

        System.out.println(st);

        //문자열을 int로 바꾸기
        int N = Integer.parseInt(st.nextToken());

        int M = Integer.parseInt(st.nextToken());

        int K = Integer.parseInt(st.nextToken());
        //N개의 배열 생성
        int[] arr = new int[N];

        //다음 줄을 읽는다 배열을 읽는거지
        StringTokenizer st2 = new StringTokenizer(br.readLine());

        for (int i=0; i<N; i++){
            arr[i] = Integer.parseInt(st2.nextToken());
        }

        Arrays.sort(arr);

        int count =0;
        int sum =0;

        for(int i=0; i<M; i++){
            int firstBig= arr[arr.length-1];
            int secondBig = arr[arr.length-2];

            count++;

            if(count % K==0){
                sum += secondBig;
            } else {
                sum+= firstBig;
            }
        }
        System.out.println(sum);

        //두번째 풀이
//        int sum =0;
//        int firstBig = arr[arr.length-1];
//        int secondBig = arr[arr.length-2];
//
//        int count = (M/(K+1))*K+ M%(K+1);
//
//        sum = firstBig * count;
//        sum += secondBig * (M-count);
//
//        System.out.println(sum);


    }
}
