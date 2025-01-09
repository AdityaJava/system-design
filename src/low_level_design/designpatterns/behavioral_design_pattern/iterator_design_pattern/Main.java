package low_level_design.designpatterns.behavioral_design_pattern.iterator_design_pattern;

import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

/**
 * Main
 *
 * Maxxton Group 2025
 *
 * @author a.dudhal (a.dudhal@maxxton.com)
 */
public class Main {

  public static void main(String[] args) {
    List<Book> bookList = Arrays.asList(new Book("Shri Krishna", 1000), new Book("Shri Ram", 1000), new Book("Shri Narayan", 1000), new Book("Shri Vitthal", 1000));
    Library library = new Library(bookList);
    Iterator iterator = library.createIterator();
    while (iterator.hasNext()) {
      System.out.println(iterator.next().toString());
    }

  }
}
