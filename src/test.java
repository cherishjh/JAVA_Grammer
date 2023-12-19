public class test {
    public static void main(String[] args) {
        String a = "aaaaaa";
        String b = "bbb";
        int c = 3;
        System.out.println(solution(a,b,c));
    }
    public static String solution(String my_string, String overwrite_string, int s) {

        String answer="";
        String str = my_string.substring(s,overwrite_string.length()+s);
        answer= my_string.replace(str, overwrite_string);
        return answer;
    }
}

