package board;

import board.service.BoardServiceImpl;
import java.util.Scanner;

public class BoardExample extends BoardServiceImpl {

  public static void main(String[] args) throws Exception {

    BoardExample be = new BoardExample();
    be.list();

  }

}
