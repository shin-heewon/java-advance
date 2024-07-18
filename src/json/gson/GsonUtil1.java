package json.gson;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import java.util.ArrayList;
import java.util.List;
import org.json.JSONObject;

public class GsonUtil1 {

  private static Gson gson1 = new Gson();
  private static Gson gson2 = new GsonBuilder()
      .disableHtmlEscaping()// HTML문자를 유니코드로 이스케이프 처리(그대로 그대로 전송)한다.GsonBuilder를 통해 생성된 객체를 HTML문자 그대로 전달
      .setPrettyPrinting()//jSON문자열을 가독성 좋게 출력하게 하는 옵션
      .serializeNulls()//기본적으로 Gson은 null 필드를 생략하지만, 해당 옵션을 사용하면 null로 인해 필드가 누락된 경우 발생할 수 있는 예외상황을 예방할 수 있다.
      .create();

  private static Gson gson3 = new GsonBuilder().create();


  private static String getJsonData3() {
    JSONObject jsonObject = new JSONObject();
    jsonObject.put("data", "Test Data <신세계 자바 개발자 과정>");

    return gson3.toJson(jsonObject);

  }//end of getJsonData3()

  private static String getJsonData() {
    JSONObject jsonObject = new JSONObject();
    jsonObject.put("data", "Test Data <신세계 자바 개발자 과정>");

    return gson2.toJson(jsonObject);//toJson() : jsonObject를 Json문자열로 변환

  }//end of getJsonData()

  private static UserInfo getData() {

    UserInfo userInfo = new UserInfo();
    userInfo.setNo("1111");
    userInfo.setName("신세계");
    List<String> roles = new ArrayList<>();
    roles.add("Role-1");
    roles.add("Role-2");
    roles.add("Role-3");
    userInfo.setRoles(roles);
    return userInfo;
  }


  public static void main(String[] args) {

    System.out.println(getJsonData());

    System.out.println(gson2.toJson(getData()));


  }
}
