package low_level_design.designpatterns.behavioral_design_pattern.mediator_design_pattern;

/**
 * Bidder
 */
public class Bidder implements Colleague {
  String name;
  AuctionMediator auctionMediator;

  public Bidder(String name, AuctionMediator auctionMediator) {
    this.name = name;
    this.auctionMediator = auctionMediator;
    auctionMediator.addBidder(this);
  }

  @Override
  public void placeBid(int bidAmount) {
    auctionMediator.placeBid(this, bidAmount);
  }

  @Override
  public void receiveBidNotification(int amount) {
    System.out.println(this.getName() + " has put got notification that someone has put a bid");
  }

  @Override
  public String getName() {
    return this.name;
  }
}
