package board.dao;

import static board.BoardExample.mainMenu;
import static board.BoardExample.read_subMenu;
import static board.BoardExample.subMenu;

import board.BoardExample;
import board.dto.Board;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Scanner;

public class BoardDAO {

  static Connection con = null;
  static ResultSet rs = null;
  static Scanner sc = new Scanner(System.in);
  BoardExample be = new BoardExample();

  public static void list() throws SQLException {
    System.out.println();
    System.out.println("[게시물 목록]");
    System.out.println("---------------------------------------------------");
    System.out.println("no\t\t\twriter\t\t\tdate\t\t\t\t\ttitle");
    System.out.println("---------------------------------------------------");

    String query = "SELECT bno, bwriter, bdate, btitle FROM board ORDER BY bno DESC";

    try {
      con = ConnectionFactory.getInstance().open();
      PreparedStatement pstmt = con.prepareStatement(query);
      rs = pstmt.executeQuery();
      while (rs.next()) {
        Board board = new Board();
        board.setBno(rs.getInt(1));
        board.setBwriter(rs.getString(2));
        board.setBdate(rs.getDate(3));
        board.setBtitle(rs.getString(4));

        System.out.println(
            board.getBno() + "\t\t\t\t" + board.getBwriter() + "\t\t\t\t\t" + board.getBdate()
                + "\t\t\t\t\t\t\t\t\t" + board.getBtitle());

      }
      rs.close();
      pstmt.close();
    } catch (SQLException e) {
      e.printStackTrace();
    } finally {
      con.close();
    }
    mainMenu();
  }//end of list()



  public static void create() {

    Board board = new Board();
    System.out.println("[새 게시물 입력]");
    System.out.print("제목: ");
    board.setBtitle(sc.nextLine());
    System.out.print("내용: ");
    board.setBcontent(sc.nextLine());
    System.out.print("작성자: ");
    board.setBwriter(sc.nextLine());

    //보조메뉴
    if (subMenu().equals("1")) {

      try {
        con = ConnectionFactory.getInstance().open();
        String query = "INSERT INTO board (btitle, bcontent, bwriter) "
            + " values(?,?,?)";
        PreparedStatement pstmt = con.prepareStatement(query);
        pstmt.setString(1, board.getBtitle());
        pstmt.setString(2, board.getBcontent());
        pstmt.setString(3, board.getBwriter());

        pstmt.executeUpdate();

        list();
        pstmt.close();
      } catch (SQLException e) {
        throw new RuntimeException(e);
      }
    }else{
      mainMenu();
      return;
    }
  }//end of create()



  public void read() {

    System.out.println("[게시물 읽기]");
    System.out.print("bno: ");
    int bno = Integer.parseInt(sc.nextLine());
    System.out.println("#############");
    String query = "SELECT bno, btitle, bcontent, bwriter, bdate FROM board WHERE bno=?";
    try {
      con = ConnectionFactory.getInstance().open();
      PreparedStatement pstmt = con.prepareStatement(query);
      pstmt.setInt(1, bno);
      rs = pstmt.executeQuery();
      if (rs.next()) {
        Board board = new Board();
        board.setBno(rs.getInt("bno"));
        board.setBtitle(rs.getString(2));
        board.setBcontent(rs.getString(3));
        board.setBwriter(rs.getString(4));
        board.setBdate(rs.getDate(5));

        pstmt.close();
        con.close();

        System.out.println("번호: " + board.getBno());
        System.out.println("제목: " + board.getBtitle());
        System.out.println("내용: " + board.getBcontent());
        System.out.println("작성자: " + board.getBwriter());
        System.out.println("날짜: " + board.getBdate());

        int subMenu = Integer.parseInt(read_subMenu());

        switch (subMenu) {
          case 1 -> update(board);
          case 2 -> delete(board);
          case 3 -> list();
          default -> subMenu();
        }


      }

    } catch (SQLException e) {
      throw new RuntimeException(e);
    }

  }//end of read


  public void update(Board b) {
    System.out.println("[수정 내용 입력]");
    System.out.print("제목: ");
    b.setBtitle(sc.nextLine());
    System.out.print("내용: ");
    b.setBcontent(sc.nextLine());
    System.out.print("작성자: ");
    b.setBwriter(sc.nextLine());

    if (subMenu().equals("1")) {
      try {

        con = ConnectionFactory.getInstance().open();
        String query = "UPDATE board SET btitle=?, bcontent=?, bwriter=? WHERE bno=?";
        PreparedStatement pstmt = con.prepareStatement(query);
        pstmt.setString(1, b.getBtitle());
        pstmt.setString(2, b.getBcontent());
        pstmt.setString(3, b.getBwriter());
        pstmt.setInt(4, b.getBno());

        pstmt.executeUpdate();
        pstmt.close();

        list();
      } catch (Exception e) {
        e.printStackTrace();
      }

    } else {
      mainMenu();
      return;
    }

  }//end of update

  public static void delete(Board b) {
    try {
      con = ConnectionFactory.getInstance().open();
      String query = "DELETE FROM board WHERE bno=?";
      PreparedStatement pstmt = con.prepareStatement(query);
      pstmt.setInt(1, b.getBno());
      pstmt.executeUpdate();
      pstmt.close();
      list();
    } catch (SQLException e) {
      throw new RuntimeException(e);
    }
  }//end of delete

  public void clear() {
    System.out.println("[게시물 전체 삭제]");
    System.out.println("---------------------------------------------------");
    if (subMenu().equals("1")) {
      try {
        con = ConnectionFactory.getInstance().open();
        String query = "TRUNCATE TABLE board";
        PreparedStatement pstmt = con.prepareStatement(query);
        pstmt.executeUpdate();
        pstmt.close();
        list();
      } catch (SQLException e) {
        throw new RuntimeException(e);

      }
    }else{
      mainMenu();
      return;
    }
  }//end of clear

  public void exit() {
    if (con != null) {
      try {
        con.close();
      } catch (SQLException e) {
        throw new RuntimeException(e);
      }
      System.out.println("** 게시판 종료 **");
      System.exit(0);
    }

  }


}
