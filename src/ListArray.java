import java.util.*;
public class ListArray {




    //int list_b[] = new int[100];
    int[] list_b;

    public void setArrayInt(int[] arrayInt){
        this.list_b=arrayInt;
    }
    public int[] getList_b(){
        return list_b;
    }
    public void initiate(){
        int[] tempArray= {};
        this.list_b = tempArray;
        //setArrayInt();
    }

    public int[] add(int param){
        int[] tempArray = new int[list_b.length+1];
        for(int i=0; i<tempArray.length; i++){
            tempArray[i]= list_b[i];
        }
        tempArray[list_b.length+1]=param;
        this.list_b=tempArray;
        return list_b;
    }

    public int[] add(int param, int num){
        int[] tempArray = new int[list_b.length+1];
        for(int i=0; i<list_b.length; i++){
            tempArray[i]= list_b[i];
        }
        tempArray[list_b.length]=param;
        this.list_b=tempArray;
        return list_b;
    }

    public boolean remove(int num){
        if(num <0){
            return false;
        }
        if(num >= list_b.length){
            num =list_b.length-1;

        }
        int[] tempArray = new int[list_b.length-1];
        for(int i=0; i<num; i++){
            tempArray[i] = list_b[i];
        }
//        for(int i=num)
        return false;
    }

    int list_leng=0;

//    public void add(int c){
//        //list_b에 c를 더한다.
//
//        list_b[list_leng]=c;
//        list_leng++;
//    }
//
//    public void remove(int list_index){
//        //list_b 의 index 원소 제거
//        list_b[list_leng]=0;
//        list_leng--;
//    }

    public void all(){
        for (int list_element:list_b
             ) {
            System.out.println(list_element);

        }
    }

    public String toString(){
        String result ="";
        result = "총 갯수는 "+ list_b.length + "입니다.";
        for(int i=0; i<list_b.length; i++){
            result +="["+ i + "번째 값 : "+ list_b[i];
        }
        return result;
    }

    List<Integer> alist = new ArrayList<>(); //-> 큰 그릇에 작은 그릇을 담는다. 그러니까 ArrayList 기능만 사용 가능, 구현체
    //구현이랑 상속 개념 차이
    // 구현은 interface로 생각해 볼 수 있을까? 살짝 다르다
    Map<String, Object> amap = new HashMap<>(); //Object는 모든 타입 가능
    //amap.put("홍길동", "안녕하세요!");  // put, remove, get
    // list -> remove, add, for each
    String result = (String)amap.get("홍길동"); // => 다운 캐스팅

    public static void main(String [] args){
        ListArray list_a = new ListArray();
        list_a.initiate();

        list_a.add(1);

        System.out.println(list_a.toString());

        list_a.add(1);
        list_a.all();

        list_a.remove(0);
        list_a.all();
    }


}

//LIstArray
// MapHash 라고 해서 Map 기능 구현 -> list, map 기능 제외하고 
// 개발하고 싶은 프로젝트 정해오기
