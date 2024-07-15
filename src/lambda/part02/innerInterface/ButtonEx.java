package lambda.part02.innerInterface;

public class ButtonEx {

  public static void main(String[] args) {

    Button okbtn = new Button();

    class okListener implements Button.ClickListener{

      @Override
      public void onClick() {
        System.out.println("ok버튼 클릭!");
      }
    }


    class cancelButton implements Button.ClickListener{

      @Override
      public void onClick() {
        System.out.println("취소 버튼 클릭");
      }
    }

    okbtn.setClickListener(new okListener());
    okbtn.click();


    /*
    * 1. Cancel 버튼 생성
    * 2. Cancel 버튼 클릭 이벤트를 처리할 ClickListener 클래스 구현
    * 3. 구현 클래스 setting
    * 4. Cancel버튼 클릭
    * */
    Button cancelBtn = new Button();
    cancelBtn.setClickListener(new cancelButton());
    cancelBtn.click();
  }

}
