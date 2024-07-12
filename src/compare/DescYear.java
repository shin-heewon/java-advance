package compare;

import java.util.Comparator;

public class DescYear implements Comparator<Book2> {

  @Override
  public int compare(Book2 o1, Book2 o2) {
    return o1.getYear()-o2.getYear();
  }

  @Override
  public Comparator<Book2> reversed() {
    return Comparator.super.reversed();
  }
}
