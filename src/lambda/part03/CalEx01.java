package lambda.part03;

import static java.lang.Integer.sum;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;
import lombok.Data;

@Data
public class CalEx01 {
  //사용자로부터 두 개의 정수를 받아 데이터를 저장하고 있는 메소드
  //action() : Calculable타입을 전달받아 Calculable인터페이스의 calculate()메소드로 데이터를 처리하는 메소드이다.

  //action을 이용하여 입력받은 두 개의 정수를 더하기, 곱하기 연산을 하는 람다식 작성
  // 그 결과를 바로 출력하기


  public static void action(Calculable cal) {
    /*데이터 처리 메소드에게 데이터를 보낸다.*/
    int x = sc.nextInt();
    int y = sc.nextInt();
    //String data1 = processData((BufferedReader br) -> {br.readline();});

    cal.calculate(x, y);
  }

  public static String processData() throws IOException{

    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    return br.readLine();
  }

  static Scanner sc = new Scanner(System.in);

  public static void main(String[] args) {

    action((x, y) -> {
      System.out.println(x + y);
    });

    action((x, y) -> {
      System.out.println(x * y);
    });


    Person user = new Person();
    user.action2(
        (x,y) ->{
          int result = x+y;
          return result;
        }
    );

    user.action2((x,y)-> sum(x,y));

  }


}
