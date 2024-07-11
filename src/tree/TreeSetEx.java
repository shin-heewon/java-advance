package tree;

import java.util.NavigableSet;
import java.util.TreeSet;

public class TreeSetEx {

  public static void main(String[] args) {
    TreeSet<Integer> scores = new TreeSet<>();

    //학생 점수를 저장함과 동시에 정렬완성
    scores.add(88);
    scores.add(78);
    scores.add(98);
    scores.add(48);
    scores.add(60);
    scores.add(87);

    //정렬된 점수를 하나씩 가져오기 enhanced for 이용하여 출력하기 default : asc(오름차순)
    for (Integer score : scores) {
      System.out.print(score + " ");
    }

    System.out.println("\n======-----==============");

    /*특정 점수를 가져오기 */
    System.out.println("최저 점수 : "+ scores.first());
    System.out.println("최고 점수 : "+ scores.last());
    System.out.println("85점 아래 점수 : "+scores.lower(85));
    System.out.println("85점 위 점수 : "+scores.higher(85));
    System.out.println("95점 이거나 바로 아래 점수 : "+scores.floor(95));
    System.out.println("85점 이거나 바로 아래 점수 : "+scores.ceiling(85));

    System.out.println("\n======내림차순 정렬==============");

    NavigableSet<Integer> descScores = scores.descendingSet();
    for (Integer score : descScores) {
      System.out.print(score + " ");
    }

    System.out.println("\n======-----범위 검색==============");

    //기본이 asc이기 때문에 높은 값이 꼬리쪽에 있음
    NavigableSet<Integer> rangeScores = scores.tailSet(80, true);
    for (Integer score : rangeScores) {
      System.out.print(score + " ");
    }

    /*80 이상(true) 95 미만(false) 범위 검색*/
    NavigableSet<Integer> subScores = scores.subSet(80, true, 95, false);
    for (Integer score : subScores) {
      System.out.print(score + " ");
    }
  }


}
