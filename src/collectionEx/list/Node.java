package collectionEx.list;

public class Node <T>{
  T data;// T타입의 데이터 공간 선언
  Node<T> next  = null;//다음 노드의 값 저장, 즉 포인터 선언

  public Node(T data){
    this.data = data;
  }
}
