package json;

import java.io.FileWriter;
import java.io.IOException;
import java.io.Writer;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import org.json.JSONArray;
import org.json.JSONObject;

public class CreateJsonEx {

  public static void main(String[] args) throws IOException {

    //json객체 생성
    JSONObject root = new JSONObject();

    //String 속성 추가
    root.put("id", "ssg001");
    root.put("name", "신세계");
    root.put("dept", "IT-Develop");
    root.put("job", "developer");

    //객체 속성 추가
    JSONObject phone = new JSONObject();
    phone.put("home", "02-3245-8989");
    phone.put("cellphone1", "010-1234-5678");
    phone.put("cellphone2", "010-7894-5612");

    root.put("keyPhone", phone);//==> root.keyPhone = new phone()

    /*root
    {id:value, name:value, dept:value, job:value, keyphone:value}
    //keyPhone에 phone객체의 주소값 넘겨줌(인젝션) ==>root.keyPhone = new phone();

    phone
    {home:value, cellphone1:value, cellphone2:value}*/


    /*배열 객체 속성 추가*/
    JSONArray skill = new JSONArray();//단일한 객체의 참조값만 넣을 수 있다, 순서 있음=>주소값만 넣을 수 있다.
    skill.put("Java");
    skill.put("C,C#");
    skill.put("Python");
    skill.put("JSP&Servlet");
    skill.put("Spring&SpringBoot");
    //skill.put("id", "111");//불가능
    root.put("skill", skill);




    /*JSON객체*/
    System.out.println(root);

    /*파일로 저장하기*/
    String jsonValue = root.toString();
    Writer jsonWriter = new FileWriter("C:/Temp/employee.json", StandardCharsets.UTF_8);
    jsonWriter.write(jsonValue);

    jsonWriter.flush();
    jsonWriter.close();
  }

}
