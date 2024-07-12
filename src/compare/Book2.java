package compare;


import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
/*Book VO : 데이터 객체*/
public class Book2{
  private String subject;
  private String writer;
  private String publisher;
  private int year;//출판년도


}

