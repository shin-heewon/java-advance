package lamda;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class LambdaEx04 {

  public static void main(String[] args) {

    List<String> names = Arrays.asList("John", "Adam","Eve","Jane");

    /*Collections.sort(names, new Comparator<String>() {
      @Override
      public int compare(String o1, String o2) {
        return o1.compareTo(o2);//알파벳순으로 정렬
      }
    });*/


    /*람다를 통해 한 줄로 표현할 수 있다.*/
    Collections.sort(names, (a,b)->a.compareTo(b));


    for(String name : names) {
      System.out.println(name);
    }


    List<Integer> integers = Arrays.asList(1,2,3,4,5,6,7,8,9,10);
    int sum = 0;
    for(int number : integers){
      //리스트 컬렉션의 값 중 모든 짝수의 제곱의 합을 구하시오
      if(number%2 == 0){
        int square = number*number;
        sum += square;
      }
    }
    System.out.println(sum);


    int sum1 = integers.parallelStream().filter(number->number%2==0)//계산을 여러 스레드로 분산시켜 멀티 프로세스 계산과 같은 역할을 하는 스트림(빠르다)에 필터 장착
        .mapToInt(number -> number*number)
        .sum();

    System.out.println(sum1);


  }
}
