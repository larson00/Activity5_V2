/**
 * @author Larson
 */
// Create a concrete class named InteriorFeature that implements the interface Feature with the
// following:
public class InteriorFeature implements Feature {

  // Create a String named interiorFeature as an instance variable.
  private final String interiorFeature;


  // A public default constructor without parameters that sets the interiorFeature instance
// variable to “Generic”.
  public InteriorFeature() {
    interiorFeature = "Generic";
  }

  // An overloaded constructor with the following value:
  public InteriorFeature(String interiorFeature) {
// A String with a parameter value of interiorFeature

    this.interiorFeature = interiorFeature;

  }

  // A public method named getFeature that doesn't have a formal parameter and that returns an
// instance of String.
  @Override
  public String getFeature() {
    return null;
  }

  // A public method setFeature that takes a String parameter interiorFeature and that returns a void.
// It should set the instance variable interiorFeature.
  @Override
  public void setFeature(String interiorFeature) {

  }

  // • A public toString method that returns the following: Interior [Generic]
  @Override
  public String toString() {
    return "Interior " + interiorFeature;

  }

}
