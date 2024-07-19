package board.dto;

import java.util.Date;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.Getter;

@Data
@AllArgsConstructor
public class Board {
  private Date bdate;
  private String bwriter;
  private int bno;
  private String btitle;
  private String bcontent;

  public Board(){};

}
