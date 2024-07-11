package collectionEx.set;

import lombok.AllArgsConstructor;
import lombok.Getter;

@Getter
@AllArgsConstructor
public class Member {
  public String name;
  public int age;

  @Override
  public int hashCode() {
    return name.hashCode() + age;//name은 String이기 때문에 같은 해시코드값을 가짐. 즉 이름과 나이가 같으면 같은 객체로 인식할 수 있도록 해 줌.
  }

  /*@Override
  public boolean equals(Object obj) {
    if(obj instanceof Member member){
      return member.name.equals(name) && (member.age == age);
    }else {
      return false;
    }

  }*/
}
