package DataIO;

import java.io.BufferedReader;
import java.io.*;
import java.io.FileReader;
import java.io.IOException;
import java.nio.charset.Charset;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.stream.Stream;


/*최근에 가장 많이 쓰는 방식! 반복문 등을 제거하여 코드 가독성이 좋음*/
public class FileReaderEx02 {

  public static void main(String[] args) throws IOException {

    //Path path = Path.of("C:/Temp/data.txt");
    /*방법1*/
    Path path = Paths.get("C:/Temp/data.txt");
    Stream<String> stream;

    stream = Files.lines(path, Charset.defaultCharset());//경로, utf-8인코딩 지정
    stream.forEach(System.out::println);

    System.out.println("===============================");
    /*방법2*/
    File file = path.toFile();
    FileReader fr = new FileReader(file);
    BufferedReader br = new BufferedReader(fr);//파일을 파일리더기에 넘기고 성능 향상을 위해 버퍼리더에 한 번 더 끼움?
    stream = br.lines();
    stream.forEach(System.out::println);

    stream.close();


  }

}
