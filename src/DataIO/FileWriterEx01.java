package DataIO;

import java.io.BufferedWriter;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStreamWriter;

public class FileWriterEx01 {

  public static void main(String[] args) {

    try {
      FileOutputStream fs = new FileOutputStream("C:/Temp/data.txt");
      BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(fs));//파일에 쓰겠다~
      bw.write("Hello java.io.Writer!!!");
      bw.newLine();//한 줄 띄우기
      bw.write("반가워 친하게 지내자^_^*");
      bw.close();
      fs.close();
    } catch (IOException e) {
      throw new RuntimeException(e);
    }


  }

}
