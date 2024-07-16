package lambda.ex;

public class Example01 {
/*Function 함수형 인터페이스를 작성하세요.*/
  @FunctionalInterface
  interface Function{

    double apply(double x, double y);//SAM
}


  public static double calc(Function function){
    double x = 30;
    double y = 3;
    return function.apply(x,y);
  }



  public static void main(String[] args) {

    double result = calc((x,y)->(x/y));
    System.out.println("result = "+result);


  }

}
