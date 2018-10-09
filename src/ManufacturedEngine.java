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

    engineManufacturer = "Generic";
    engineManufacturedDate = new Date();
    engineMake = "Generic";
    engineModel = "Generic";
    engineCylinders = 0;
    engineType = "85 AKI";
    driveTrain = "2WD: Two-Wheel Drives";

  }

  // A public toString method that returns the following:
  @Override
  public String toString() {
    return
        " Engine Manufacturer = " + engineManufacturer + '\n' +
            " Engine Manufactured Date = " + engineManufacturedDate + '\n' +
            " Engine Make = " + engineMake + '\n' +
            " Engine Model = " + engineModel + '\n' +
            " Engine Cylinders = " + engineCylinders + '\n' +
            " Engine Type = " + engineType + '\n' +
            " DriveTrain = " + driveTrain + '\n';
  }

  public ManufacturedEngine(String manufacturer, Date manufacturedDate,
      String make, String model, int cylinders, String type,
      String train) {
    engineManufacturer = manufacturer;
    engineManufacturedDate = manufacturedDate;
    engineMake = make;
    engineModel = model;
    engineCylinders = cylinders;
    engineType = type;
    driveTrain = train;
  }
// A public method implementations for all of the public methods found in the Engine interface.



  public void setEngineCylinders(int engineCylinders) {
    this.engineCylinders = engineCylinders;

  }


  public void setEngineManufacturedDate(Date date) {
    this.engineManufacturedDate = date;

  }


  public void setEngineManufacturer(String manufacturer) {
    this.engineManufacturer = manufacturer;

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
