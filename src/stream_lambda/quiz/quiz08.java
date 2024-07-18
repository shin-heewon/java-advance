package stream_lambda.quiz;

interface Hello{
  String sayHello();
}

public class quiz08 {

  public static void main(String[] args) {

    Hello hello = ()->"Hello";
    System.out.println(hello.sayHello());
  }

}
