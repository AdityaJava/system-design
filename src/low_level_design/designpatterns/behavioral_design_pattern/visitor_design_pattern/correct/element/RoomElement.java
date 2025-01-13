package low_level_design.designpatterns.behavioral_design_pattern.visitor_design_pattern.correct.element;

import low_level_design.designpatterns.behavioral_design_pattern.visitor_design_pattern.correct.visitor.RoomVisitor;

/**
 * RoomElement
 *
 * Maxxton Group 2025
 *
 * @author a.dudhal (a.dudhal@maxxton.com)
 */
public interface RoomElement {

  void accept(RoomVisitor visitor);
}
