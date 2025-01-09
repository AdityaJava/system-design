package low_level_design.designpatterns.behavioral_design_pattern.iterator_design_pattern;

/**
 * Book
 *
 * Maxxton Group 2025
 *
 * @author a.dudhal (a.dudhal@maxxton.com)
 */
public class Book {
  String name;
  int price;

  public Book(String name, int price) {
    this.name = name;
    this.price = price;
  }

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public int getPrice() {
    return price;
  }

  public void setPrice(int price) {
    this.price = price;
  }

  @Override
  public String toString() {
    return "Book{" + "name='" + name + '\'' + ", price=" + price + '}';
  }
}
