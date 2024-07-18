package json.gson;

import java.util.List;
import lombok.Data;

@Data
public class UserInfo {

  private String No;
  private String name;
  private List<String> roles;//사용자는 여러개의 역할을 가질 수 있음


}
