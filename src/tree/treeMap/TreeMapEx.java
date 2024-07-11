package tree.treeMap;

import java.util.Map.Entry;
import java.util.NavigableMap;
import java.util.NavigableSet;
import java.util.Set;
import java.util.TreeMap;

public class TreeMapEx {

  public static void main(String[] args) {

    TreeMap<String, Integer> treemap = new TreeMap<>();

    //엔트리 저장
    treemap.put("권용빈", 90);
    treemap.put("서유미", 80);
    treemap.put("김은강", 95);
    treemap.put("고재현", 70);
    treemap.put("이경진", 83);
    treemap.put("이지은", 93);

    //정렬된 엔트리 하나씩 가져오기
    Set<Entry<String, Integer>> entrySet = treemap.entrySet();

    for(Entry<String, Integer> student : entrySet){
      System.out.println(student.getKey() +"---"+student.getValue());
    }

    System.out.println("=============key를 기준으로 정렬하여 출력==============");

    Entry<String, Integer> entry = null;
    entry = treemap.firstEntry();
    System.out.println(entry.getKey()+" --- "+ entry.getValue());

    entry = treemap.lastEntry();
    System.out.println(entry.getKey()+" --- "+ entry.getValue());

    entry = treemap.lowerEntry("이지은");//이지은의 앞에 있는 값인 이경진 출력
    System.out.println(entry.getKey()+" --- "+ entry.getValue());

    System.out.println("=============key를 기준으로 내림차순 정렬하여 출력==============");
    NavigableMap<String, Integer> descScores = treemap.descendingMap();
    Set<Entry<String, Integer>> descScoresSet = descScores.entrySet();
    for (Entry<String, Integer> student : descScoresSet) {
      System.out.print(student + " ");
    }

    System.out.println("\n\n");

    System.out.println("=============key로 범위 지정하여 출력==============");
    NavigableMap<String, Integer> subStudent = treemap.subMap("김", true, "이", false);

    for (Entry<String, Integer> submap : subStudent.entrySet()) {

      System.out.println(submap.getKey() + " "+submap.getValue());
    }

  }

}
