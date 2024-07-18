package lambda.ex;


import java.util.Arrays;

@FunctionalInterface
interface Operator{
  int apply (int x, int y);

}

public class Example02 {
  private static int[] scores ={90,80,60};

  public static int maxOrMin(Operator operator){
    int result = scores[0];
    // scores에서 최대값 또는 최소값을 찾아 리턴하는 코드를 작성하세요

    for(int i =0; i< scores.length; i++){
      result = operator.apply(result,scores[i]);
    }
    return result;
  }


  public static void main(String[] args) {

    int max = maxOrMin((x,y)->Math.max(x, y));  //최대값 얻기 람다식 작성
    int min = maxOrMin((x,y)->Math.min(x, y));  //최소값 얻기 람다식 작성

    int max1 = maxOrMin((x,y)->x>y? x:y);  //최대값 얻기 람다식 작성
    int min1 = maxOrMin((x,y)->x<y?x:y);  //최소값 얻기 람다식 작성

    System.out.println(max);
    System.out.println(min);

  }
}
