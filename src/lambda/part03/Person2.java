package lambda.part03;

/**/
public class Person2 {
  public Member getMember1(CreateIdMember creatable){
    String id = "ssg-manager";
    Member member = creatable.create(id);

    return member;
  }

  public Member getMember2(CreateIdAndNameMember creatable){
    String id = "ssg-manager";
    String name = "이어진";

    Member member = creatable.create(id, name);
    return member;
  }

}
