package C16EtcClass;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.util.Calendar;

public class C1602Calender {
    public static void main(String[] args) {
        //날짜 관련된 클래스 종류 : Calender(java.util), java.time 패키지 안에 있는 Local 클래스
       /* Calendar time = Calendar.getInstance();    //google에서 가져오는 시간
        System.out.println(time.getTime());*/

        //특정한 숫자값은 get함수의 input 값으로 주어 원하는 날짜 정보를 출력할 수 있게 한다.
        /*System.out.println(time.get(1));
        System.out.println(time.get(Calendar.YEAR));
        System.out.println(time.get(Calendar.MONTH)+1);
        System.out.println(time.get(Calendar.DAY_OF_MONTH));
        System.out.println(time.get(Calendar.DAY_OF_WEEK));
        System.out.println(time.get(Calendar.HOUR));          // 12시
        System.out.println(time.get(Calendar.HOUR_OF_DAY));  //24시
        System.out.println(time.get(Calendar.MINUTE));
        System.out.println(time.get(Calendar.SECOND));*/

//  java.time 패키지 : Local~ 클래스
        LocalTime present_time = LocalTime.now();
        System.out.println(present_time.getHour());
        System.out.println(present_time.getMinute());
        System.out.println(present_time.getSecond());

        LocalTime present_date = LocalTime.now();
        System.out.println(present_date);

        LocalDateTime this_time= LocalDateTime.now();
        System.out.println(this_time);


    }
}
