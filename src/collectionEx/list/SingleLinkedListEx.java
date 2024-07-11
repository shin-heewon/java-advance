package collectionEx.list;

public class SingleLinkedListEx {

  public static void main(String[] args) {

    Node<Integer> node1 = new Node<Integer>(1);
    Node<Integer> node2 = new Node<Integer>(2);

    node1.next = node2;//node1 뒤에 node2를 배치시키겠다, 연결시키겠다 는 의미
    Node<Integer> head = node1;

    SingleLinkedList<Integer> mylist = new SingleLinkedList<>();
    mylist.addNode(1);
    mylist.addNode(2);
    mylist.addNode(3);
    mylist.addNode(4);
    mylist.addNode(5);
    /*System.out.println(mylist.head.data);
    System.out.println(mylist.head.next.data);*/
    mylist.printAll();
    System.out.println("====================");

    //mylist.search(3);//head에는 첫번째 값인 data:1이 들어가 있음

    /*mylist.addNodeInside(5, 1);
    mylist.printAll();*/
    System.out.println("====================");
    mylist.delNode(3);
    mylist.printAll();


  }




}
