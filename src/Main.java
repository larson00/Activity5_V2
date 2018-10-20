import java.util.Date;

public class Main {

  public static void main(String[] args) {
    testCar();
  }

  public static void testVehicleChassis() {
    // Creates two objects, one with the default constructor
    // and the other with the constructor with parameters.
    // Give sample data for the parameters.

    VehicleChassis myChassis = new VehicleChassis();
    System.out.println(myChassis.toString());

    VehicleChassis yourChassis = new VehicleChassis("cn");
    System.out.println(yourChassis.toString());
  }

  public static void testVehicleFrame() {
    // Step 4 Test
    VehicleFrame vf1 = new VehicleFrame();
    System.out.println(vf1);

    VehicleFrame vf2 = new VehicleFrame("Ladder Frame");
    System.out.println(vf2);
  }

  public static void testManufacturedEngine() {
    ManufacturedEngine me1 = new ManufacturedEngine();
    System.out.println(me1);

    ManufacturedEngine me2 =
        new ManufacturedEngine("Honda", new Date()
            , "H-Series", "H23A1"
            , "2WD: Two-Wheel Drive", 4
            , "88 AKI");
    System.out.println(me2);
  }

  public static void testFeatures() {
    InteriorFeature if1 = new InteriorFeature();
    System.out.println(if1);

    InteriorFeature if2 = new InteriorFeature("Climate Control");
    System.out.println(if2);

    ExteriorFeature ef1 = new ExteriorFeature();
    System.out.println(ef1);

    ExteriorFeature ef2 = new ExteriorFeature("Fog Lamps");
    System.out.println(ef2);

  }

  public static void testVehicle() {
    Vehicle v1 = new Vehicle();
    System.out.println(v1);

    Vehicle v2 = new Vehicle(new Date(), "Honda", "Prelude", "Coupe",
        new VehicleChassis("Unibody"),
        "null", "type",
        new ManufacturedEngine("Honda", new Date(), "H-series",
            "H23A1", "88 AKI", 4, "2WD: Two-Wheel Drive"));
    System.out.println(v2);
  }

  public static void testCar() {

    // Test default constructor and print instance attributes.
    Car c1 = new Car();
    System.out.println(c1);
    System.out.println();

    // Seed the features with valid subclasses.
    Feature[] f = {new InteriorFeature("AM/FM Radio")
        , new ExteriorFeature("Wood Panels")
        , new InteriorFeature("Air Conditioning")
        , new ExteriorFeature("Moonroof")};

    // Create an overloaded Car instance.
    Car c2 = new Car(new Date(), "Honda", "Prelude", "Coupe",
        new VehicleChassis("Unibody"),
        "null", "type",
        new ManufacturedEngine("Honda", new Date(), "H-series",
            "H23A1", "88 AKI", 4, "2WD: Two-Wheel Drive")
        , f, 2);
    System.out.println(c2);
  }
  }





//  Write a static main method that creates two objects,
// one with the default constructor and the other with the
//  constructor with parameters. Give sample data for the parameters
/*
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
        "H-Series", "H23A1", "88 AKI", 4, "2WD: Two-Wheel Drive");
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
            "H-Series", "H23A1", "8 AKI", 4, "2WD: Two-Wheel Drive" ));
    System.out.println(myV2);
    System.out.println(myV2);
*/






