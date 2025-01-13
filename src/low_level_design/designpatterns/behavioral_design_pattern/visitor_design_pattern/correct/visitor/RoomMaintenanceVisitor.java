package low_level_design.designpatterns.behavioral_design_pattern.visitor_design_pattern.correct.visitor;

import low_level_design.designpatterns.behavioral_design_pattern.visitor_design_pattern.correct.element.DeluxeRoom;
import low_level_design.designpatterns.behavioral_design_pattern.visitor_design_pattern.correct.element.DoubleRoom;
import low_level_design.designpatterns.behavioral_design_pattern.visitor_design_pattern.correct.element.SingleRoom;

/**
 * RoomMaintenanceVisitor
 */
public class RoomMaintenanceVisitor implements RoomVisitor {

  @Override
  public void visit(SingleRoom singleRoom) {
    System.out.println("RoomMaintenanceVisitor visiting singleRoom");
  }

  @Override
  public void visit(DoubleRoom doubleRoom) {
    System.out.println("RoomMaintenanceVisitor visiting DoubleRoom");
  }

  @Override
  public void visit(DeluxeRoom deluxeRoom) {
    System.out.println("RoomMaintenanceVisitor visiting DeluxeRoom");
  }
}
