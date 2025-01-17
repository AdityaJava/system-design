package low_level_design.designpatterns.behavioral_design_pattern.template_design_pattern.code;

/**
 * PaymentFlow
 */
public abstract class PaymentFlow {
  public abstract void validateRequest();

  public abstract void calculateFees();

  public abstract void debitAmount();

  public abstract void creditAmount();

  //This is template method: which defines the order of the steps to execute the task
  public final void sendMoney() {
    //Step1
    validateRequest();

    //Step2
    debitAmount();

    //Step3
    calculateFees();

    //Step4
    creditAmount();
  }

}
