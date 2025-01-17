package low_level_design.designpatterns.behavioral_design_pattern.template_design_pattern.code;

/**
 * MerchantPayment
 */
public class MerchantPayment extends PaymentFlow {

  @Override
  public void validateRequest() {
    System.out.println("validateRequest for Merchant");
  }

  @Override
  public void calculateFees() {
    System.out.println("calculateFees as 2 percent for Merchant");
  }

  @Override
  public void debitAmount() {
    System.out.println("debitAmount");
  }

  @Override
  public void creditAmount() {
    System.out.println("credit remaining amount after taking 2 percent fees");
  }
}
