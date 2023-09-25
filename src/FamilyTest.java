//class Parent{
//    Parent( ){
//        System.out.println("Parent 1");
//    }
//    Parent(String str){
//        System.out.println("Parent 2");
//    }
//}
//class Child extends Parent{
//    Child( ){
//        System.out.println("Child 1");
//    }
//    Child(String str){
//        System.out.println("Child 2");
//    }
//}
//class FamilyTest{
//    public static void main(String args[]){
//        Child c1 = new Child( );
//        Child c2 = new Child("a");
//    }
//}
class Parent{
    Parent( ){ }
}
class Child extends Parent{
    Child( ){ }
    public void init( ){ }
}
class FamilyTest{
    public static void main(String args[]){
        Parent p = null;
        Child c1 = new Child( );
        Child c2 = null;
        p = c1;
        p.init( );
        c2 = p;
    }
}
//할수 있다 제발 열심히 살자
// 정재희 유혹, 인스타를 들어가지 말자
// 파이팅!!

//할수있을까?
//오늘 재희의 힘으로 밖으로 나왔다.
//감사하다..
//난 할수있다 아버지 도와주세요!
// 취업에 대해 어떠한 것도 타협하지 않을 것이다.