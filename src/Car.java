/**
 * @author Larson
 */
import java.util.Date;

public class Car extends Vehicle {

  private Feature[] feature = new Feature[10];
  private int carAxle;

  public Car() {
    super();
    Feature[] f = {new InteriorFeature("No Interior Features"),
        new ExteriorFeature("No Exterior Features")};
    this.feature = f;
    this.carAxle = 2;
  }


  public Car(Date vehicleManufacturedDate, String vehicleManufacturer,
      String vehicleMake, String vehicleModel, Chassis vehicleFrame, String vehicleType,
      String driveTrain, Engine vehicleEngine, Feature[] feature, int carAxle) {
    super(vehicleManufacturedDate, vehicleManufacturer, vehicleMake, vehicleModel,
        vehicleFrame, vehicleType, driveTrain, vehicleEngine);
    this.feature = feature;
    this.carAxle = carAxle;

  }

  public String getExteriorFeatures() {
    String extFeatures = "";
    for (Feature f: feature) {
      if (f instanceof ExteriorFeature)
        extFeatures += f.toString() + "\n";
    }
    return extFeatures;

  }

  public String getInteriorFeatures() {
    String intFeatures = "";
    for (Feature f: feature) {
      if (f instanceof InteriorFeature)
        intFeatures += f.toString() + "\n";
    }
    return "Features : \n" + intFeatures;
  }

  public int getCarAxle() {
    return carAxle;
  }


  @Override
  public String toString() {

    return super.toString() +
        getInteriorFeatures() + getExteriorFeatures() +
        "Car Axle : " + carAxle;
  }

}