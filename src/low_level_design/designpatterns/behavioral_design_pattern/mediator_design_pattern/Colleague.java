package low_level_design.designpatterns.behavioral_design_pattern.mediator_design_pattern;

/**
 * Colleague
 */
public interface Colleague {

  void placeBid(int bidAmount);

  void receiveBidNotification( int amount);

  String getName();

}
