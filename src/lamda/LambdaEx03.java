package lamda;

/*
 * 1. 정수 리스트를 받아 정수를 반환하는 단일 추상 메소드 getMax()를 사용하여 FindMax인터페이스를 생성하시오
 * 2. 정수 리스트를 반복하고 최대값을 찾는 람다식을 구현합니다.
 * 3. 최대값은 Integer.MIN_VALUE로 설정한 후 더 적합한? 숫자가 나타나면 업데이트, 최대값은 변수 max에 저장
 * 4. 정수리스트 생성
 * 5. max객체에서 getMax()호출하여 최대값 출력
 * */

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@FunctionalInterface
interface FindMax {

  int getMax(List<Integer> numbers);
}

public class LambdaEx03 {


  public static void main(String[] args) {

    FindMax maxNum = numbers -> {
      int max = Integer.MIN_VALUE;
      /*for (int i = 0; i < numbers.size(); i++) {
        if (numbers.get(i) > max) {
          max = numbers.get(i);
        }
      }*/
      for(int number : numbers){
        if(number > max){
          max = number;
        }
      }
      return max;
    };

    List<Integer> numberList = Arrays.asList(1,2,3,4,5,6,7,8,9,10);

    int result = maxNum.getMax(numberList);
    System.out.println(result);


  }

}
