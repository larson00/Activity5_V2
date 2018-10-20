/**
 * @author Larson
 */
// 8. Create a concrete class named ExteriorFeature that implements the interface Feature
// with the following:
public class ExteriorFeature implements Feature {

  // Create a String named exteriorFeature as an instance variable.
  String exteriorFeature;

  // A public default constructor without parameters that sets the exteriorFeature instance variable
  public ExteriorFeature() {
    this.exteriorFeature = "Generic";
  }

  // An overloaded constructor with the following value:
  public ExteriorFeature(String exteriorFeature) {
// A String with a parameter value of exteriorFeature
    this.exteriorFeature = exteriorFeature;

  }
// Set the exteriorFeature instance variable in both, use features as String values.


  // A public method named getFeature that doesn't have a formal parameter and that return
// an instance of String.
  @Override
  public String getFeature() {
    return exteriorFeature;
  }

  // A public method setFeature that takes a String parameter exteriorFeature and that
// returns a void. It should set the instance variable exteriorFeature.
  @Override
  public void setFeature(String exteriorFeature) {
    this.exteriorFeature = exteriorFeature;

  }

  // A public toString method that returns the following:
// Exterior [Generic]
  @Override
  public String toString() {
    return "Exterior [" + exteriorFeature + "]";
  }
}
