package lambda.quiz;



import java.util.function.BiFunction;
import java.util.function.Function;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Data
class Color {
  private int a;
  private int b;
  private int c;


  public Color(int a, int b, int c) {
    this.a = a;
    this.b = b;
    this.c = c;
  }

}



public class ColorEx {

  public static void main(String[] args) {

    BiFunction<Integer, Integer, Function<Integer, Color>> colorConstructor = (a,b)->c-> new Color(a,b,c);

    Color color = colorConstructor.apply(255,255).apply(64);

    System.out.println("red = "+color.getA());
    System.out.println("blue = "+color.getB());
    System.out.println("green = "+color.getC());


  }

}
