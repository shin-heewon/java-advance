package compare;

import java.util.Comparator;

/*제목 기준 내림차순 정렬기*/
public class DescSubject implements Comparator<Book2> {

  @Override
  public int compare(Book2 o1, Book2 o2) {
    int result = o1.getSubject().compareTo(o2.getSubject())*(-1);//내림차순이기 때문에 결과값(오름차순)을 반대?로 만들어주기 위해 -1 곱해줌
    return result;
  }
}
