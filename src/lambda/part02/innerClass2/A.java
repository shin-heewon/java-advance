package lambda.part02.innerClass2;

public class A {

  //A클래스(바깥 클래스)의 인스턴스 필드와 메소드
  int field1;

  void method1() {
    System.out.println("A의 메소드1");

  }

  String field3 = "A-field의 값";

  //A클래스의 정적필드와 메소드
  static int field2;

  static void method2() {
  }


  //인스턴스 멤버 클래스
  private class B {
    String field = "B의 필드이다.";
    void method() {
      //A의 클래스의 인스턴스 필드와 메소드 사용 가능
  /*  field1 = 10;
    method1();
    method2();

    field2 = 10;
    method2();*/
      System.out.println("B-메소드");

    }

    void print(){
      System.out.println(this.field+" : B클래스의 필드");
      this.method();

      System.out.println(A.this.field1 + A.this.field3);
      A.this.method1();

    }

    //A의 인스턴스 메소드
    void useB(){//private로 선언된 내부 클래스는 A를 통하여 호출은 가능하지만 B 자체는 어떻게 구성되어있는지 확인 불가능(기능 확인 불가)
      B b = new B();
      b.print();
    }

  }

  static class C {

    void method() {
      //A의 인스턴스 필드와 메소드 사용-> 불가
      //field1 = 0;

      field2 = 30;
      method2();


    }

  }


}
