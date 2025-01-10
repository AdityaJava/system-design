package low_level_design.designpatterns.behavioral_design_pattern.mediator_design_pattern;

/**
 * Main
 *
 * Maxxton Group 2025
 *
 * @author a.dudhal (a.dudhal@maxxton.com)
 */
public class Main {
  public static void main(String[] args) {
    AuctionMediator auctionMediator = new Auction();

    Colleague bidder1 = new Bidder("A", auctionMediator);
    Colleague bidder2 = new Bidder("B", auctionMediator);

    bidder1.placeBid(10);

    bidder2.placeBid(90);
  }
}
