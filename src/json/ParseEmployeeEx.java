package json;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.nio.charset.StandardCharsets;
import org.json.JSONArray;
import org.json.JSONObject;

public class ParseEmployeeEx {

  public static void main(String[] args) throws IOException {

    //파일(employee.json)로부터 읽어오기
    //fileReader에 성능 향상을 위해 bufferedReader를 추가해서 읽어들이기
    BufferedReader br = new BufferedReader(new FileReader("C:/Temp/employee.json", StandardCharsets.UTF_8));

    String json = br.readLine();

    br.close();

    //JSON 파싱 : 읽어온 json객체를 json객체로 복구하기

    //String 속성 정보 읽기
    JSONObject root = new JSONObject(json);
    System.out.println(root.getString("id"));

    //객체 속성 정보 읽기(phone객체 생성)
    JSONObject phone = root.getJSONObject("keyPhone");
    System.out.println(phone.getString("home"));


    //배열 속성 정보 읽기
    JSONArray skill = root.getJSONArray("skill");
    for (int i=0; i<skill.length(); i++){
      System.out.println("skill : "+skill.get(i));

    }

  }

}
