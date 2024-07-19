package board.service;

public interface BoardServiceInterface {

  public void list();
  public void create();
  public void read();

  public void update(board.dto.Board b);

  public void delete(board.dto.Board b);
  public void clear();
  public void exit();



}
