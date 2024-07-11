package tree;

public class BinaryTreeEx {

  public static void main(String[] args) {

    NodeMgmt myTree = new NodeMgmt();
    myTree.insertNode(2);
    myTree.insertNode(3);
    myTree.insertNode(4);
    myTree.insertNode(5);

    System.out.println("head : "+myTree.head.value);//2

    System.out.println("head right: "+myTree.head.right.value);//3

    System.out.println("head right right : "+myTree.head.right.right.value);//4
    System.out.println("head right right right : "+myTree.head.right.right.right.value);//5
  }

}
