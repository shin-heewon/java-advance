package stream_lambda.quiz;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class quiz07 {

  public static void main(String[] args) {

    List<Integer> numbers = Arrays.asList(1,2,3,4,5,6,7,8,9,10);
    Integer sum = numbers.stream().filter(number->number%2==0).reduce(0,Integer::sum);
    System.out.println(sum);


  }

}
