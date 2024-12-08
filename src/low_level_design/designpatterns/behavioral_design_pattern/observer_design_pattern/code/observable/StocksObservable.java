package low_level_design.designpatterns.behavioral_design_pattern.observer_design_pattern.code.observable;

import low_level_design.designpatterns.behavioral_design_pattern.observer_design_pattern.code.observer.NotificationAlertObserver;

public interface StocksObservable {

    public void add(NotificationAlertObserver observer);

    public void remove(NotificationAlertObserver observer);

    public void notifySubscribers();

    public void setStockCount(int newStockAdded);

    public int getStockCount();
}
