package board;

import board.service.BoardServiceImpl;
import board.service.BoardServiceInterface;
import java.util.Scanner;

public class BoardExample {

  public static void main(String[] args) throws Exception {

    BoardServiceInterface b = new BoardServiceImpl();
    b.list();

  }

}
