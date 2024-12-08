package low_level_design.designpatterns.behavioral_design_pattern.observer_design_pattern.code.observer;

import low_level_design.designpatterns.behavioral_design_pattern.observer_design_pattern.code.observable.StocksObservable;

public class EmailAlertObserverImpl implements NotificationAlertObserver {
    String emailId;

    StocksObservable stocksObservable;

    public EmailAlertObserverImpl(String emailId, StocksObservable stocksObservable) {
        this.emailId = emailId;
        this.stocksObservable = stocksObservable;
    }

    @Override
    public void update() {
        sendEmail("Product is in stock hurry!!");
    }

    public void sendEmail(String message) {
        System.out.println("MailTo" + this.emailId + message);
    }
}
