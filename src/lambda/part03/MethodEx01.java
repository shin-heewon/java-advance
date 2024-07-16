package lambda.part03;

public class MethodEx01 {

  public static void main(String[] args) {
    Person1 user = new Person1();
    user.ordering(String::compareToIgnoreCase);//Comparable이 인터페이스여야 사용 가능
    user.ordering((name2, name1)->name1.compareToIgnoreCase(name2));
  }


}

//사람의 이름 비교하가ㅣ 위해 String ㅋ를래스의 인스턴스 메소드 compareToIgnoreCase()메소드를 참조하여 사용
//메소드 참조
//name1이 name2보다 사전순으로 먼저이면 음수 리턴, 동일하면 0, name2가 더 나중이면 양수 리턴