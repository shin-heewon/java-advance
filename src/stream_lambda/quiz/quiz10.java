package stream_lambda.quiz;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;

public class quiz10 {

  public static void main(String[] args) {
    try {
      FileInputStream fi = new FileInputStream("C:/Temp/data.txt");
      BufferedReader br = new BufferedReader(new InputStreamReader(fi));
      String line;
      while((line = br.readLine()) != null){

        System.out.println(line);
      }

      br.close();
      fi.close();

    } catch (IOException e) {
      throw new RuntimeException(e);
    }
  }

}
