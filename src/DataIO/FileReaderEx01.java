package DataIO;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class FileReaderEx01 {

  public static void main(String[] args) {

    try {
      FileInputStream fi = new FileInputStream("C:/Temp/data.txt");
      BufferedReader br = new BufferedReader(new InputStreamReader(fi));
      String line;
      while((line = br.readLine()) != null){
        System.out.println(line);
        System.out.println(br.lines().peek(System. out::println).count());
      }

      br.close();
      fi.close();

    } catch (IOException e) {
      throw new RuntimeException(e);
    }


  }

}
