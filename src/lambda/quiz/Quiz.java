package lambda.quiz;
/*5. for (int i = 0; i < 10; i++) {
    System.out.println(i);
  }  식을   람다식으로 변경
6. int sum;
int[] arr = {1,2,3,4,5};
sum = Arrays.stream(arr).sum();
System.out.println("합 : " + sum);    람다식으로 변경
7. / foreach 람다 형식을 이용하여 List 출력하기
   List<Integer> mmlists = Arrays.asList(1,2,3,4,5);
8. // for와 if를 이용하여 홀수에 대한 제곱의 합 구하기
      List<Integer> list = Arrays.asList(1,2,3,4,5,6,7,8,9);
9.  // stream을 이용하여 홀수의 합 구하기
    List<Integer> list = Arrays.asList(1,2,3,4,5,6,7,8,9,10);*/


import java.util.Arrays;
import java.util.List;
import java.util.stream.IntStream;

public class Quiz {

  static int sum;


  public static void main(String[] args) {

    //Q5 -1 -> IntStream방식으로 만들기
    IntStream.rangeClosed(0,10).forEach((int value)->System.out.println(value));

    //Q5-2 -> forEach방식
    List<Integer> list = Arrays.asList(1,2,3,4,5,6,7,8,9,10);
    list.forEach(System.out::println);


    /*Q6-1*/
    int sum1 = 0;
    int [] array = {1,2,3,4,5};
    sum = Arrays.stream(array).sum();
    System.out.println("6번 문제 합계 = "+sum1);


    //Q6-2

    List<Integer> list1 = Arrays.asList(1,2,3,4,5);
    list1.stream().forEach((i -> sum+=i));
    System.out.println(sum);

    /*
    Collection에 담긴 객체를 처리하는 반복자 3가지
    1. iterator 구성 방식
    2. stream 구성 방식
    3. while(iter.hasNext() == true){Object next = itor.next();}
     */


    /*7*/
    List<Integer> mmlist = Arrays.asList(1,2,3,4,5);
    mmlist.stream().forEach(m-> System.out.println(m));
    mmlist.stream().forEach(System.out::println);//위와 같음!!


    /*8*/
    List<Integer> list2 = Arrays.asList(1,2,3,4,5,6,7,8,9,10);
    int total = 0;
    for(Integer odd : list2){
      if(odd%2 ==1){
        total+=odd;
      }
    }

    /*stream 이용하여 홀수의 합을 구하는 방식 */
    total = list2.stream().filter(d->d%2==1).reduce(0, Integer::sum);
    System.out.println(total);


    /*9*/
    List<Integer> list3 = Arrays.asList(1,2,3,4,5,6,7,8,9,10);
    total = list2.stream().filter(d->d%2==1).reduce(0, Integer::sum);
    System.out.println(total);
  }

}
