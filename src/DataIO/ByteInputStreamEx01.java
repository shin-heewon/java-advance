package DataIO;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;

public class ByteInputStreamEx01 {

  public static void main(String[] args){

    try {
      InputStream inputStream = new FileInputStream("C:/Temp/test.txt");//지정한 경로에 파일이 없으면 생성, 있으면 파일 업데이트 됨
      InputStream inputStream2 = new FileInputStream("C:/Temp/test2.txt");

      byte[] dataBytes = new byte[1024];//읽어들인 바이트를 담아 놓을 공간 미리 준비해놓기

      while(true){
        int data = inputStream.read(dataBytes);//읽어들이면 생성한 바이트 배열에 쌓임
        if(data== -1)break;//읽어들일 파일의 끝에 도달하면 -1 반환됨

        for(int i=0; i< data; i++){

          System.out.println(dataBytes[i]);
        }

      }
      inputStream.close();
    } catch (FileNotFoundException e) {
      System.err.println("해당 경로에 파일이 존재하지 않습니다.");
    }catch (IOException e) {
      e.printStackTrace();
    }

  }

}
