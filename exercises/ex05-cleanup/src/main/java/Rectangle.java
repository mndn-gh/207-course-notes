public class Rectangle {
  private double width;
  private double height;

  /** Initializes a new Rectangle instance */
  public Rectangle(double w, double h) {
    this.width = w;
    this.height = h;
  }

  /** Returns the area of the rectangle */
  public double area() {
    return width * height;
  }

  /**
   * scales the rectangle
   * @param factor
   */
  public void scale(double factor) {
    width = width * factor;
    height = height * factor;
  }

  /** Returns true if this rectangle's area is larger than other's, and false otherwise */
  public boolean isLargerThan(Rectangle other) {
    return area() > other.area();
  }
}
