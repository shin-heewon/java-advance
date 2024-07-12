package compare;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class BookComparatorEx {

  public static void main(String[] args) {
    ArrayList<Book2> booklist = new ArrayList<Book2>();

    booklist.add(new Book2("세이노의 가르침", "세이토", "화이트혁명", 2001));
    booklist.add(new Book2("호모데우스", "유발 하라리", "민음사", 2004));
    booklist.add(new Book2("호모데우스", "유발 하라리", "민음사", 2004));
    booklist.add(new Book2("불안", "알랭 드 보통", "은행나무", 1999));
    booklist.add(new Book2("코스모스", "칼세이건", "사이언스북", 2007));
    booklist.add(new Book2("코스모스", "칼세이건", "사이언스북", 2007));
    booklist.add(new Book2("동물농장", "조지오웰", "민음사", 1989));
    booklist.add(new Book2("정의란 무엇인가", "마이클샌델", "와이즈베리", 2000));
    booklist.add(new Book2("정의란 무엇인가", "마이클샌델", "와이즈베리", 2008));
    booklist.add(new Book2("사피엔스", "유발 하라리", "김영사", 2010));
    booklist.add(new Book2("역사의 쓸모", "최태성", "다산북스", 2020));
    booklist.add(new Book2("역사의 쓸모", "최태성", "다산북스", 2020));


    //Q1. subject 내림차순 정렬
    Collections.sort(booklist, new DescSubject());

    for (int i=0; i< booklist.size(); i++){
      System.out.println(booklist.get(i).getYear()+" "+ booklist.get(i).getSubject());
    }

    System.out.println("===================년도 기준 내림차순======================");

    //Q2. DescYear 비교기 만들어서 출판년도를 기준으로 내림차순 정렬
    Collections.sort(booklist, new DescYear().reversed());
    for (int i=0; i< booklist.size(); i++){
      System.out.println(booklist.get(i).getYear()+" "+ booklist.get(i).getSubject());
    }

    System.out.println("===================년도 기준 오름차순======================");
    Collections.sort(booklist, new DescYear());
    for (int i=0; i< booklist.size(); i++){
      System.out.println(booklist.get(i).getYear()+" "+ booklist.get(i).getSubject());
    }

    System.out.println("\n======클래스 따로 만들지 않고 내림차순용 comparator 바로 생성해서 꼽아 사용하기==================");

    Comparator<Book2> myComparator = new Comparator<Book2>() {
      @Override
      public int compare(Book2 o1, Book2 o2) {
        return (o1.getYear()-o2.getYear())*(-1);
      }
    };

    Collections.sort(booklist, myComparator);
    for (int i=0; i< booklist.size(); i++){
      System.out.println(booklist.get(i).getYear()+" "+ booklist.get(i).getSubject());
    }

    System.out.println("\n==========================================================");

    //Q3. 기준1 - 출판년도 최신(내림차순) 기준2- 출판년도가 같다면 제목의 글자수로 내림차순 기준3-출판년도,글자수까지 같다면 제목 내림차순
    Collections.sort(booklist, new Comparator<Book2>() {//익명객체 -> 한 번 쓰고 버리는 경우에 이런 식으로 사용한다.
      @Override
      public int compare(Book2 o1, Book2 o2) {
        int result = (o1.getYear() - o2.getYear()) * (-1);

        if (result == 0) {
          result = (o1.getSubject().length() - o1.getSubject().length()) * (-1);

        }
        if (result == 0) {
          result = (o1.getSubject().compareTo(o2.getSubject()));
        }
        return result;
      }
    });
    for (int i=0; i< booklist.size(); i++){
      System.out.println(booklist.get(i).getYear()+" "+ booklist.get(i).getSubject());
    }


  }

}
