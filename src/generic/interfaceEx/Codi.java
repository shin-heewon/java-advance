package generic.interfaceEx;

public class Codi implements Rentable<AirConditionMachine>{//코디를 통해서 렌트할 수 있도록 함


  @Override
  public AirConditionMachine rent() {
    return new AirConditionMachine();
  }
}
