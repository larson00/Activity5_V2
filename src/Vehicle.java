import java.util.Date;

// 9. Create a concrete class named Vehicle that implements the Engine and Chassis interfaces
public class Vehicle implements Chassis, Engine {

  // Create the following private instance variables:
  private Date vehicleManufacturedDate;
  private String vehicleManufacturer;
  private String vehicleMake;
  private String vehicleModel;
  private Chassis vehicleFrame;
  private String vehicleType;
  private String driveTrain;
  private Engine vehicleEngine;

  // A public default constructor with no formal parameters and
  // initialize all instance variables with generic literal values.
  public Vehicle() {
    this.vehicleManufacturedDate = new Date();
    this.vehicleManufacturer = "Generic";
    this.vehicleMake = "Generic";
    this.vehicleModel = "Generic";
    this.vehicleFrame = new VehicleChassis();
    this.vehicleType = "Generic";
    this.driveTrain = "Generic";
    this.vehicleEngine = new ManufacturedEngine();

  }

  // A public overloaded constructor with values for all of the variables defined above.
  public Vehicle(Date vehicleManufacturedDate, String vehicleManufacturer,
      String vehicleMake, String vehicleModel, Chassis vehicleFrame, String vehicleType,
      String driveTrain, Engine vehicleEngine) {
    this.vehicleManufacturedDate = vehicleManufacturedDate;
    this.vehicleManufacturer = vehicleManufacturer;
    this.vehicleMake = vehicleMake;
    this.vehicleModel = vehicleModel;
    this.vehicleFrame = vehicleFrame;
    this.vehicleType = vehicleType;
    this.driveTrain = driveTrain;
    this.vehicleEngine = vehicleEngine;
  }

  // Public method implementations for the Chassis interface
  @Override
  public Chassis getChassisType() {
    return vehicleFrame;
  }
  // Public method implementations for all of the public methods found in the Engine interface.

  @Override
  public void setChassisType(String vehicleChassis) {
    this.vehicleFrame.setChassisType(vehicleChassis);

  }

  @Override
  public void setEngineCylinders(int engineCylinders) {
    vehicleEngine.setEngineCylinders(engineCylinders);

  }

  @Override
  public void setEngineManufacturedDate(Date date) {
    vehicleEngine.setEngineManufacturedDate(date);


  }

  @Override
  public void setEngineManufacturer(String manufacturer) {
    vehicleEngine.setEngineManufacturer(manufacturer);


  }

  @Override
  public void setEngineMake(String engineMake) {
    vehicleEngine.setEngineMake(engineMake);


  }

  @Override
  public void setEngineModel(String engineModel) {
    vehicleEngine.setEngineModel(engineModel);


  }

  @Override
  public void setDriveTrain(String driveTrain) {
    vehicleEngine.setDriveTrain(driveTrain);


  }

  // Public method implementations that set all instance variables
  public void setVehicleManufacturer(String vehicleManufacturer) {
    this.vehicleManufacturer = vehicleManufacturer;
  }

  public void setVehicleMake(String vehicleMake) {
    this.vehicleMake = vehicleMake;
  }

  public void setVehicleModel(String vehicleModel) {
    this.vehicleModel = vehicleModel;
  }

  public void setVehicleFrame(Chassis vehicleFrame) {
    this.vehicleFrame = vehicleFrame;
  }

  public void setVehicleType(String vehicleType) {
    this.vehicleType = vehicleType;
  }

  public void setVehicleEngine(Engine vehicleEngine) {
    this.vehicleEngine = vehicleEngine;
  }

  @Override
  public void setEngineType(String fuel) {
    vehicleEngine.setEngineType(fuel);

  }

  // A public toString method that returns the following:
  @Override
  public String toString() {
    return
        "Manufacturer Name : " + vehicleManufacturer + "\n" +
            "Manufactured Date : " + vehicleManufacturedDate + "\n" +
            "Vehicle Make : " + vehicleMake + "\n" +
            "Vehicle Model : " + vehicleModel + "\n" +
            //"Vehicle Frame : " + vehicleFrame + "\n" +
            "Vehicle Type : " + vehicleType + "\n" +
            "Drive Train : " + driveTrain + "\n" +
            vehicleEngine;
  }
}
