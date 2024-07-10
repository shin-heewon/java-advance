package collectionEx.board.list;

import java.util.LinkedList;
import java.util.Queue;

public class QueueEx {

  public static void main(String[] args) {

    Queue<Integer> queue_int = new LinkedList<Integer>();//Integer형 큐 생성
    queue_int.add(1);
    queue_int.offer(2);
    queue_int.offer(3);

    System.out.println(queue_int);

    queue_int.poll();//1 삭제,, 삭제된 객체의 개수 반환
    System.out.println(queue_int);

    queue_int.remove();//2삭제,,삭제 결과의 여부 true, false 반환 => 순서대로 삭제됨
    System.out.println(queue_int);

    boolean result = queue_int.remove(2);//2가 없어서 false가 return 됨
    System.out.println(result);

    Queue<String> queue_string = new LinkedList<String>();//String형 큐 생성


  }

}
