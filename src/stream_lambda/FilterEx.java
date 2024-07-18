package stream_lambda;

import java.util.ArrayList;
import java.util.List;

public class FilterEx {

  public static void main(String[] args) {

    List<String> list = new ArrayList<>();
    list.add("서유미");
    list.add("서유미");
    list.add("서유미");
    list.add("김유미");
    list.add("박유미");
    list.add("박유미");

    // 중복요소 제거하기
    list.stream().distinct().forEach(System.out::println);
    System.out.println("===========================");

    //주어진 문자로 시작하면 true, 아니면 false
    list.stream().filter(yumis -> yumis.startsWith("박")).forEach(park->System.out.println(park));

  }

}
