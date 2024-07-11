package collectionEx.list;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

/*ArrayList와 LinkedList객체 추가할 때 성능 비교하기*/
public class DiffEx {

  public static void main(String[] args) {

    List<String> list1 = new ArrayList<>();
    List<String> list2 = new LinkedList<>();

    //시작 시간과 끝 시간을 저장할 변수 선언
    long startTime;
    long endTime;

    startTime = System.nanoTime();
    for (int i=0; i<10000; i++){
      list1.add(0, String.valueOf(i));
    }
    endTime = System.nanoTime();
    System.out.printf("%-15s %8s ns \n", "ArrayList 걸린 시간 : ", (endTime - startTime));//걸린 시간 계산하여 출력

    System.out.println("========================================================================");

    startTime = System.nanoTime();
    for (int i=0; i<10000; i++){
      list2.add(0, String.valueOf(i));
    }
    endTime = System.nanoTime();
    System.out.printf("%-15s %8s ns \n", "LinkedList 걸린 시간 : ", (endTime - startTime));//걸린 시간 계산하여 출력

  }




}
