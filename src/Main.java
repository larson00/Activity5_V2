public class Main {

  public static void main(String[] args) {

    //• Write a static main method that creates two objects,
    // one with the default constructor and the other with the
    //  constructor with parameters. Give sample data for the parameters

    VehicleChassis myVc = new VehicleChassis();
    System.out.println(myVc.toString());
    myVc.setChassisType("Chasssis");
    System.out.println(myVc.getChassisType());
    System.out.println(myVc.toString());

    VehicleChassis myVc2 = new VehicleChassis( "eeee");

  }
}
