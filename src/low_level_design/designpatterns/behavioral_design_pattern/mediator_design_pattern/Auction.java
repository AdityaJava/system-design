package low_level_design.designpatterns.behavioral_design_pattern.mediator_design_pattern;

import java.util.ArrayList;
import java.util.List;

/**
 * Auction
 */
public class Auction implements AuctionMediator {
  List<Colleague> colleagueList = new ArrayList<>();

  @Override
  public void addBidder(Colleague bidder) {
    colleagueList.add(bidder);
  }

  @Override
  public void placeBid(Colleague bidder, int amount) {
    for (Colleague colleague : colleagueList) {
      if (colleague != bidder) {
        colleague.receiveBidNotification(amount);
      }
    }
  }
}
