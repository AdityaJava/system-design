package low_level_design.designpatterns.behavioral_design_pattern.observer_design_pattern.code.observable;

import low_level_design.designpatterns.behavioral_design_pattern.observer_design_pattern.code.observer.NotificationAlertObserver;

import java.util.ArrayList;
import java.util.List;

public class IphoneObservableImpl implements StocksObservable {

    //This is now list but in actual scenario we will be adding it to DB
    //I mean this will not be autowired. This is used as temporary data storage
    private List<NotificationAlertObserver> notificationAlertObserverList;

    private int stockCount = 0;

    @Override
    public void add(NotificationAlertObserver observer) {
        if (notificationAlertObserverList == null) notificationAlertObserverList = new ArrayList<>();
        notificationAlertObserverList.add(observer);
    }

    @Override
    public void remove(NotificationAlertObserver observer) {
        notificationAlertObserverList.remove(observer);
    }

    @Override
    public void notifySubscribers() {
        for (NotificationAlertObserver observer : notificationAlertObserverList) {
            observer.update();
        }
    }

    @Override
    public void setStockCount(int newStockAdded) {
        //If old stock count is zero only then update
        if (this.stockCount == 0) {
            notifySubscribers();
        }
        stockCount = stockCount + newStockAdded;
    }

    @Override
    public int getStockCount() {
        return stockCount;
    }
}
