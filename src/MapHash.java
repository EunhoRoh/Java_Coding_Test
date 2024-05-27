import java.util.*;

public class MapHash {
    //put
    //remove, get

    //Map<String, Object> amap = new HashMap<>();
    String[][] map_hash;

    public void initiate(){
        String[][] temp2dArray= {};
        this.map_hash = temp2dArray;
    }

    public void setMapHash(String[][] array2dInt){
        this.map_hash=array2dInt;
    }
    public String[][] getMapHash(){
        return map_hash;
    }

    // put 메소드: 주어진 키와 값으로 새로운 엔트리를 추가합니다.
    public void put(String key, String value) {
        // 중복된 키 체크, map_hash의 키 값과 value들을 entry 1차원 배열에 저장, entry[0]에는 key가 있고 entry[1]에는 value가 있다.
        for (String[] entry : map_hash) {
            if (entry[0].equals(key)) {
                // 이미 존재하는 키라면 값을 업데이트하고 종료
                entry[1] = value;
                return;
            }
        }

        // 중복된 키가 없으면 새로운 엔트리를 추가
        // 2차원 배열 크기 늘리기
        String[][] temp2dArray = Arrays.copyOf(map_hash, map_hash.length + 1);
        //2차원 배열에 새로운 key, value값 추가
        temp2dArray[map_hash.length] = new String[]{key, value};
        this.map_hash = temp2dArray;
    }

    // get 메소드: 주어진 키에 해당하는 값을 반환합니다.
    public String get(String key) {
        //map_hash 2차원 배열을 하나씩 entry 1차원 배열에 저장
        for (String[] entry : map_hash) {
            //만약 찾으려는 키값과 같다면
            if (entry[0].equals(key)) {
                //value값 return
                return entry[1];
            }
        }
        // 해당 키를 찾지 못한 경우
        return null;
    }

    // remove 메소드: 주어진 키에 해당하는 엔트리를 제거합니다.
    public void remove(String key) {
        // map hash for문 돌리면서 키 값 찾기
        for (int i = 0; i < map_hash.length; i++) {
            if (map_hash[i][0].equals(key)) {
                // 해당 키를 찾았으면 배열에서 제거
                // map_hash보다 크기 작은 배열 선언
                String[][] temp2dArray = new String[map_hash.length - 1][map_hash[0].length];
                /*
                public static native void arraycopy(
                    Object src, int srcPos,
                    Object dest, int destPos,
                    int length);
                    출처: https://developer-talk.tistory.com/673 [DevStory:티스토리]
                 */
                //0번째 인덱스부터 시작해서, map_hash가 복사될 새로운 변수, 0번째부터 새로운 배열에 값 할당, 복사할 요소의 갯수
                // map_hash의 i index에서 지울 key 값을 발견했다.
                // i index를 지워야 하니 i갯수의 요소를 복사하고
                System.arraycopy(map_hash, 0, temp2dArray, 0, i);
                // map_hash의 i index가 아닌 i+1 번째 index부터 temp2Array의 i번째 index부터 map_hash 전체 길이에서 i개의 객수를 빼고 중복된 키값을 뺀 갯수를 매핑한다.
                System.arraycopy(map_hash, i + 1, temp2dArray, i, map_hash.length - i - 1);

                //temp2dArray 얕은 복사
                this.map_hash = temp2dArray;
                return;
            }
        }
    }

//    public String toString() {
//        StringBuilder result = new StringBuilder("총 갯수는 " + map_hash.length + "입니다.\n");
//        for (int i = 0; i < map_hash.length; i++) {
//            result.append("[").append(i).append("번째 값 : [Key: ").append(map_hash[i][0])
//                    .append(", Value: ").append(map_hash[i][1]).append("]]\n");
//        }
//        return result.toString();
//    }

    public String toString(){
        String result ="";
        result = "총 갯수는 "+ map_hash.length + "입니다.\n";
        for(int i=0; i<map_hash.length; i++){
            result +="["+ i + "번째 값 Key: "+ map_hash[i][0]+", Value: "+map_hash[i][1]+"]\n";
        }
        return result;
    }

    public static void main(String[] args) {
        MapHash myMap = new MapHash();
        myMap.initiate();

        myMap.put("One", "1");
        myMap.put("Two", "2");
        myMap.put("Three", "3");

        System.out.println(myMap.toString());

        myMap.put("Two", "NewValue");
        System.out.println(myMap.toString());

        System.out.println("Value for key 'Three': " + myMap.get("Three"));

        myMap.remove("Two");
        System.out.println(myMap.toString());
    }

//    public String[][] add(String param){
//        String[][] temp2dArray = new String[map_hash.length+1][];
//        for(int i=0; i<map_hash.length; i++){
//            for(int j=0;)
//            temp2dArray[i]= map_hash[i];
//        }
//        temp2dArray[map_hash.length+1][]=param;
//        this.map_hash=temp2dArray;
//        return map_hash;
//    }
//
//    public int[] add(int param, int num){
//        String[] temp2dArray = new String[map_hash.length+1];
//        for(int i=0; i<map_hash.length; i++){
//            temp2dArray[i]= map_hash[i];
//        }
//        temp2dArray[map_hash.length]=param;
//        this.map_hash=temp2dArray;
//        return map_hash;
//    }

//    public boolean remove(int num){
//        if(num <0){
//            return false;
//        }
//        if(num >= map_hash.length){
//            num =map_hash.length-1;
//
//        }
//        int[] temp2dArray = new int[map_hash.length-1];
//        for(int i=0; i<num; i++){
//            temp2dArray[i] = map_hash[i];
//        }
//        for(int i=num)
//            return false;
//    }


}
