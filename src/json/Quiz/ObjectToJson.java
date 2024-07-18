package json.Quiz;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import org.json.JSONObject;

public class ObjectToJson {

  public static void main(String[] args) {


    Student student = new Student(11, "신세계");


    Gson gson = new GsonBuilder().disableHtmlEscaping().setPrettyPrinting().serializeNulls().create();

    JSONObject json = new JSONObject();
    json.put("student", student);



    System.out.println(gson.toJson(json));

    String jsonStudnet = "{\"id\":1,\"name\":\"SSG\"}";

    JSONObject json2 = new JSONObject(jsonStudnet);
    Student student2 = new Student((int)json2.get("id"), (String)json2.get("name"));

    System.out.println(student2);


  }

}
