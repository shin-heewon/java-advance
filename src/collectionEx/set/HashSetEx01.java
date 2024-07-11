package collectionEx.set;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class HashSetEx01 {

  public static void main(String[] args) {
    //HashSet 컬렉션 생성
    Set<String> set = new HashSet<>();

    //객체 저장
    set.add("신세계");
    set.add("신세계");
    set.add("신세계2");
    System.out.println(set.size());//같은거 또 넣으면 중복이라 안 들어감

    System.out.println("=============================");

    Set<Member> memberList = new HashSet<Member>();

    memberList.add(new Member("ssg", 20));
    memberList.add(new Member("ksg", 20));
    memberList.add(new Member("asg", 20));
    memberList.add(new Member("msg", 20));

    //회원을 반복자 Iterator를 이용해서 가져오기
    Iterator<Member> iterator = memberList.iterator();
    while (iterator.hasNext()){
      //회원 한 명 가져오기(fetch해오기)
      Member member = iterator.next();//참고로 꺼내오는 순서는 따로 없다!
      System.out.println(member.name + "\t"+member.age);
      if(member.name.equals("ksg")){
        iterator.remove();
      }
    }

    System.out.println("=======member.name = 'ssg'인 객체 삭제하기");
    Iterator<Member> iterator2 = memberList.iterator();
    //memberList.remove();
    //객체 삭제를 위해서는 새로운 Iterator를 선언해서 사용해야 한다. Iterator1 재활용은 불가능하다.
    //for나 while과 같은 반복문을 이용하지 않고 객체 바로 삭제는 불가능하다!

    while (iterator2.hasNext()){
      Member member2 = iterator2.next();//참고로 꺼내오는 순서는 따로 없다!
      if(member2.name.equals("ssg")){
        //iterator2.remove();// 인터페이스 Iterator의 remove 사용
        memberList.remove(member2);// hashSet객체의 remove 사용
      }
      System.out.println(member2.name + "\t"+member2.age);
    }

    System.out.println("==================================");

    //회원은 enhanced for를 이용하여 가져오기
    for (Member mem : memberList){
      System.out.println(mem.name + "\t"+mem.age);
      //if(mem.name.equals("msg")) memberList.remove(mem);//Iterator 사용하지 않고 실제 memberList객체에 있는 객체를 삭제
    }


    memberList.add(new Member("ASG", 20));
    memberList.add(new Member("ASG", 20));
    //Member클래스에서 equals메소드 오버라이딩 해주지 않으면 37번줄의 코드도 새로운 객체로 인식하여 add 된다.
    System.out.println(memberList.size());


  }

}
