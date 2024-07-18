package stream_lambda;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;

public class PredicateEx {//주어진 인수에 대하여 참,거짓 리턴

  public static void main(String[] args) {

    Predicate<Integer> isPositive = n -> n>0;

    System.out.println(isPositive.test(5));
    System.out.println(isPositive.test(-5));

    List<Integer> numbers = Arrays.asList(-3, -2, -1,0,1,2,3);


    //Predicate 타입으로 정의한 isPositive를 이용하여 filter 처리
    List<Integer> positiveNumbers = filter(numbers, isPositive);

    //결과
    System.out.println("양수인 숫자들 = "+positiveNumbers);
    positiveNumbers.forEach(System.out::println);

  }//end of main

  public static <T> List<T> filter(List<T> list, Predicate<T> isPositive){

    List<T> filterList = new ArrayList<>();
    for(T item : list){
      if (isPositive.test(item)){
        filterList.add(item);
      }
    }
    return filterList;
  }

}
