import javax.xml.crypto.dsig.spec.XSLTTransformParameterSpec;
import java.util.Arrays;
import java.util.regex.Pattern;

public class C06String {
    public static void main(String[] args) {

//  참조자료형 : 기본 자료형을 제외한 모든 자료형
//  wrapper class: 기본형 타입에 없는 다양한 기능을 지원하기 위한 클래스
//  int와 Integer간 형변환 (자동으로 되서 암기는 하지 않아도 괜찮음)
       /* int a =10;
        Integer b =new Integer(20);

        //auto-unboxing
        int c =b;     //자동으로 타입이 변환되서 적용됨

        // (수동) 언박싱
        int d = b.intValue();

        // auto-boxing
        Integer e = a;

        //박싱
        Integer f = Integer.valueOf(a);*/

//  String과 int의 형변환  : toString()
       /* int a = 10;
        String st_a = Integer.toString(a);   // "10"
        int c = Integer.parseInt(st_a);      // 10*/

//    Char에서 String으로 형변환
       /* char ch1 = 'a';
        String st1=Character.toString(ch1);*/


//      참조자료형에 원시자료형을 담을때는 wrapper 클래스를 써야한다. (ex.컬렉션프레임워크(list, set..)
      /*  List<Integer> list_a = new ArrayList<>(); //List<int> list_a = new ArrayList<>(); 이렇게 쓰면 안됨, 인식 안됨
        list_a.add(10);
        list_a.add(20);
        list_a.add(30);
        System.out.println(list_a);*/
/*
        String mySt1 = new String("hello");
        String mySt2 = new String("hello");
        String mySt3 = "hello";
        String mySt4 = "hello";
        String mySt5 = mySt1;
        System.out.println(mySt1 == mySt2); //false
        System.out.println(mySt1 == mySt3 ); //false
        System.out.println(mySt1 == mySt4 ); //true
        System.out.println(mySt1 == mySt5 ); //true

//        equals
        System.out.println(mySt1.equals(mySt2)); //true
        System.out.println(mySt1.equals(mySt3) ); //true
        System.out.println(mySt1.equals(mySt4) ); //true
        System.out.println(mySt1.equals(mySt5)); // true


        List<Integer> myList = new ArrayList<>();
        myList.add("hello world");
        myList.add("hello world1");
        System.out.println(myList);
*/
// 문자열의 길이 : length();      -> 공백까지 센다 // 컴퓨터는 0부터 센다
        /*String mySt= "hello ";
        System.out.println(mySt.length());
*/
//    indexOf: 특정 문자열의 위치 반환, 가장 먼저 나오는 문자열의 위치 반환
      /*  String mySt2 = "hello java";
        int myst_index = mySt2.indexOf("java");
        System.out.println(mySt2.indexOf("j"));
*/
//    contains : 특정 문자열이 있는지 여부를 boolean으로 리턴
        /*String mySt2 = "hello java";
        System.out.println(mySt2.contains("hello"));*/

//     char At: 문자에서 특정 위치(index)의 문자(char)를 리턴
  /*      String a ="hello";
        char myChar = a.charAt(1);
        System.out.println(myChar);*/

        //실습: 반복문, charAt, length를 이용한 st안에 문자a의 개수

      /*  String b="akjanwoa";
        int count=0;
        for(int i=0;i<b.length();i++) {      //i<=b.length 은
            if (b.charAt(i)=='a'){
                count++;
            }
        }
        System.out.println(count);
*/
//        더하기
      /*  String a ="hello";
        a+=" world";
        a+=" world";
        a+=" world";
        a+=" world";
        a+=" world";
        System.out.println(a);*/


//  자료형 String
//        substring(a,b) : a이상 b 미만의 index를 자른다.
     /*   String st1 = "hello world";
        System.out.println(st1.substring(0, 5));
        System.out.println(st1.substring(6, st1.length()));
*/
//프로그래머스 예제
     /*   class Solution {
            public String solution(String s) {
                String answer="";
                if (s.length() % 2 == 0){
                    answer=s.substring(s.length()/2-1,s.length()/2+1);
                } else {
                    answer=s.substring(s.length()/2,s.length()/2+1);
                }

                return answer;
            }
           } // 미만인것 주의!!!*/
//    trim, strip
       /* String trimSt = "   hello world     ";      //원본의 데이터값을 제거하는게 아님
        String new_trimSt = trimSt.trim();
        String stripSt= trimSt.strip();
        System.out.println(new_trimSt);
        System.out.println(stripSt);*/

//       toUpperCase  toLowerCase
       /* String a="Hello";
        String a1= a.toLowerCase();
        String a2= a.toUpperCase();
        System.out.println(a1);
        System.out.println(a2);*/
// 실습 예제 : 알파벳만 빼고 str2에 새로 담기
        /*String str = "012abc34한글123";
        String str2 = "";
        for(int i=0;i<str.length();i++) {
            char temp = str.charAt(i);
            if (temp<'a'|| temp>'z'){
                str2 += Character.toString(temp);
             }
            }
        System.out.println(str2);*/

//        특정 문자 제거하기
        /*class Solution {
            public String solution(String my_string, String letter) {
                String answer = "";
                for(int i=0; i<my_string.length();i++){
                    char new_word=my_string.charAt(i);
                    String check= Character.toString(new_word);
                    if(!check.equals(letter)){
                        answer+= check;
                    }
                }
                return answer;
            }*/
        /*class Solution {
            public String solution(String my_string, String letter) {
                String answer = "";
                for(int i=0; i<my_string.length();i++){
                    if(my_string.charAt(i)!= letter.charAt(0)){
                        answer+= my_string.charAt(i);*/

//        replace(a,b) : a문자를 b로 대체
        /*String st1 = "hello world";
        String st2 = st1.replace("world", "java");
        System.out.println(st2);*/
//    replaceAll(a,b)
        /*String st3 = st1.replaceAll("world", "python");
        System.out.println(st3);*/

//      예제: 알파벳 제거
//        [a-z] : 소문자 알파벳
        /*String str = "01abc123한글123";
        String str2 = str.replaceAll("[a-z]","");
        System.out.println(str2);*/
//        [가-힣] : 한글
        /*String str = "01abc123한글123";
        String str3 = str.replaceAll("[가-힣]","");
        System.out.println(str3);*/
//        [0-9] : 숫자
      /*  String str = "01abc123한글123";
        String str4 = str.replaceAll("[0-9]","");
        System.out.println(str4);*/
//        [A-Za-z] : 알파벳 전체
        /*String str = "01abc123ABC한글123";
        String str5 = str.replaceAll("[A-Za-z]","");
        System.out.println(str5);*/
//        알파벳 전체와 숫자 [A-Za-z0-9]
      /*  String str = "01abc123ABC한글123";
        String str6 = str.replaceAll("[0-9A-Za-z]","");
        System.out.println(str6);*/

//     Pattern클래스
   /*     boolean matcher = Pattern.matches(".*[a-z].*","he한글llo은world");
        System.out.println(matcher);*/

//       전화번호 검증
//        {}: 연속으로  \d: 숫자
  /*      boolean matcher2 = Pattern.matches("^\\d{3}-\\d{4}-\\d{4}$", "010-1234-2312");
        System.out.println(matcher2);*/

//       이메일 검증
//        \d: 숫자   {}: 연속으로
     /*   boolean matcher3 = Pattern.matches("^[a-z0-9]+@+[a-z]+.com$", "hello@naver.com");
        System.out.println(matcher3);*/
//        특정 문자열 다루기- 프로그래머스
       /* boolean answer = false;
        if(s.length() == 4 || s.length() ==6){
            if(Pattern.matches("[0-9]+",s)){
                answer=true;
            }
        }*/
//       split
        /*String a = "a:b:c:d";
        String[] stArr=a.split(":");
        System.out.println(Arrays.toString(stArr));*/
      /*  String b = " a  b c d";
        String[] stArr2 = b.split(" ");
        System.out.println(Arrays.toString(stArr2));
        String[] stArr3 = b.split("\\s+");
        System.out.println(Arrays.toString(stArr3));*/

//        isEmpty 와 null 구분
        String st1=null; //
        String st2="";  //공백 , null 아님
        System.out.println(st1==null);
        System.out.println(st2==null);
        System.out.println(st2.isEmpty());
//        NullPointer Exception 예외 발생
        System.out.println(st1.isEmpty());

        String[] arr = new String[5];
        arr[0] = "hello";
        arr[1] = "world";
        for(int i=0; i<arr.length;i++){
            System.out.println(arr[i].length());
        }


    }
}

