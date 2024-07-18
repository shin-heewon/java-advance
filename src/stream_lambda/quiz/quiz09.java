package stream_lambda.quiz;

import java.util.Random;

@FunctionalInterface
interface RandomInterface {

  Random getRandom();
}

public class quiz09 {

  public static void main(String[] args) {

    RandomInterface randomInterface = () -> {
      Random rand = new Random();
      return rand;
    };

  }

}
