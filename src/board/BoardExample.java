package board;

import board.dao.BoardDAO;
import board.dto.Board;
import board.dao.ConnectionFactory;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Scanner;

public class BoardExample {

  static Scanner sc = new Scanner(System.in);
  static BoardDAO dao = new BoardDAO();

  public static void main(String[] args) throws Exception {


    dao.list();

  }





  public static void mainMenu() {
    System.out.println();
    System.out.println("---------------------------------------------------");
    System.out.println("메인 메뉴: 1.Create | 2.Read | 3.Clear | 4.Exit");
    System.out.print("메뉴 선택:");

    int selectedMenu = sc.nextInt();
    sc.nextLine();

    switch (selectedMenu) {
      case 1 -> dao.create();
      case 2 -> dao.read();
      case 3 -> dao.clear();
      case 4 -> dao.exit();
      default -> {System.out.println("잘못 입력하셨습니다. 다시 입력해주세요."); mainMenu();}
    }
  }//end of mainMenu



  public static String subMenu() {
    System.out.println("---------------------------------------------------");
    System.out.println("보조메뉴: 1.Ok | 2.Cancel");
    System.out.print("메뉴 선택: ");
    String subMenu = sc.nextLine();
    return subMenu;

  }//end of subMenu

  public static String read_subMenu() {
    System.out.println("---------------------------------------------------");
    System.out.println("보조메뉴: 1.Update | 2.Delete | 3. List");
    System.out.print("메뉴 선택: ");
    String subMenu = sc.nextLine();
    return subMenu;

  }//end of read_subMenu









}
