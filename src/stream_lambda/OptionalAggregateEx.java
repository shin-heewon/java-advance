package stream_lambda;

import java.util.ArrayList;
import java.util.List;
import java.util.OptionalDouble;

public class OptionalAggregateEx {

  public static void main(String[] args) {

    /* Optional을 사용하여 null 처리하는 방법 3가지*/
    //1. isPresent()  2. orElse()   3. ifPresent()
    List<Integer> list = new ArrayList<>();
    list.add(10);
    list.add(10);
    list.add(10);
    list.add(10);
    list.add(10);
   /* double avg  = list.stream().mapToInt(Integer :: intValue).average().getAsDouble();

    System.out.println(avg);//값 안 넣으면 NoSuchElementException 발생*/

    /*1. isPresent()*/
    OptionalDouble opt1 = list.stream().mapToInt(Integer::intValue).average();
    if (opt1.isPresent()) {
      System.out.println(opt1.getAsDouble());
    } else {
      System.out.println("0.0");
    }

    System.out.println("\n================================\n");
    /*2. orElse() -> 가장 많이 선호되는 방식임!!*/
    double avg = list.stream().mapToInt(Integer::intValue).average().orElse(0.0);//문제 생기면 0.0 처리하기
    System.out.println(avg);


    System.out.println("\n================================\n");
    /*3. ifPresent*/
    list.stream().mapToInt(Integer::intValue).average().ifPresent(avg1-> System.out.println(avg1));//산출된 값이 없으면 아무 것도 출력되지 않음
  }

}
