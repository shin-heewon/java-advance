package threadEx;

import collectionEx.board.Board;
import java.util.ArrayList;
import java.util.List;
import java.util.Vector;

public class VectorEx {

  public static void main(String[] args) {

    /*Vector 컬렉션 생성*/
    //List<Board> list = new ArrayList<>(); -> Vector는 한 번에 한 스레드식 스케줄링 되어 add메소드를 호출하기 때문에 lose 발생하지 않음!
    List<Board> list = new ArrayList<>();//A,B 두 스레드가 add를 동시에 호출하기 때문에 lose 발생함, 나머지는 coflict 발생되어 누락됨!!

    //작업 스레드 객체 생성하기
    Thread threadA = new Thread(){

      @Override
      public void run() {

        /*글(Board 한 개)을 10000개 추가하기*/
        for(int i=1; i<=1000; i++){
          list.add(new Board("제목"+i, "ssg"+i,"내용"+i));
        }

      }
    };//스레드 작업범위 end


    Thread threadB = new Thread(){

      @Override
      public void run() {

        /*글(Board 한 개)을 10000개 추가하기*/
        for(int i=1000; i<=2000; i++){
          list.add(new Board("제목"+i, "ssg"+i,"내용"+i));
        }

      }
    };//스레드 작업범위 end



    /*스레드 실행(작업 시작) -> start()를 통해서 각자의 공간 안에서 작업을 함*/
    //main 또한 하나의 스레드이다. A,B와 main까지 총 3개의 스레드가 동시에 작업 중이다.
    threadA.start();
    threadB.start();



    try {

      /*작업자 A,B 작업이 모두 종료 될때까지 main 작업자를 기다리게(main이 종료되지 않게) 한다.*/
      threadA.join();
      threadB.join();
    }catch (Exception e){

    }

    int size = list.size();
    System.out.println(size);
    for (Board board : list){
      System.out.println(board.getSubject());
    }
  }

}
