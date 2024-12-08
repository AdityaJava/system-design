package low_level_design.designpatterns.behavioral_design_pattern.observer_design_pattern.code;

import low_level_design.designpatterns.behavioral_design_pattern.observer_design_pattern.code.observable.IphoneObservableImpl;
import low_level_design.designpatterns.behavioral_design_pattern.observer_design_pattern.code.observable.StocksObservable;
import low_level_design.designpatterns.behavioral_design_pattern.observer_design_pattern.code.observer.EmailAlertObserverImpl;
import low_level_design.designpatterns.behavioral_design_pattern.observer_design_pattern.code.observer.MobileAlertObserverImpl;
import low_level_design.designpatterns.behavioral_design_pattern.observer_design_pattern.code.observer.NotificationAlertObserver;

public class Store {
    public static void main(String[] args) {
        StocksObservable iphoneStocksObservable = new IphoneObservableImpl();

        NotificationAlertObserver observer1 = new EmailAlertObserverImpl("asd@gmail.com", iphoneStocksObservable);
        NotificationAlertObserver observer2 = new EmailAlertObserverImpl("asd@gmail.com", iphoneStocksObservable);
        NotificationAlertObserver observer3 = new MobileAlertObserverImpl(iphoneStocksObservable, "userName");

        iphoneStocksObservable.add(observer1);
        iphoneStocksObservable.add(observer2);
        iphoneStocksObservable.add(observer3);

        iphoneStocksObservable.setStockCount(10);

    }
}
