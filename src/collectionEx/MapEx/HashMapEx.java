package collectionEx.MapEx;

import java.security.KeyStore;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;


public class HashMapEx {

  public static void main(String[] args) {
    Map<Integer, String> map = new HashMap<Integer, String >();

    map.put(1, "김미란");
    map.put(2, "이미란");
    map.put(3, "박미란");
    map.put(4, "고미란");
    map.put(5, "신미란");
    map.put(5, "신미란");//키 값이 중복이기 때문에 put 되지 않음
    map.put(6, "신미란");
    System.out.println(map.size());
    System.out.println("======================");

    /*키를 이용하여 값을 가져오기*/
    Integer key = 1;
    String value = map.get(key);
    System.out.println(value);

    /*key set 컬렉션을 이용하여 반복자를 통해 키와 값을 가져오기*/

    Set<Integer> keyset = map.keySet();//열쇠 주머니 생성
    Iterator<Integer> keyIterator = keyset.iterator();
    while (keyIterator.hasNext()){
      Integer key1 = keyIterator.next();
      String value1 = map.get(key1);
      System.out.printf("key-value : %d-%s\n", key1, value1);
    }


    /*엔트리 set 컬렉션으로 반복해서 키와 값을 가져오기*/
  /*  Set <Entry<Integer,String>> entrySet = map.entrySet();
    Iterator<Entry<Integer,String>> entryIterator = entrySet.iterator();
    while (entryIterator.hasNext()){
      Entry<Integer, String> entry = entryIterator.next();
      Integer key2 = entry.getKey();
      String value2 = entry.getValue();
      System.out.printf("key-value : %d-%s\n", key2, value2);

    }*/
    Set<Entry<Integer,String>> entrySet = map.entrySet();
    Iterator<Entry<Integer,String>> entryIterator = entrySet.iterator();
    while(entryIterator.hasNext()){
      Entry<Integer,String> entry = entryIterator.next();
      Integer key2 = entry.getKey();
      String value2 = entry.getValue();
      System.out.println("key :" + key2 + "\t" + "value : " + value2);
    }

    map.remove(1);
    map.remove(2, "이미란");


  }

}
