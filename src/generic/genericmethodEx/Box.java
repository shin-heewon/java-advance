package generic.genericmethodEx;

public class Box <T>{
  private T type;

  public T getType(){//제너릭 메소드 get
    return type;
  }

  public void setType(T type) {// 제너릭 메소드 set
    this.type = type;
  }
}
