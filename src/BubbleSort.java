import java.util.Scanner;

public class BubbleSort {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        System.out.print("배열의 크기를 입력해주세요.");
        int n = sc.nextInt();
        System.out.println("배열 입력하세요.");
        int[] arr = new int[n];

        for(int i=0; i<n; i++){
            arr[i] = sc.nextInt();
        }

        for(int i=1; i<n; i++){


            for(int j=0; j<n-i; j++){

                System.out.print(arr[i]+" ");
                System.out.print(arr[j]+" ");

                if(arr[j]>arr[j+1]){
                    int tmp=arr[j+1];
                    arr[j+1]=arr[j];
                    arr[j] = tmp;


                }
                System.out.print(arr[i]+" ");
                System.out.print(arr[j]+" ");
            }
        }
        System.out.println();
        for(int i=0; i<n; i++){
            System.out.println(arr[i]);
        }

    }
}
