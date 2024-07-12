package compare;

import java.util.Collections;
import java.util.TreeSet;

public class PersonEx {

  public static void main(String[] args) {
    //TreeSet<Person> people = new TreeSet<Person>();
    TreeSet<Person> people = new TreeSet<Person>(new PersonComparator());// 트리셋에 person을 추가할 때 persontComparator를 달아서 사용하겠다~

    people.add(new Person("aaa", 10));
    people.add(new Person("bbb", 20));
    people.add(new Person("ccc", 30));
    people.add(new Person("ddd", 40));
    people.add(new Person("eee", 40));
    people.add(new Person("fff", 50));

    //Collections.synchronizedSortedSet(people);


    //case1 : 이름 기준으로 값(value)가 같은 ddd와 eee는 둘 중 하나만 출력됨
    //treeSet에는 기본적으로 정렬 기능이 내장되어 있음
    for (Person person : people){
      System.out.println(person.getAge()+" "+ person.getName());
    }


  }
}
