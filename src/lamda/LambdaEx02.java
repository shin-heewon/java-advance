package lamda;

import java.util.Arrays;

/*
 * 1. 두 개의 정수를 받아 정수를 반환하는 단일 메소드 'operate'가 있는
 *     함수형 인터페이스 MathOperation을 정의
 * 2. 두 개의 정수  a,b를 더하는 람다 표현식을 생성(a,b)->a+b
 * 3. 람다 표현식을 사용하여 함수형 인터페이스의 인스턴스를 생성하고
 *     operate()호출해서 두 숫자의 합을 구한다.
 * */
public class LambdaEx02 {

  /*1번*/
  @FunctionalInterface
  interface MathOperation {

    int operate(int a, int b);
  }

  @FunctionalInterface
  interface StringOperation {

    int getLength(String a);
  }

  @FunctionalInterface
  interface ArrayOperation {

    int calculateSum(int[] numbers);
  }

  public static void main(String[] args) {
    /*2번*/
    MathOperation addition = (a, b) -> a + b;//MathOperation 인터페이스 타입의 addition 변수 선언

    /*3번 함수형 인터페이스 생성 operate()호출 결과 반환*/
    int result = addition.operate(5, 3);
    System.out.println("result = " + result);

    /*문제 : 문자열을 받아 그 길이를 반환하는 람다 표현식을 작성하시오.*/
    //인터페이스 이름 : StringOperation
    StringOperation strLength = str -> str.length();
    int result1 = strLength.getLength("Hello Lambda");
    System.out.println(result1);

    //문제2 : 정수 배열을 받아 모든 짝수의 합을 반환하는 람다 표현식 : ArrayOperation
    ArrayOperation evenSum = numbers -> {//이 위치에서 오버라이딩 한다고 생각하면 됨!
      int sum = 0;
      for (int num : numbers) {
        if (num % 2 == 0) {
          sum += num;
        }
      }
      return sum;
    };
    int[] arr = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
    int result2 = evenSum.calculateSum(arr);
    System.out.println(result2);

  }

}
