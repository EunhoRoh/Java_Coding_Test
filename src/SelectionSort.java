import java.util.Scanner;

public class SelectionSort {

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        // 선택 정렬이란 하나씩 최소값을 골라서 첫번째랑 바꾸는 것이다.
        System.out.print("배열의 크기를 입력하세요.");
        int n = sc.nextInt();
        int[] arr = new int[n];

        for(int i=0; i<n; i++){
            arr[i] = sc.nextInt();
        }

        //여기서 부터 정렬

        for(int i=0; i<n-1; i++){
            int min=i;
            for(int j=i+1; j<n; j++){
                if(arr[min] > arr[j]){
                    min=j;
                }
            }
            int tmp;
            tmp = arr[i];
            arr[i] = arr[min];
            arr[min] =tmp;
        }

        for(int i=0; i<n; i++){
            System.out.println(arr[i]);
        }
    }
}
