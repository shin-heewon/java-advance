package compare;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
/*public class Person implements Comparable<Person>{

  private String name;
  private int age;

  @Override
  public int compareTo(Person o) {

    return this.getAge()-o.getAge();
  }
}*/



public class Person  {

  private String name;
  private int age;

/*  @Override
  public int compare(Person o1, Person o2) {//비교 대상을 직접 지정할 수 있음!

    if(o1.getAge() < o2.getAge()){
      return -1;
    } else if (o1.getAge() == o1.getAge()) {
      return 0;

    }else return 1;

  }*/
}