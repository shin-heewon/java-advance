package DataIO.object;

import java.io.Serializable;
import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class Member implements Serializable {//직렬화(Serialize)가 가능한 객체임을 표시해주기 위해 인터페이스 구현
  private static final long serialVersionUID = 1L;

  private String id;
  private String name;

}
