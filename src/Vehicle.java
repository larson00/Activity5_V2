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
    vehicleManufacturedDate = new Date();
    vehicleManufacturer = "Generic";
    vehicleMake = "Generic";
    vehicleModel = "Generic";
    vehicleFrame = new VehicleChassis();
    vehicleType = "Generic";
    driveTrain = "Generic";
    vehicleEngine = new ManufacturedEngine();

  }

  // A public overloaded constructor with values for all of the variables defined above.
  public Vehicle(Date vehicleManufacturedDate, String vehicleManufacturer, String vehicleMake,
      String vehicleModel, String vehicleType, String driveTrain, Engine vehicleEngine,
      Chassis vehicleFrame) {
    this.vehicleManufacturedDate = vehicleManufacturedDate;
    this.vehicleManufacturer = vehicleManufacturer;
    this.vehicleMake = vehicleMake;
    this.vehicleModel = vehicleModel;
    this.vehicleFrame = vehicleFrame;
    this.vehicleType = vehicleType;
    this.driveTrain = driveTrain;
    this.vehicleEngine = vehicleEngine;
  }


  @Override
  public Chassis getChassisType() {
    return this;
  }

  @Override
  public void setChassisType(String vehicleChassis) {

  }

  @Override
  public void setEngineCylinders(int engineCylinders) {

  }

  @Override
  public void setEngineManufacturedDate(Date date) {

  }

  @Override
  public void setEngineManufacturer(String manufacturer) {

  }

  @Override
  public void setEngineMake(String engineMake) {

  }

  @Override
  public void setEngineModel(String engineModel) {

  }

  @Override
  public void setDriveTrain(String driveTrain) {

  }

  @Override
  public void setEngineType(String fuel) {

  }
}
