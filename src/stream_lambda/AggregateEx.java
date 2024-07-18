package stream_lambda;

import java.util.Arrays;
import java.util.OptionalDouble;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class AggregateEx {

  public static void main(String[] args) {

    //정수형 배열 array
    int[] array = {1,2,3,4,5};


    //array요소 세기
    long count = Arrays.stream(array).count();
    System.out.println(count);

    /*총합*/
    int sum = Arrays.stream(array).sum();
    System.out.println("총합 : "+sum);

    /*평균*/

    double avg = Arrays.stream(array).average().getAsDouble();//그냥 못 받고 double로 만들어줘야됨
    OptionalDouble avg2 = Arrays.stream(array).average();
    System.out.println("평균 : "+avg+" 혹은  "+avg2);







    /*최대값*/
    int max = Arrays.stream(array).filter(num->num%2==0).max().getAsInt();
    System.out.println("최대값 : "+max);

    /*최소ㅓ*/
    int min = Arrays.stream(array).min().getAsInt();
    System.out.println("최소값 : "+min);

    /*첫번쨰 ㄱ밧*/
    int first = Arrays.stream(array).filter(a->a%2==0).findFirst().getAsInt();
    System.out.println("첫번째 값 : "+first);

    /**/

  }

}
