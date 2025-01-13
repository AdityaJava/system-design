package low_level_design.designpatterns.behavioral_design_pattern.visitor_design_pattern.correct.visitor;

import low_level_design.designpatterns.behavioral_design_pattern.visitor_design_pattern.correct.element.DeluxeRoom;
import low_level_design.designpatterns.behavioral_design_pattern.visitor_design_pattern.correct.element.DoubleRoom;
import low_level_design.designpatterns.behavioral_design_pattern.visitor_design_pattern.correct.element.SingleRoom;

/**
 * RoomVisitor
 */
public interface RoomVisitor {

  void visit(SingleRoom singleRoom);

  void visit(DoubleRoom doubleRoom);

  void visit(DeluxeRoom deluxeRoom);
}
