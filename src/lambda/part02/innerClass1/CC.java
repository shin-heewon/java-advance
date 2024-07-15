package lambda.part02.innerClass1;

//로컬 클래스 : 생성자나 메소드 안에서 생성되는 클래스
public class CC {

  void useC() {

    class D{
      //인스턴스 필드
      int field1 = 10;
      static int field2 = 20;

      D(){
        System.out.println("D 생서자 실행");
      }

      void method1(int arg){// final int arg의 의미를 가짐
        System.out.println("D - method 실행");
      }

      static void method2(){//static메소드는 java 17부터 가능함!(참고로 회사에서는 11버전 많이 사용함)
        System.out.println("D - static method2 실행");
      }

    }//D클래스 end

    /*로컬 객체 생성*/
    D d = new D();

    //로컬 객체의 인스턴스 필드와 메소드 사용
    System.out.println(d.field1);
    //d.method1();

    D.method2();
    System.out.println(D.field2);


  } //useC()메소드 end




}
