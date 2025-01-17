package low_level_design.designpatterns.behavioral_design_pattern.template_design_pattern.code;

/**
 * FrientPaymentFlow
 */
public class FriendPaymentFlow extends PaymentFlow {

  @Override
  public void validateRequest() {
    System.out.println("validateRequest for friend");
  }

  @Override
  public void calculateFees() {
    System.out.println("calculateFees as 0 percent");
  }

  @Override
  public void debitAmount() {
    System.out.println("debitAmount");
  }

  @Override
  public void creditAmount() {
    System.out.println("creditAmount full amount");
  }
}
