package collectionEx.board;

import java.util.ArrayList;
import java.util.List;

public class BoardEx {

  public static void main(String[] args) {

    List<Board> boardList = new ArrayList<Board>();//게시글 하나를 의미하는 Board 타입의 객체를 list에 보관 가능함,
    // List타입으로 변수를 선언하여 업캐스팅=>나중에 캐스팅을 통해 다양한 타입의 list를 변수 재활용 가능


    boardList.add(new Board("맛있는 점심1", "서유미1", "수업이 안 끝나요.....1"));
    boardList.add(new Board("맛있는 점심2", "서유미2", "수업이 안 끝나요.....2"));
    boardList.add(new Board("맛있는 점심3", "서유미3", "수업이 안 끝나요.....3"));
    boardList.add(new Board("맛있는 점심4", "서유미4", "수업이 안 끝나요.....4"));
    boardList.add(new Board("맛있는 점심5", "서유미5", "수업이 안 끝나요.....5"));

    int boarSize = boardList.size();

    System.out.println(boarSize);

    //특정 인덱스를 지정하여 객체 가져오기
    Board board = boardList.get(2);
    System.out.println(board.getSubject()+"\t"+board.getWriter()+"\t"+board.getContent());
    System.out.println("====================================================");
    for(int i=0; i<boardList.size(); i++){
      Board board1 = boardList.get(i);
      System.out.println(board1.getSubject()+"\t"+board1.getWriter()+"\t"+board1.getContent());
    }
    System.out.println("===================================================");

    for (Board b : boardList){
      System.out.println(b.getSubject()+"\t"+b.getWriter()+"\t"+b.getContent());
    }

    String dataset[] = {
        "Braund, Mr. Owen Harris",
        "Cumings, Mrs. John Bradley (Florence Briggs Thayer)",
        "Heikkinen, Miss. Laina",
        "Futrelle, Mrs. Jacques Heath (Lily May Peel)",
        "Allen, Mr. William Henry",
        "Moran, Mr. James",
        "McCarthy, Mr. Timothy J",
        "Palsson, Master. Gosta Leonard",
        "Johnson, Mrs. Oscar W (Elisabeth Vilhelmina Berg)",
        "Nasser, Mrs. Nicholas (Adele Achem)",
        "Sandstrom, Miss. Marguerite Rut",
        "Bonnell, Miss. Elizabeth",
        "Saundercock, Mr. William Henry",
        "Andersson, Mr. Anders Johan",
        "Vestrom, Miss. Hulda Amanda Adolfina",
        "Hewlett, Mrs. (Mary D Kingcome) ",
        "Rice, Master. Eugene",
        "Williams, Mr. Charles Eugene",
        "Vander Planke, Mrs. Julius (Emelia Maria Vandemoortele)",
        "Masselmani, Mrs. Fatima",
        "Fynney, Mr. Joseph J",
        "Beesley, Mr. Lawrence",
        "McGowan, Miss. Anna",
        "Sloper, Mr. William Thompson",
        "Palsson, Miss. Torborg Danira",
        "Asplund, Mrs. Carl Oscar (Selma Augusta Emilia Johansson)",
        "Emir, Mr. Farred Chehab",
        "Fortune, Mr. Charles Alexander",
        "Dwyer, Miss. Ellen",
        "Todoroff, Mr. Lalio"
    };
    int count = 0;
    for(String s : dataset){
      if(s.contains("M")){
        count++;
      }
    }
    System.out.println(count);

    Integer c = 0;
    for(String s : dataset){
      if(s.indexOf("M")>-1){
        c++;
      }
    }
    System.out.println(c);

  }

}
