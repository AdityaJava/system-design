package low_level_design.designpatterns.behavioral_design_pattern.observer_design_pattern.code.observer;

import low_level_design.designpatterns.behavioral_design_pattern.observer_design_pattern.code.observable.StocksObservable;

public class MobileAlertObserverImpl implements NotificationAlertObserver {
    StocksObservable stocksObservable;

    String userName;

    public MobileAlertObserverImpl(StocksObservable stocksObservable, String userName) {
        this.stocksObservable = stocksObservable;
        this.userName = userName;
    }

    @Override
    public void update() {
        sendMessageOnMobile("Product is in stock hurry!!");
    }

    public void sendMessageOnMobile(String message) {
        System.out.println("Sending Notification on mobile " + message);
    }
}
