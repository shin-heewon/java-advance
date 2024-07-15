package lambda.part02.innerClass1;

//로컬 클래스 : 생성자나 메소드 안에서 생성되는 클래스
public class C {

  C(){

    class D{}

    D d = new D();


  }

  void method(){

    class D{

      D d = new D();
    }

  }

}
