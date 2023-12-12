import java.util.*;

public class C09Map {
    public static void main(String[] args) {
//  <String, String> -> Map
        //put: 값 넣기,  get: 출력하기
//        Map<String, String> myMap= new HashMap<>();
//        myMap.put("basketball","농구");
//        myMap.put("soccer","축구");
//        myMap.put("baseball","야구");
//        System.out.println(myMap);
//        System.out.println(myMap.get("basketball"));
//        size(), isEmpty() 사용 가능
//        putIfAbsent: 없으면 넣겠다
        //이미 key가 있을경우  put을 하면 덮어쓰기
        /*myMap.put("basketball","탁구");
        myMap.putIfAbsent("baseball","배구");*/
//        getOrDefault : key가 없으면 default 값 return
        /*System.out.println(myMap.getOrDefault("tennis","스포츠"));
        System.out.println(myMap.containsKey("tennis"));*/
//      remove: 삭제
        /*myMap.remove();*/
//  enhanced for: key 값 하나씩 출력
        /*for(String a: myMap.keySet()){
            System.out.println(myMap.get(a));*/

//        iterator 를 통해 key 값 하나씩 출력
       /* Map<String, String> myMap= new HashMap<>();
        myMap.put("basketball","농구");
        myMap.put("soccer","축구");
        myMap.put("baseball","야구");
        Iterator<String> myIter= myMap.keySet().iterator();*/
        //next () 메서드는 데이터를 소모시키면서 return (원본 데이터 삭제)
       /* System.out.println(myIter.next());
        System.out.println(myIter);*/
//        hasNext() : iterator 안에 값이 있는지 없는지
        /*while(myIter.hasNext()){
            System.out.println(myIter.next());
        }*/
//      실습예제: 아래의 리스트를 가지고 좋아하는 운동종목과 사람 숫자를 map 형태로 나타내시오.
        /*List<String> myList= new ArrayList<>();
        myList.add("basketball");
        myList.add("basketball");
        myList.add("basketball");
        myList.add("baseball");
        myList.add("baseball");
        myList.add("archer");
        myList.add("archer");
        myList.add("archer");*/
//          basketball 을 n명이 좋아한다.
//        Map<String,Integer> myMap= new HashMap<>();
//        for (String a: myList){
            /*if(myMap.containsKey(a)){
                myMap.put(a,myMap.get(a)+1);
            }else{
                myMap.put(a,1);
            }*/
//            myMap.put(a,myMap.getOrDefault(a,0)+1);
//        }
//완주하지 못한 선수 구하기 : 프로그래머스
        String[] participant = {"leo", "kiki", "eden"};
        String[] completion = {"eden", "kiki"};
        List<String> Party = new ArrayList<>(Arrays.asList(participant));
//        List<String> complete= new ArrayList<>(Arrays.asList(completion));
        String answer ="";
        Map<String, Integer> marathon = new HashMap<>();
        for (String a : Party) {
            marathon.put(a, marathon.getOrDefault(a, 1));
        }
        for (int i = 0; i < completion.length; i++) {
            if (marathon.containsKey(completion[i])) {
                marathon.put(completion[i], 0);
            }
        }
        for (String a: marathon.keySet()){
            if(marathon.get(a)==1){
                answer=a;
            }
        }
        System.out.println(answer);
    }
}


