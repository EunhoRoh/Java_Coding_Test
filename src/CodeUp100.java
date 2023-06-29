import java.util.Scanner;

public class CodeUp100 {
//    public static void main(String[] args){
//        Scanner scanner = new Scanner(System.in);
//        int n= scanner.nextInt();
//        System.out.print(n);
//    }
    //한글자만 입력 받기
//    public static void main(String[] args){
////    Scanner scanner = new Scanner(System.in);
////    char n = scanner.next().charAt(0);
////    System.out.print(n);
////
////}
    //실수 1개 입력 받기
//public static void main(String[] args){
//    Scanner sc = new Scanner(System.in);
//    float n = sc.nextFloat();
//    System.out.printf("%f",n);
//
//}
    //반올림하여 둘째자리까지 출력
//public static void main(String[] args){
//    Scanner sc = new Scanner(System.in);
//    float n = sc.nextFloat();
//    System.out.printf("%.2f",n);
//
//}
    //.도 특수문자여서 \\으로 표시해줘야한다.
    //split은 문자열로 구분되어 진다.
//    public static void main(String[] args){
//        Scanner sc = new Scanner(System.in);
//        String date = sc.nextLine();
//        String[] i = date.split("\\.");
//        //parseInt는 문자열을 정수로 바꿔준다.
//        int date1 = Integer.parseInt(i[0]);
//        int date2 = Integer.parseInt(i[1]);
//        int date3 = Integer.parseInt(i[2]);
//        //04 -> 4자릿수도바 적으면 나머지 0으로 채움
//        System.out.printf("%04d.%02d.%02d", date1,date2,date3);
//
//
//    }

public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    String n = sc.next();
    String[] y = n.split("-");
    System.out.println(y[0]+y[1]);


}


}

