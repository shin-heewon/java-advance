package stream_lambda;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class StreamEx01 {

  //1~10까지의 정수를 컬렉션에 담아 Stream을 이용해서 출력하기
  public static void main(String[] args) {

    //List<Integer> list = IntStream.rangeClosed(1,10);
    List<Integer> list = Arrays.asList(1,2,3,4,5,6,7,8,9,10);
    list = list.stream().filter(number -> number%2==0).toList();
    list.forEach(System.out::println);


    List<Integer> list1 = IntStream.rangeClosed(1,10).filter(number -> number%2==0).boxed()
    //boxed() 메소드는 IntStream을 Stream<Integer>로 박싱 후 결괄를 수집해서 list로 반환해주겠다.?
        .collect(Collectors.toList());
    list1.forEach(System.out::println);


    //소문자로 시작하는 영문 과일 이름을 대문자로 시작하도록 변경하기
    //1. 리스트 컬렉션에 소문자로 "apple, banana, orange, grape" 저장
    List<String> fruits = Arrays.asList("apple", "banana", "orange", "grape");

    //2.
    fruits.stream().map(String::toUpperCase).forEach(System.out::println);//원본은 변경되지 않음!!!
    fruits.forEach(System.out::println);


    //3.스페이스바를 기준으로 단어의 수 세서 출력하기
    List<String> sentence = Arrays.asList("This is a sentence.", "Java stream is awesome", "Let's count words");
    sentence.stream().mapToInt(sentence1 -> sentence1.split("\\s+").length).forEach(System.out::println);//
  }

}
