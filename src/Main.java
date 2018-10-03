import java.util.Date;

public class Main {

  public static void main(String[] args) {

    //• Write a static main method that creates two objects,
    // one with the default constructor and the other with the
    //  constructor with parameters. Give sample data for the parameters

    VehicleChassis myVc = new VehicleChassis();
    System.out.println(myVc.toString());
    myVc.setChassisType("Chassis1111");
    System.out.println(myVc.getChassisType());
    //System.out.println(myVc.toString());

    VehicleChassis myVc2 = new VehicleChassis("myVc2_Chassis");
    System.out.println(myVc2.toString());
    myVc2.setChassisType("Chassis2222");
    System.out.println(myVc2.getChassisType());
    //System.out.println(myVc2.toString());

    // Write a static main method that tests two scenarios:
    VehicleFrame myVf1 = new VehicleFrame("myVf1_frame");
    System.out.println(myVf1.toString());
    myVf1.setChassisType("frame11111");
    System.out.println(myVf1.getChassisType());
    //System.out.println(myVf1.toString());

    // Write a static main method that tests two scenarios:
    // One that prints a generic set of strings, like:
    ManufacturedEngine myEn = new ManufacturedEngine();
    System.out.println(myEn.toString());
    // One that accepts call parameters and returns the following:
    ManufacturedEngine myEn2 = new ManufacturedEngine("Honda", new Date(),
        "H-Series", "H23A1", 4, "88 AKI", "2WD: Two-Wheel Drive");
    System.out.println(myEn2.toString());


  }
}
