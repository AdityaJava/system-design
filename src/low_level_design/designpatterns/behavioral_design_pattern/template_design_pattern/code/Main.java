package low_level_design.designpatterns.behavioral_design_pattern.template_design_pattern.code;

/**
 * Main
 */
public class Main {
  public static void main(String[] args) {
    FriendPaymentFlow friendPaymentFlow = new FriendPaymentFlow();
    friendPaymentFlow.sendMoney();

    System.out.println("-----------------------");
    MerchantPayment merchantPayment = new MerchantPayment();
    merchantPayment.sendMoney();

  }
}
