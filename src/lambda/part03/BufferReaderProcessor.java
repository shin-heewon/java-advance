package lambda.part03;

import java.io.BufferedReader;
import java.io.IOException;

public interface BufferReaderProcessor {
  
  String process(BufferedReader br) throws IOException;
  //버퍼리더는 외부에서 입력받는 것들을 처리해주기 때문에  예외가 날 가능성이 많아 반드시 예외 처리 해줘야 한다ㅏ

}
