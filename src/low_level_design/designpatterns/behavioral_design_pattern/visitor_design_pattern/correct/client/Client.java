package low_level_design.designpatterns.behavioral_design_pattern.visitor_design_pattern.correct.client;

import low_level_design.designpatterns.behavioral_design_pattern.visitor_design_pattern.correct.element.DeluxeRoom;
import low_level_design.designpatterns.behavioral_design_pattern.visitor_design_pattern.correct.element.DoubleRoom;
import low_level_design.designpatterns.behavioral_design_pattern.visitor_design_pattern.correct.element.RoomElement;
import low_level_design.designpatterns.behavioral_design_pattern.visitor_design_pattern.correct.element.SingleRoom;
import low_level_design.designpatterns.behavioral_design_pattern.visitor_design_pattern.correct.visitor.RoomMaintenanceVisitor;
import low_level_design.designpatterns.behavioral_design_pattern.visitor_design_pattern.correct.visitor.RoomPricingVisitor;
import low_level_design.designpatterns.behavioral_design_pattern.visitor_design_pattern.correct.visitor.RoomVisitor;

/**
 * Client
 */
public class Client {
  public static void main(String[] args) {
    RoomElement singleRoomElement = new SingleRoom();
    RoomElement doubleRoomElement = new DoubleRoom();
    RoomElement deluxeRoomElement = new DeluxeRoom();

    RoomVisitor roomPricingVisitor = new RoomPricingVisitor();

    //Performing pricing operation on elements
    singleRoomElement.accept(roomPricingVisitor);
    doubleRoomElement.accept(roomPricingVisitor);
    deluxeRoomElement.accept(roomPricingVisitor);

    RoomVisitor roomMaintenanceVisitor = new RoomMaintenanceVisitor();

    System.out.println("-------Another Operation---------");

    //Performing maintenance on rooms
    singleRoomElement.accept(roomMaintenanceVisitor);
    doubleRoomElement.accept(roomMaintenanceVisitor);
    deluxeRoomElement.accept(roomMaintenanceVisitor);

  }
}
