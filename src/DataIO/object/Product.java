package DataIO.object;


import java.io.Serializable;
import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class Product implements Serializable {
  private static final long serialVersionUID = 1L;

  private String pid;
  private String pname;

}
