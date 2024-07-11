package collectionEx.list;

public class SingleLinkedList<T> {

  public Node<T> head = null;//start 포인터, 다음 공간에게 넘겨줄 나 자신의 객체 주소값을 담고있음

  /*inner class*/
  public class Node<T>{
    T data;
    Node<T> next = null;

    public Node(T data){
      this.data = data;
    }
  }//end class

  public void addNode(T data){
    if(head == null){//첫 번쨰 노드 = start node, 처음 추가 된 노드, 비어있는 노드라면?
      head = new Node<T>(data);
    }else {
      Node<T> node = this.head;

      while (node.next != null){
        node = node.next;
      }
      node.next = new Node<T>(data);
    }
  }

  public void printAll(){

    if(head != null){//가져올 객체가 있다면
      Node<T> node = this.head;
      System.out.println(node.data);
      while (node.next != null){//node가 더 있다면?
        node = node.next;
        System.out.println(node.data);
      }
    }
  }


  public Node<T> search(T data){//찾고자하는 data를 파라미터로 넘겨줌
    if(this.head ==  null){
      return null;
    }else{
      Node<T> node = this.head;//시작점 할당
      while (node != null){
        if(node.data == data){//파라미터로 넘겨받은 data를 들고 있다면
          return node;
        }else{
          node = node.next;
        }
      }
    }
    return null;
  }

  /*중간에 삽입하는 메소드*/
  public void addNodeInside(T data, T isData){//파라미터로 새로 넣을 데이터와 기존 데이터 넘겨받음(기존 데이터 다음에 집어넣기)
    Node<T> searchedNode = this.search(isData);//기준 노드

    if (searchedNode == null){
      this.addNode(data);
    }else{
      Node<T> nextnode = searchedNode.next;//원래 기준노드의 다음 노드 값**
      searchedNode.next = new Node<T>(data);//다음 노드에 새로 넣을 값 넣어줌.
      searchedNode.next.next = nextnode;//다음다음 노드에는 **에서 저장해놓은 값을 재할당 해준다.

    }

  }


  /*삭제하는 메소드*/
  /*public boolean delNode(T isData){
    if(this.head == null){
      return false;
    }else{
      Node<T> node = this.head.next;
      if(node.data == isData){
        this.head = this.head.next;//헤드 다음의 값을 헤드로 만들어줌.
        return true;
      }else{
        while (node.next != null){
          if(node.next.data == isData){
            node.next = node.next.next;
            return true;
          }
          node = node.next;
        }
        return false;
      }
    }
  }*/
  public boolean delNode(T isData) {
    if (this.head == null) {
      return false;
    } else {
      Node<T> node = this.head;
      if (node.data == isData) {
        this.head = this.head.next;
        return true;
      } else {
        while (node.next != null) {
          if (node.next.data == isData) {
            node.next = node.next.next;
            return true;
          }
          node = node.next;

        }
        return false;
      }
    }
  }

/*  public boolean delNode2(T isData){
    if(this.head == null){
      return false;
    }else{
      Node<T> node = this.head.next;
      if(head.data == isData){
        head = node;
        return true;
      }

      if(node.data == isData){
        //this.head = this.head.next;//헤드 다음의 값을 헤드로 만들어줌.
        this.head.next = node.next;
        return true;
      }else{
        while (node.next != null){
          if(node.next.data == isData){
            node.next = node.next.next;
            return true;
          }
          node = node.next;
        }
        return false;
      }
    }
  }*/


}
