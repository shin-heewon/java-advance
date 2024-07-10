package generic.genericmethodEx;

import generic.classEx.Doll;

public class GenericBoxEx {

  public static void main(String[] args) {
    Box<Integer> box1 = boxing(100);
    int value = box1.getType();
    System.out.println(value);


    //"포켓몬 포토카드" 박싱하여 포장해주세요.
    Box<String> box2 = boxing("포켓몬 포토카드");

    //상자에서 포켓몬 포토카드 꺼내주세요
    String poke = box2.getType();
    System.out.println(poke);

    //인형 "미미"를 포장해 주세요.
    //box1 = boxing(new Doll());
    Box<Doll> box3 = boxing(new Doll());
    String dollName = box3.getType().name;
    System.out.println(dollName);

  }//end main

  public static <T> Box <T> boxing(T t){
    Box<T> box = new Box<>();

    box.setType(t);
    return box;
  }

}
