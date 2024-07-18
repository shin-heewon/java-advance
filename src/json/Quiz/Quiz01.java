package json.Quiz;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.Writer;
import java.nio.charset.StandardCharsets;
import org.json.JSONArray;
import org.json.JSONObject;

public class Quiz01 {

  static void createJsonFile(JSONObject o) throws IOException {
    String jasonValue = o.toString();
    Writer jsonWriter = new FileWriter("C:/Temp/user.json", StandardCharsets.UTF_8);
    jsonWriter.write(jasonValue);

    jsonWriter.flush();
    jsonWriter.close();

    System.out.println("파일이 생성되었습니다.");
  }

  static void parseJsonFile() {
    try {
      BufferedReader br = new BufferedReader(
          new FileReader("C:/Temp/user.json", StandardCharsets.UTF_8));

      String json = br.readLine();

      br.close();

      JSONObject root = new JSONObject(json);
      System.out.println("name : " + root.getString("name"));
      System.out.println("age : " + root.getInt("age"));
      System.out.println("address : " + root.getJSONObject("address").get("house"));
      System.out.println("isMarried : " + root.getBoolean("isMarried"));

      JSONArray hobbies = root.getJSONArray("hobbies");
      /*for (int i=0; i< hobbies.length(); i++){
        System.out.println("hobby"+i+" : "+ hobbies.get(i));
      }*/
      int i = 1;
      for (Object o : hobbies) {

        System.out.println("hobby " + i + " : " + o);
        i++;
      }

    } catch (IOException e) {
      throw new RuntimeException(e);
    }

  }


  public static void main(String[] args) throws IOException {

    JSONObject root = new JSONObject();
    root.put("name", "신세계");
    root.put("age", 19);
    root.put("isMarried", false);

    JSONObject address = new JSONObject();
    address.put("house", "서울시 성동구");

    root.put("address", address);

    JSONArray hobbies = new JSONArray();
    hobbies.put("watching movie");
    hobbies.put("travel");

    root.put("hobbies", hobbies);

    createJsonFile(root);

    System.out.println("=============================");

    parseJsonFile();

  }

}
