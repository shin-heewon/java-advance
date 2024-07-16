package lambda.part03;

//Person 클래스가 계산기를 이용해서 계산을 한다
public class Person {



  public void action2(Calculable2 cal2) {
    /*데이터 처리 메소드에게 데이터를 보낸다.*/
    int x = 10;
    int y = 20;
    int result = cal2.calculate(x, y);
    System.out.println(result);
  }

}
