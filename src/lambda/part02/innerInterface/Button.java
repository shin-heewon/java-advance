package lambda.part02.innerInterface;

public class Button {

  public static interface ClickListener{//public이라 Button 타입으로 구현하여 직접 호출 가능함
    void onClick();
  }


  private ClickListener clickListener;

  public void setClickListener(ClickListener clickListener){//필드 인젝션 혹은 세터 인젝션 : setter 메서드를 이용하여 ClickListener 구현 객체를 injection
    this.clickListener = clickListener;
  }

//버튼이 클릭되었을 때 실행할 메소드
public void click(){
    this.clickListener.onClick();
}


}
