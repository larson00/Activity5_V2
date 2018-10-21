import java.util.Date;

public class ManufacturedEngine implements Engine {

  //  Create the following private instance variables:
  private String engineManufacturer;
  private Date engineManufacturedDate;
  private String engineMake;
  private String engineModel;
  private int engineCylinders;
  private String engineType;
  private String driveTrain;

  //A public default constructor with no formal parameters and initialize all instance variables with generic
  //literal values.
  public ManufacturedEngine() {

    this.engineManufacturer = "Generic";
    this.engineManufacturedDate = new Date();
    this.engineMake = "Generic";
    this.engineModel = "Generic";
    this.engineCylinders = 0;
    this.engineType = "Generic";
    this.driveTrain = "Generic";

  }


  public ManufacturedEngine(String engineManufacturer, Date manufacturedDate,
      String make, String model, String type, int cylinders,
      String train) {
    this.engineManufacturer = engineManufacturer;
    this.engineManufacturedDate = manufacturedDate;
    this.engineMake = make;
    this.engineModel = model;
    this.engineCylinders = cylinders;
    this.engineType = type;
    this.driveTrain = train;
  }

  /*
  public static void main(String[] args) {
    ManufacturedEngine manu = new ManufacturedEngine();
    System.out.println(manu.toString());
    ManufacturedEngine manu2 = new ManufacturedEngine(
        "Honda",
        new Date(),
        "H-Series",
        "H23A1",
        "88 AKI",
        4,
        "2WD: Two-Wheel Drive"
    );
    System.out.println(manu2.toString());

  }
  */
  // A public toString method that returns the following:
  @Override
  public String toString() {
    return
        "Engine Manufacturer : " + engineManufacturer + "\n" +
            "Engine Manufactured : " + engineManufacturedDate + "\n" +
            "Engine Make : " + engineMake + "\n" +
            "Engine Model : " + engineModel + "\n" +
            "Engine Type : " + engineType + "\n" +
            "Engine Cylinders : " + engineCylinders + "\n" +
            "Drive Train : " + driveTrain + "\n";
  }
// A public method implementations for all of the public methods found in the Engine interface.


  public void setEngineCylinders(int engineCylinders) {
    this.engineCylinders = engineCylinders;

  }


  public void setEngineManufacturedDate(Date date) {
    this.engineManufacturedDate = date;

  }


  public void setEngineManufacturer(String engineManufacturer) {
    this.engineManufacturer = engineManufacturer;

  }


  public void setEngineMake(String engineMake) {
    this.engineMake = engineMake;

  }


  public void setEngineModel(String engineModel) {
    this.engineModel = engineModel;

  }


  public void setDriveTrain(String driveTrain) {
    this.driveTrain = driveTrain;

  }


  public void setEngineType(String fuel) {
    this.engineType = fuel;

  }

}
