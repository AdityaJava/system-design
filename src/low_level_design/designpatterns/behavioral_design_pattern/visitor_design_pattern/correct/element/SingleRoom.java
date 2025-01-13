package low_level_design.designpatterns.behavioral_design_pattern.visitor_design_pattern.correct.element;

import low_level_design.designpatterns.behavioral_design_pattern.visitor_design_pattern.correct.visitor.RoomVisitor;

/**
 * SingleRoom
 */
public class SingleRoom implements RoomElement {
  public int roomPrice = 0;

  @Override
  public void accept(RoomVisitor visitor) {
    visitor.visit(this);
  }
}
