package lambda.part02;

public class ButtonEx {

  public static void main(String[] args) {

    Button btn = new Button();

    btn.setClickListener(//람다식을 통해 setClickListener()메소드의 매개변수로 넘어감
        ()->{
          System.out.println("버튼이 클릭되었습니다.");
        }
    );


    Button cancleBtn = new Button();
    //Button이라는 하나의 클래스를 통해 구현부를 다르게 구현하여 원하는 방식대로 바로바로 바꿔서 사용 가능하다!!!
    cancleBtn.setClickListener(
        ()->{
          System.out.println("Cancle 버튼이 클릭 되었습니다.");
        }

    );

    btn.click();//사용자가 버튼을 클릭할 때마다 메소드 실행되어 "버튼이 클릭되었습니다." 출력됨!
    cancleBtn.click();

  }


}
