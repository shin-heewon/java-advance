package collectionEx.list;

import java.util.ArrayList;

public class MyQueue <T>{
  private ArrayList<T> queue = new ArrayList<T>();

  public void enqueue(T item){
    queue.add(item);
  }

  public T dequeue(){
    if(queue.isEmpty()){
      return null;
    }
    return queue.remove(0);
  }

  public boolean isEmpty(){//오버라이딩
    return queue.isEmpty();
  }

  public static void main(String[] args) {
    MyQueue<Integer> myQueue = new MyQueue<Integer>();
    myQueue.enqueue(1);
    myQueue.enqueue(2);
    myQueue.enqueue(3);
    myQueue.enqueue(4);
    myQueue.enqueue(5);

    System.out.println(myQueue.dequeue());
    System.out.println(myQueue.dequeue());
    System.out.println(myQueue.dequeue());
    System.out.println(myQueue.dequeue());
    System.out.println(myQueue.dequeue());
  }
}
