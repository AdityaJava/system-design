package low_level_design.designpatterns.behavioral_design_pattern.visitor_design_pattern.correct.visitor;

import low_level_design.designpatterns.behavioral_design_pattern.visitor_design_pattern.correct.element.DeluxeRoom;
import low_level_design.designpatterns.behavioral_design_pattern.visitor_design_pattern.correct.element.DoubleRoom;
import low_level_design.designpatterns.behavioral_design_pattern.visitor_design_pattern.correct.element.SingleRoom;

/**
 * RoomPricingVisitor
 */
public class RoomPricingVisitor implements RoomVisitor {

  @Override
  public void visit(SingleRoom singleRoom) {
    System.out.println("RoomPricingVisitor visiting singleRoom");
    singleRoom.roomPrice = 900;
  }

  @Override
  public void visit(DoubleRoom doubleRoom) {
    System.out.println("RoomPricingVisitor visiting DoubleRoom");
    doubleRoom.roomPrice = 900;
  }

  @Override
  public void visit(DeluxeRoom deluxeRoom) {
    System.out.println("RoomPricingVisitor visiting DeluxeRoom");
    deluxeRoom.roomPrice = 900;
  }
}
