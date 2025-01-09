package low_level_design.designpatterns.behavioral_design_pattern.iterator_design_pattern;

import java.util.Iterator;
import java.util.List;

/**
 * BookIterator
 *
 * Maxxton Group 2025
 *
 * @author a.dudhal (a.dudhal@maxxton.com)
 */
public class BookIterator implements Iterator {
  private List<Book> bookList;
  private int index = 0;

  public BookIterator(List<Book> bookList) {
    this.bookList = bookList;
  }

  @Override
  public boolean hasNext() {
    return index < bookList.size();
  }

  @Override
  public Object next() {
    return bookList.get(index++);
  }
}
