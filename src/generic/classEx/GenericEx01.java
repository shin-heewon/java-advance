package generic.classEx;

public class GenericEx01 {

  public static void main(String[] args) {
    Box<String> box = new Box();// new 옆의 제네릭은 생략 가능함
    box.content ="러브레터";
    //System.out.println((Doll)box.content);
    String content = box.content;//옮겨 담기

    Box<Integer>  box1 = new Box<Integer>();
    box1.content = 100;//Integer 객체로 박싱된 것을 box1에 담음
    int content1 = box1.content;//꺼내서 content1에 담기


    Product<SmartPhone, String> p1 = new Product<SmartPhone, String>();
    p1.setKind(new SmartPhone());
    p1.setModel("애플15pro");

    SmartPhone applePhone = p1.getKind();
    String model = p1.getModel();
    System.out.println(applePhone+" "+model);


    Product<Car, String> p2 = new Product<Car, String>();
    p2.setKind(new Car());
    p2.setModel("카니발");
    Car car = p2.getKind();
    String carModel = p2.getModel();
    System.out.println(car+" "+carModel);

  }

}
