package low_level_design.designpatterns.behavioral_design_pattern.iterator_design_pattern;

import java.util.Iterator;

/**
 * Aggregate
 */
public interface Aggregate {
  Iterator createIterator();
}
