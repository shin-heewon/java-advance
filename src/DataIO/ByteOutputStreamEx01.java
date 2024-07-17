package DataIO;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;

public class ByteOutputStreamEx01 {

  public static void main(String[] args) throws IOException {

    OutputStream outputStream = new FileOutputStream("C:/Temp/test.txt");//지정한 경로에 파일이 없으면 생성, 있으면 파일 업데이트 됨
    OutputStream outputStream2 = new FileOutputStream("C:/Temp/test2.txt");
    byte a = 10;
    byte b = 20;
    byte c = 30;
    outputStream.write(a);//버퍼가 꽉 차면 순서대로 채워줌
    outputStream.write(b);
    outputStream.write(c);
    outputStream.flush();//내부 버퍼는 항상 사용 후 비워주기
    outputStream.close();


    byte[] bytes = {10,20 ,30};
    outputStream2.write(bytes, 1, 2);//20부터 30까지 입력됨(byte값이라 사람이 읽을 수는 없음)
    outputStream2.flush();
    outputStream2.close();



  }

}
