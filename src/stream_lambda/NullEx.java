package stream_lambda;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

public class NullEx {

  public static void main(String[] args) {

    /*String str = null; //null의 의미 : 주소값이 없다
    if(str == null){
      System.out.println("null~~");

    }else {
      System.out.println(str);
    }*/

    List<String> nameList = Arrays.asList("BBB","CCC","AAA","DDD");

    //Optional 클래스는 제너릭타입을 사용하여 값의 타입을 지정한다.

    //1-1. 존재 여부에 따른 처리
    String value = "Hello Optional!";
    String value1 = null;

      //1-1-1 Optional.of(value) 객체 생성하기,, 값을 감싸 안아 값을 검사하겠다=> if로 감쌌다고 생각하면 됨
    Optional<String> optionals = Optional.of(value);

    //1-1-2. Optionals 객체의 값의 유무 확인
    if(optionals.isPresent()){
      System.out.println(optionals.get());
    }
    //위 코드와 같은 의미~~
    optionals.ifPresent(System.out::println);

    System.out.println("========================================");

    //2. null처리 방법
    Optional<String> optionals1 = Optional.ofNullable(value1);
    //if 대신 ofNullable()을 사용하면 값이 null인 경우에도 npe 발생시키지 않음,,of()로 처리하면 예외 발생됨
    //2-1 orElse 를 사용해서 null인 경우 기본ㄱ밧 반환, null이 아닌 경우 결과값 반환
    String result = optionals1.orElse("반갑습니다. null처리 메시지입니다.");
    System.out.println(result);

  }

}
