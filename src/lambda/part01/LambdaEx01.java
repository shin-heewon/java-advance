package lambda.part01;

import java.util.Arrays;
import java.util.List;

public class LambdaEx01 {

  public static void main(String[] args) {
    //List 컬렉션에 1~10 10개의 정수를 저장하고 컬렉션의 짝수의 합을 구하시오

    List<Integer> numbers = Arrays.asList(1,2,3,4,5,6,7,8,9,10);//asList() : 파라미터로 들어온 매개변수들을 arrayList로 만들어 리턴해준다.

    int sumOfEventNumbers = numbers.stream().filter(number->number%2 == 0)//스트림(흐름)으로 받을건데 필터를 끼워서 받을거다~
        .mapToInt(Integer::intValue).sum();//짝수를 정수형으로 변형해서 sum()을 통해 합계를 저장.

    System.out.println(sumOfEventNumbers);


  }

}
