public class Cuboid<T extends Number> {
  //T acts as data type - can use anything
  private T length;
  private T breadth;
  private T height;

  //add a method public toString that will return all of the dimensions
  //Code/Generate/toString
  @Override
  public String toString() {
    return "Cuboid{" +
        "length=" + length +
        ", breadth=" + breadth +
        ", height=" + height +
        '}';
  }
  //The type of the dimensions are decided at construction of the cuboid instance
  //Cuboid<Double> c1 = new Cuboid<>();

}
