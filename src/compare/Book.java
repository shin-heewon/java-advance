package compare;


import java.util.Date;
import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
/*Book VO : 데이터 객체*/
public class Book implements Comparable<Book>{
  private String subject;
  private String writer;
  private String publisher;
  private int year;//출판년도


  //3. 책 제목 기준으로 사전순으로 정렬을 하되, 만약 책 제목이 동일하다면 출판년도로 오름차순 정렬
  @Override
  public int compareTo(Book o) {
    int result = this.getSubject().compareTo(o.getSubject());
    if (result==0){
      result = this.getYear() - o.getYear();//숫자값으로 빼기 해서 리턴 가능
    }

    return result;
  }

  /*2. 책 제목 사전순 정렬*//*
  @Override
  public int compareTo(Book o) {
    int result = this.getSubject().compareTo(o.getSubject());

    return result;
  }*/


  /*  @Override//내부에서 비교 처리 후, 비교 결과를 int형으로 return해준다.
//1. 출판 년도를 기준으로 정렬하기
  public int compareTo(Book o) {

    if(this.year == o.year){
      return 0;
    }else if(this.year < o.year){
      return -1;//=>내림차순 음수 리턴,, -2 등의 숫자도 가능
    }else {
      return 1;//=> 양수 리턴
    }
  }*/





}

