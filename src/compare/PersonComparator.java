package compare;

import java.util.Comparator;
import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor


/*person 들고와서 비교만 해주는 컴포넌트 클래스*/
public class PersonComparator implements Comparator<Person> {


  @Override
  public int compare(Person o1, Person o2) {//비교 대상을 직접 지정할 수 있음!

    /*if(o1.getAge() < o2.getAge()){
      return -1;
    } else if (o1.getAge() == o1.getAge()) {
      return 0;

    }else return 1;*/
return o1.getAge()-o2.getAge();
  }
}