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

//public static void main(String[] args){
//    Scanner sc = new Scanner(System.in);
//    String n = sc.next();
//    String[] y = n.split("-");
//    System.out.println(y[0]+y[1]);
//
//
//}
    //.을 표현하기 위해 [.]도 쓰인다.
//    public static void main(String[] args){
//        Scanner scanner = new Scanner(System.in);
//        String[] value = scanner.next().split("[.]");
//        int x = Integer.parseInt(value[0]);
//        int y = Integer.parseInt(value[1]);
//
//        System.out.printf("%d\n%d",x,y);
//    }
    //String class의 length() 함수는 string의 길이를 체크한다.
    //String class의 charAt() 함수는 String의 i번째 index를 체크한다.
//public static void main(String[] args){
//    Scanner scanner = new Scanner(System.in);
//    String a= scanner.nextLine();
//    int n = a.length();
//    for(int i=0; i<n; i++){
//        System.out.println("'"+a.charAt(i)+"'");
//    }
//}


    //toCharArray()는 문자열을 문자열 배열로 바꾸는 메서드
    //for문에서 length는 () 안쓰임
//    public static void main(String[] args){
//        Scanner scanner = new Scanner(System.in);
//        String a = scanner.next();
//        char[] cha= a.toCharArray();
//        for(int i=0; i<cha.length; i++){
//            System.out.print("["+cha[i]);
//            //j는 cha length보다 하나씩 작아져야한다.
//            for(int j=i; j<cha.length-1;j++){
//                System.out.print("0");
//            }
//            //j가 i보다 클때까지 반복하니까 똑같다.
////            for(int j=cha.length-1; j>i; j--){
////                System.out.print("0");
////            }
//            System.out.print("]\n");
//        }
//    }

    //equals 함수는 String이 같은지 보는 메서드
    public static void main(String[] args){
    Scanner scanner = new Scanner(System.in);
    String[] time=scanner.next().split(":");

    if(time[1].equals("00"))
        System.out.println("0");
    else
        System.out.println(time[1]);
}


}

