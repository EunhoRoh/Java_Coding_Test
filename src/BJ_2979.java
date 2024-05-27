import java.util.*;
public class BJ_2979 {
    public static void main(String[] args) {
        while (true) {
            Scanner scanner = new Scanner(System.in);
            System.out.println("값을 입력해주세요.");
            int a = scanner.nextInt();
            int b = scanner.nextInt();
            int c = scanner.nextInt();

            if(c<1 || c>b){
                System.out.println("c값을 잘 못 입력했습니다.");
                continue;
            }

            if(b<a || c==b){
                System.out.println("b값을 잘 못 입력했습니다.");
                continue;
            }

            if(a<b || a>100){
                System.out.println("a값을 잘 못 입력했습니다.");
                continue;
            }

            break;


        }

    }

}
