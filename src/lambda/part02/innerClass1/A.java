package lambda.part02.innerClass1;

/*중첩 클래스*/
public class A {

  //긴밀한 관계를 맺게 하기 위해서 이너클래스로 만들어놓음!!

  /*인스턴스 멤버 클래스*///default 접근제한자 이므로 같은 패키지 내부에서만 B클래스 사용 가능함
  //public이면 다른 패키지에서도 B클래스 사용 가능
  //privated이면 A클래스 단독 사용(대부분의 경우 이너 클래스는 private로 사용함)
  class B{
    int field = 10;
    static int field2 = 20;
    B(){
      System.out.println("B클래스 생성자 실행");
    }

    void method1(){
      System.out.println("B - method1 실행");
    }

    static void method2(){
      System.out.println("B - method2 실행");
    }





  }//end B class


  void userB(){//B에 있는 자원을 다 사용하는 메소드
    //B객체 생성과 인스턴스 메소드 및 필드 사용.
    B b =  new B();
    System.out.println(b.field);
    b.method1();

    System.out.println(B.field2);
    B.method2();
  }


  /*1. 인스턴스 필드 값으로 B객체 대입*/
  B field = new B();

  /*2, 생성자*/
  A(){
    B b = new B();
  }

  /*3. 인스턴스 메소드*/
  void method(){
    B b = new B();
  }
}
