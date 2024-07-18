package stream_lambda.funcinterface;


/*
@FunctionalInterface
public interface Supplier<T>{
  T get();
}*/


import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.function.Supplier;

/*@FunctionalInterface
public interface Consumer<T>{
  void accept(T t);
  default Consumer<T> andThen(Consumer<? super T> after){//consumer 타입을 소비한 이후에 다시 consumer 받아서 처리해 줌?
    Object.requiredOnNull(after);
    return (T t)->{accept(t); after.accept(t);  }
}*/


public class FunctionInterfaceEx {

  public static void main(String[] args) {
    Supplier<String> supplier = () -> "Hello Supplier!";//매개변수 없이 결과값만을 리턴해주는 함수형 인터페이스 supplier
    System.out.println(supplier.get());

    System.out.println("\n==========================\n");

    Consumer<String> consumer = (str -> System.out.println(str.split(" ")[0]));//스페이스바로 split 후 인덱스 0번째 출력
    consumer.andThen(System.out::println).accept("Hello ssg.com");//"Hello" 출력 후에 두번째 제공한 "ssg.com"을 처리해서 출력해줌

    System.out.println("\n==========================\n");

    Function<String, Integer> function = String::length;//T 처리후 결과값을 R로 반환
    System.out.println(function.apply("Hello Function Interface!"));

    System.out.println("\n==========================\n");

    Predicate<String> predicate = (str -> str.equals("Hello predicate"));//T를 받아서 처리 후 test()메소드의 결과로 boolean값 리턴해 줌
    System.out.println(predicate.test("pretty"));//false,,str에 pretty 할당됨, 따라서 Hello predicate 와 다르므로 false
  }

}
