package lambda.part03;

public class ConstructorMemberEx {


  /*함수형 인터페이스의 매개변수 개수에 따라 실행되는 Member 생성자가 다르다.*/
  public static void main(String[] args) {
    Person2 user = new Person2();

    Member m1 = user.getMember1(Member :: new);
    System.out.println(m1);

    Member m2 = user.getMember2(Member :: new);
    System.out.println(m2);
  }

}
