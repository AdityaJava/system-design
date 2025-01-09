package low_level_design.designpatterns.behavioral_design_pattern.iterator_design_pattern;

import java.util.Iterator;
import java.util.List;

/**
 * Library
 *
 * Maxxton Group 2025
 *
 * @author a.dudhal (a.dudhal@maxxton.com)
 */
public class Library implements Aggregate {
  private List<Book> bookList;

  public Library(List<Book> bookList) {
    this.bookList = bookList;
  }

  public List<Book> getBookList() {
    return bookList;
  }

  public void setBookList(List<Book> bookList) {
    this.bookList = bookList;
  }

  @Override
  public Iterator createIterator() {
    return new BookIterator(this.bookList);
  }
}
