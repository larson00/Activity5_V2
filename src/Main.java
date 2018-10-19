import java.util.Date;

public class Main {

  public static void main(String[] args) {

    //  Write a static main method that creates two objects,
    // one with the default constructor and the other with the
    //  constructor with parameters. Give sample data for the parameters

    VehicleChassis myVc = new VehicleChassis();
    System.out.println(myVc.toString());
    myVc.setChassisType("Chassis1111");
    System.out.println(myVc.getChassisType());
    //System.out.println(myVc.toString());

    // Write a static main method that tests two scenarios:
    VehicleFrame myVf = new VehicleFrame();
    VehicleFrame myVf2 = new VehicleFrame("myVf1_frame");
    System.out.println(myVf2.toString());
    //myVf2.setChassisType("frame11111");
    //System.out.println(myVf2.getChassisType());


    // Write a static main method that tests two scenarios:
    // One that prints a generic set of strings, like:
    ManufacturedEngine myEn = new ManufacturedEngine();
    System.out.println(myEn.toString());
    // One that accepts call parameters and returns the following:
    ManufacturedEngine myEn2 = new ManufacturedEngine("Honda", new Date(),
        "H-Series", "H23A1", 4, "88 AKI", "2WD: Two-Wheel Drive");
    System.out.println(myEn2.toString());

    // Write a static main method that tests two scenarios
    InteriorFeature myIn = new InteriorFeature();
    // One that prints all fuel grade values, like:
    // Interior [Generic]
    System.out.println(myIn.toString());
    // Another like:
    // Interior [Climate Control]
    InteriorFeature myIn2 = new InteriorFeature("Climate Control");
    System.out.println(myIn2.toString());

    // Write a static main method that tests two scenarios:
    ExteriorFeature myEx = new ExteriorFeature();
    //One that prints all fuel grade values, like:
    //Exterior [Generic]
    System.out.println(myEx.toString());
    //Another like
    //Exterior [Fog Lamps]
    ExteriorFeature myEx2 = new ExteriorFeature("Fog Lamps");
    System.out.println(myEx2.toString());

    // Write a static main method that tests two scenarios:
    Vehicle myV = new Vehicle();
    // One that prints a generic set of strings, like:
    System.out.println(myV.toString());
    System.out.println(myV);
    // One that accepts call parameters and returns the following:

    Vehicle myV2 = new Vehicle(new Date(), "Honda", "Prelude", "Coupe",
        new VehicleChassis("Unibody"),
        "null", "type",
        new ManufacturedEngine("Honda", new Date(),
            "H-Series", "H23A1", 4, "88 AKI", "2WD: Two-Wheel Drive" ));
    System.out.println(myV2);
    System.out.println(myV2);




  }
}
