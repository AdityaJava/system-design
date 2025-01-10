package low_level_design.designpatterns.behavioral_design_pattern.mediator_design_pattern;

/**
 * AuctionMediator
 */
public interface AuctionMediator {
  void addBidder(Colleague bidder);

  void placeBid(Colleague bidder, int amount);

}
