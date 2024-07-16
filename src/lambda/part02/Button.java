package lambda.part02;

public class Button {

  /*함수형 인터페이스 정의*/
  @FunctionalInterface
  public static interface ClickListener{

    void onClick();
  }

  private ClickListener clickListener;

  /*ClickListener를 동작시킬 메소드*/
  public void setClickListener(ClickListener clickListener){
    this.clickListener = clickListener;//클릭 행위에 대한 모니터링 역할?
  }


  public void click(){
    this.clickListener.onClick();

  }

}
