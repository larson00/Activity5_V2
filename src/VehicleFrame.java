//4. Create a concrete class named VehicleFrame that implements the interface Chassis with the following:
public class VehicleFrame implements Chassis {

  //• Create a String named vehicleFrameType instance variable.
  private final String vehicleFrameType;

  // A public default constructor
  // Set the vehicleFrameType instance variable in both, use “Unibody” as the default String value
  public VehicleFrame() {
    vehicleFrameType = "Unibody";

  }
  // overloaded constructor with the following value:
  // A String with a parameter value of vehicleFrameType

  public VehicleFrame(String vehicleFrameType) {
    this.vehicleFrameType = vehicleFrameType;
  }

  //A public method named getChassisType that doesn't have a formal parameter and that returns an instance
  //of the interface Chassis (hint that would be a copy of this class).
  @Override
  public Chassis getChassisType() {
    return this;
  }

  //A public method setChassisType that takes a String parameter vehicleChassis and that returns a void. It
  //should set the instance variable chassisName
  @Override
  public void setChassisType(String vehicleChassis) {

  }

  //A public toString method that returns the following:
  //Chassis Name : Chassis
  @Override
  public String toString() {
    return "Chassis : " + VehicleFrame.chassis + "\n" +
        "Vehicle Frame : " + vehicleFrameType;

  }
}
