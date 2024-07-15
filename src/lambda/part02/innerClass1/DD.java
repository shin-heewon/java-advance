package lambda.part02.innerClass1;

public class DD {

  public void method3(int n){//메소드 내부에 선언한 로컬 변수는 다 final이다.(변수 n 포함)
    /*로컬변수 선언*/
    int var = 1;

    //로컬 클래스
    class E{

      void method4(){
        //로컬 변수
        System.out.println("n 값 : "+n);
        //System.out.println("var 값 : "+var);

        //var = 2;//로컬 클래스에서는 로컬 변수의 값을 수정할 수 없다.
      }

    }

    //로컬 객체 생성
    E e = new E();
    e.method4();
    //e.method3(); -> 호출 불가
    var = 5;

  }

}
//로컬 변수를 로컬클래스에서 사용할 경우 로컬변수는 final 특성을 부여한다.
//=> 값을 읽을 수만 있고 값을 수정할 수 없도록 제한된다.(로컬 클래스 내부에서 값을 변경 불가하도록 제한)
//api 만들어 배포할 때 로컬클래스로 만들어 배포하면 값 변경을 함부로 할 수 없다.