package tree;

/*노드 클래스*/
public class NodeMgmt {

  Node head = null;//시작 root를 가르키는 변수 선언

  public class Node{
    Node left;
    Node right;
    int value;
    public Node(int data){
      this.value=data;
      this.left=null;
      this.right=null;
    }
  }//이너 노드 클래스


  /*insert 메소드*/
public boolean insertNode(int data){
  /*Case1 : 노드가 하나도 없을 때*/
  if(this.head == null){
    this.head = new Node(data);//첫 번째 노드 생성하여 값 넣어줌

  }else{/*Case2 : 노드가 하나 이상 있을 때*/
    Node findNode = this.head;
    while (true){

      /*Case2-1 : 현재 Node의 왼쪽에 Node가 들어가야 할 때(집어넣으려는 값이 현재 노드가 갖고 있는 값보다 작을 경우)*/
      if(data < findNode.value){
        if(findNode.left != null){
          findNode = findNode.left;
        }else{
          findNode.left = new Node(data);
          break;
        }

      }else{/*Case2-2 : 현재 노드의 오른쪽에 Node가 들어가야 할 때*/
       if(findNode.right != null){
         findNode = findNode.right;
       }else {
         findNode.right = new Node(data);
         break;
       }

      }
    }

  }



  return true;
}

}
