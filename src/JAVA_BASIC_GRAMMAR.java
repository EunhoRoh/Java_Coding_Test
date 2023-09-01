import java.awt.*;
import java.util.Random;
import java.util.Scanner;

public class JAVA_BASIC_GRAMMAR {
    public static void main(String[] args){

//        System.out.println("Hello World");
//        //System.out.println(x);
//        final int y=10;
//        //y=20; -> ERROR 발생
//        System.out.println(y);
//
//        long l = 30L; //뒤에 L을 붙여야 한다.
//        int x=30;
//        short s =30; //뒤에 안 붙여도 됨
//        byte b = 30; // int 보다 더 작은수
//
//        int i =(int)30L; //Type Casting을 해야지 변수 저장 가능
//
//        double dd= 30.0; //float 보다 큰 실수
//        float ff = 30.0f; //f를 빼면 double로 인식
//        boolean isMarried = true;
//        isMarried = false;
//
//        //char는 거의 사용 안함
//        char c = 'a'; //작은 따음표로 한글자만 표시
//        char cc= '한';
//        String str="여러 글자";
//
//        System.out.printf("저는 %s입니다. 나이는 %d살이고요, 키는 %fcm입니다.\n", "홍길동", 20, 100.5f);//printf 포맷 지정
//        String str2 = String.format("저는 %s입니다. 나이는 %d살이고요, 키는 %fcm입니다.", "홍길동", 20, 100.5f); //Stirng의 format 지정
//
//        System.out.println(Math.max(10,30));//Math class를 활용해서 10하고 20 중에 큰 수를 선택한다.
//        System.out.println(Math.min(10,30));
//        System.out.println(Math.abs(-30));// 절댓값 표시
//
//        String str3 = "100";
//        int i2 = Integer.parseInt(str3);//Integer class에서 String을 int로 바꿔주는 함수 : parseInt
//        long i3 = Long.parseLong(str3);
//        String str4 = String.valueOf(i2);//String class의 valueOf 함수는 숫자를 문자열로 바꾼다.
//        System.out.println(i2);
//
//        System.out.println(str4);

        Random random = new Random(); //Random class의 객체를 하나 생성
        int rand = random.nextInt(10);//bound 값으로 10을 넣어주면 0부터 9까지 random한 수가 나온다.
        System.out.println(rand);

        int rand2 = random.nextInt(4)+5;//5~9
        //문자열 받기
        Scanner scanner = new Scanner(System.in);
        //문자열 입력 받아서 보여주기
        System.out.println(scanner.next()); //next 함수를 통해 원하는 값을 받을 수 있따.
//
//        String str = scanner.next();
//        int i = scanner.nextInt();
//        long l = scanner.nextLong();

//        int i3=6;
//        if(i3<3){
//            System.out.println("참");
//        } else if(i3<5){
//            System.out.println("거짓");
//        }
//        else{
//            System.out.println("나머지");
//        }
//
//        boolean isMarried= true;
//        boolean isMan = false;
//        String str1;
//        str1=isMarried ? "결혼 했다" : "결혼 안 했다.";
//
//        if (!isMarried && isMan){
//            str1="결혼했다";
//        } else {
//            str1 = "결혼 안 했다";
//        }
//
//        System.out.println(str1);
//        switch (str1){//boolean은 안 들어옴
//            case "결혼 했다":
//                System.out.println("O");
//                break;
//            case "결혼 안 했다" :
//                System.out.println("X");
//                break;
//            default:
//                System.out.println("?");
//        }
        for(int i=0; i<10; i++){
            System.out.println(i);
            if (i==6){
                break;
            }
        }

        int i=0;
        while(i<10){
            System.out.println(i);
            i++;
        }

        int i1=0;
        do{
            System.out.println(i1);
            i1++;
        }while (i1<10);

    }
    int[] score;
    score = new int[5];

}
