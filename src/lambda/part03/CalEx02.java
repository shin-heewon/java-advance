package lambda.part03;

public class CalEx02 {

  public static void main(String[] args) {

    Person user = new Person();

    //user 컴퓨터의 덧셈기를 이용하여 두 수를 더하여 결과를 확인합니다.
    user.action2(Computer::adder);//정적 메소드(static adder)에 접근하는 방법


    //user 컴퓨터의 곱셈기를 이용하여 두 수를 곱하여 결과를 확인합니다.
    Computer com = new Computer();
    user.action2(com::multiply);//Computer의 인스턴스 메소드 접근,,인스턴스를 통해서 multiply()메소드 접근하는 방법
  }

}
