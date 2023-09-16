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
