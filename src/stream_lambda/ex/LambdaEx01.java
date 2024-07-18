package stream_lambda.ex;

@FunctionalInterface
interface Func {

  int max(int n1, int n2);
}


public class LambdaEx01 {

  public static void main(String[] args) {

    //함수형 인터페이스란?
    //함수를 변수처럼 선언해서 사용하는 개념
    //코드를 간결하게 작성할 수 있다.


    /*//익명함수
    System.out.println(new fun1() {

      public int max(int n1, int n2) {
        return n1 > n2 ? n1 : n2;
      }
    }.max(5, 7));*/


    /*위 식을 람다와 함수형 인터페이스를 사용하여 간결하게 표현함*/
    Func func = (int a, int b) -> a > b ? a : b; //순수 함수 : 람다식으로 생성된 함수, 인터페이스로만 선언이 가능하다.
    System.out.println(func.max(3, 5));


  }

}
