package lambda.part02.innerClass1;

public class ABEx {

  public static void main(String[] args) {
    /*A객체 생성*/
    A a = new A();

    /*B객체 생성*/
    /*userB() 메소드가 B클래스 안에 있는 경우
    A.B b = a.new B();

    b.method1();
    b.userB();*/

    /*userB()메소드가 A클래스 내부에 있고 B클래스 안에는 없는 경우*/
    a.userB();




  }




}
