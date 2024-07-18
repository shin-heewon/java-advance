package DataIO;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;

public class CopyImageEx {

  public static void main(String[] args) throws IOException {

    String originalFileName = "C:/Temp/bingbong.jpg";
    String targetFileName = "C:/Temp/bingbong_copy2.jpg";

    InputStream is = new FileInputStream(originalFileName);
    OutputStream os = new FileOutputStream(targetFileName);//해당 경로를 읽어들여서 파일을 처리

   /* //is에서 읽고 -> os에 쓰기
    byte[] buffer = new byte[1024];

    while (true){
      //읽으면서 쓰기
      int data = is.read(buffer);//읽어서 buffer에 저장하겠다~
      if(data == -1)break;// 다 읽으면

      os.write(buffer, 0, data);//읽은 바이트 수만큼 쓰겠다~
    }*/
    is.transferTo(os);//자바 9부터 지원, 입력 스트림에서 출력스트림으로 복사
    os.flush();
    os.close();
    is.close();
    System.out.println("copy complete!");


  }

}
