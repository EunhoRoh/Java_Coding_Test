import java.util.*;

public class CalCircle {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int score;
        score = sc.nextInt();
        String level;
        if(score>=90){
            level="A";
            System.out.println("A");
        } else if (score>=80) {
            level="B";
            System.out.println("B");

        }else if (score>=70) {
            level="C";
            System.out.println("C");

        }else if (score>=60) {
            level="D";
            System.out.println("D");

        } else{
            level="F";
            System.out.println("F");
        }

        switch (level){
            case "A" :
                System.out.println("A 입니다.");
                break;

            //좌우반전
            case "B" :
                System.out.println("B 입니다.");
                break;

            //오른쪽 90도 회전
            case "C" :
                System.out.println("C 입니다.");
                break;

            //왼쪽 90도 회전
            case "D" :
                System.out.println("D 입니다.");
                break;
            default:
                System.out.println("F 입니다. 재수강 하세요.");

        }

    }

}
