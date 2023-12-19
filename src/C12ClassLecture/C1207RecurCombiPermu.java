package C12ClassLecture;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class C1207RecurCombiPermu {
    static boolean[] visited;

    public static void main(String[] args) {
        List<Integer> myList = new ArrayList<>(Arrays.asList(1, 2, 3, 4));  // 1,2,3,4
        List<List<Integer>> combinations = new ArrayList<>();
        List<Integer> temp = new ArrayList<>();
       /* combination(0, temp, 2, combinations, myList);
        System.out.println(combinations);*/
        /*for (int i = 0; i < myList.size(); i++) {
            temp.add(myList.get(i));
            for (int j = i + 1; j < myList.size(); j++) {
                temp.add(myList.get(j));
                combinations.add(new ArrayList<>(temp));
                temp.remove(temp.size() - 1);
            }
            temp.remove(0);  //i는 횟수 --> i로 출력되는 값 삭제
        }
        System.out.println(combinations);*/

        /* for(int i=0; i<myList.size();i++){
                    for(int j=i+1; j<myList.size();j++){
                        List<Integer> combi= new ArrayList<>();
                        combi.add(myList.get(i));
                        combi.add(myList.get(j));
                        combinations.add(combi);
                    }
                }
                System.out.println(combinations);*/
        visited = new boolean[myList.size()];
        permutation(3,temp,combinations, myList);
        System.out.println(combinations);
    }

    static void combination(int count, List<Integer> temp, int n, List<List<Integer>> combinations, List<Integer> myList) {
        if (temp.size() == n) {
            combinations.add(new ArrayList<>(temp));
            return;
        }
        for (int i = count; i < myList.size(); i++) {
            temp.add(myList.get(i));
            combination(i + 1, temp, n, combinations, myList);
            temp.remove((temp.size() - 1));
        }
    }

    static void permutation(int n, List<Integer> temp, List<List<Integer>> combinations, List<Integer> myList) {
        if (temp.size() == n) {
            combinations.add(new ArrayList<>(temp));
            return;
        }
        for (int i = 0; i < myList.size(); i++) {
            if (visited[i] == false) {
                visited[i] = true;
                temp.add(myList.get(i));
                permutation(n, temp, combinations, myList);
                temp.remove((temp.size() - 1));
                visited[i] = false;
            }
        }
    }
}