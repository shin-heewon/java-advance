package board.service;

import java.util.Scanner;

public class MenuPrintImpl implements MenuPrintInterface {


  @Override
  public void mainMenu() {
    System.out.println();
    System.out.println("---------------------------------------------------");
    System.out.println("메인 메뉴: 1.Create | 2.Read | 3.Clear | 4.Exit");
    System.out.print("메뉴 선택:");

    Scanner sc = new Scanner(System.in);
    int selectedMenu = sc.nextInt();
    sc.nextLine();
    BoardServiceImpl service = new BoardServiceImpl();
    switch (selectedMenu) {
      case 1 -> service.create();
      case 2 -> service.read();
      case 3 -> service.clear();
      case 4 -> service.exit();
      default -> {
        System.out.println("잘못 입력하셨습니다. 다시 입력해주세요.");
        mainMenu();
      }
    }
  }//end of mainMenu


  @Override
  public String subMenu() {
    Scanner sc = new Scanner(System.in);
    System.out.println("---------------------------------------------------");
    System.out.println("보조메뉴: 1.Ok | 2.Cancel");
    System.out.print("메뉴 선택: ");
    String subMenu = sc.nextLine();
    return subMenu;

  }//end of subMenu

  @Override
  public String read_subMenu() {
    Scanner sc = new Scanner(System.in);
    System.out.println("---------------------------------------------------");
    System.out.println("보조메뉴: 1.Update | 2.Delete | 3. List");
    System.out.print("메뉴 선택: ");
    String subMenu = sc.nextLine();
    return subMenu;

  }//end of read_subMenu

}
