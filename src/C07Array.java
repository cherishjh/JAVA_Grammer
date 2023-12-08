import java.util.Arrays;
import java.util.Comparator;

public class C07Array {
    public static void main(String[] args) {
//        표현식1
        /*int[] int_arr1 = {1, 2, 3, 4};*/
//        int_arr1[1]; //2가 나옴
//        표현식2
        /*int[] int_arr2=new int[4];
        int_arr2[0]=1;
        int_arr2[1]=2;
        int_arr2[2]=3;
        int_arr2[3]=4;*/
//        표현식3
        /*   int[] int_arr3=new int[]{1,2,3,4};*/
//        표현식 4는 불가: java의 배열은 반드시 길이가 지정되어야 함.
//        int[] int_arr3 = new int[];
       /* String[] arr_st=new String[5];
        arr_st[0]="java";
        arr_st[1]="python";
        arr_st[2]="C++";
        for(int i=0; i<arr_st.length;i++){
            System.out.println(arr_st[i].length());
        }*/
        //null-point exception 이 생김, 빈 공간이 null값이기 때문
      /*  for(int i=0;i<arr_st.length;i++){
            if(arr_st[i].isEmpty()){
                System.out.println("비어있습니다."); //null 값 인지 못함
            }
        }
*/
//        85,65,90인 int 배열을 선언한 뒤, 총합, 평균값. for 문 이용
     /*   int [] arr={85,65,90};
        int total=0;
        for (int i=0; i< arr.length ; i++){
            total += arr[i];
        }
        int average_1 = total/arr.length;
        System.out.println(total);
        System.out.println(average_1);*/

//       최대값, 최소값
       /* int[] minmax= {10,20,30,12,8,17};
        int max=minmax[0];
        int min=minmax[0];
        for (int i=0; i< minmax.length ; i++){
            if(minmax[i]>=max){
                max=minmax[i];
            }
            if(minmax[i]<=min){
                min=minmax[i];
            }
            }
        System.out.println(max);
        System.out.println(min);*/

//        배열의 순서 바꾸기
       /* int[] arr = {10, 20};
        int temp = arr[0];
        arr[0] = arr[1];
        arr[1] = temp;*/


 /*       int[] arr2={10,20,30,40,50,60,70};
        int ini = arr2[0];
        int i = 0;
        while (i < arr2.length-1) {
            int temp=arr2[i+1];
            arr2[i+1] = arr2[i];
            arr2[i]=temp;
            i++;

        }
        arr2[arr2.length-1]=ini;
        System.out.println(Arrays.toString(arr2));*/

   /*     int[] arr3={10,20,30,40,50,60,70};
        int init = arr3[0];
        int j = 0;
        for(j=0;j<arr3.length-1;j++){
            int temp = arr3[j];
            arr3[j]=arr3[j+1];
            arr3[j+1]= temp;
        }
        arr3[arr3.length-1]=init;
        System.out.println(Arrays.toString(arr3));*/
//  배열뒤집기
        /*int [] arr={1,2,3,4,5};*/
        //  신규배열 선언 : arr2 :
        /*int [] arr2=new int[arr.length];
        for (int i=0; i<arr.length;i++) {
            System.out.println(i);
            arr2[i]=arr[arr.length-1-i];
        }
        System.out.println(Arrays.toString(arr2));*/

/*        int [] arr3=new int[arr.length];
        int i=0;
        while(i<arr.length){
            arr3[i]=arr[arr.length-1-i];
            i++;
        }
        System.out.println(Arrays.toString(arr3));*/

//  배열 뒤집기2
       /* int [] arr={1,2,3,4,5};*/
//        int [] arr2=new int[arr.length];
      /*  for(int i=0; i<arr.length/2;i++){
            int temp=arr[i];
            arr[i]=arr[arr.length-1-i];
            arr[arr.length-1-i]=temp;
        }
        System.out.println(Arrays.toString(arr));*/

        /*int j=0;
        while(j<arr.length/2){
            int temp=arr[j];
            arr[j]=arr[arr.length-1-j];
            arr[arr.length-1-j]=temp;
            j++;
        }
        System.out.println(Arrays.toString(arr));*/
//정렬: sort() 함수 사용
        //오름차순
       /* int[] arr={1,6,2,4,7,5,5,2,3};
        Arrays.sort(arr);
        System.out.println(Arrays.toString(arr));*/

        //내림차순
//        방법1. Comparator 객체 사용
//        객체타입인 경우에만 Comparator 클래스 사용 가능
       /* String[] st_arr={"hello","hi","bye","goodmorning"};
        Arrays.sort(st_arr);
        System.out.println(Arrays.toString(st_arr));
        Arrays.sort(st_arr, Comparator.reverseOrder());
        System.out.println(Arrays.toString(st_arr));
        Integer[] arr_integer = {5,1,2,7,4,1,2};
        Arrays.sort(arr_integer,Comparator.reverseOrder());*/
//        comparator 클래스는 기본형 타입은 처리 불가
//        Arrays.sort(arr, Comparator.reverseOrder());
//        방법2. 배열 뒤집기
        int[] arr={1,6,2,4,7,5,5,2,3};
        Arrays.sort(arr);
        for (int i=0; i<arr.length/2;i++){
            int temp=arr[i];
            arr[i]=arr[arr.length-1-i];
            arr[arr.length-1-i]=temp;
        }
        System.out.println(Arrays.toString(arr));

//        StreamApi, lambda를 활용한 내림차순 정렬
        int[] arr2={5,1,2,7,3,1,2};
        int[] new_arr2= Arrays.stream(arr2) //arr2를 대상으로 stream 객체 생성 문법
        int[] new_arr2= Arrays.stream(arr2).boxed() // int를 Integer로 형변환 스트림객체생성
        int[] new_arr2= Arrays.stream(arr2).boxed().sorted(Comparator.reverseOrder()) // 내림차순 정렬
        int[] new_arr2= Arrays.stream(arr2).boxed().sorted(Comparator.reverseOrder()).mapToInt(a->a) // Integer를 int로 변환
        int[] new_arr2= Arrays.stream(arr2).boxed().sorted(Comparator.reverseOrder()).mapToInt(a->a).toArray() // 배열로 변환




    }
}
