package low_level_design.solidprinciples;

//Definition: Interfaces should be such, that the client should not implement unnecessary functions they do not need
//In other words: Create such a granular level of interfaces that the client should not implement unnecessary functions they do not need
interface RestaurantEmployeeInterface {
    void washDishes();

    void serveCustomers();

    void cookFood();
}

//---Wrong Working Start
class Waiter implements RestaurantEmployeeInterface {

    @Override
    public void washDishes() {
        //Not my Job
    }

    @Override
    public void serveCustomers() {
        System.out.println("Yes Serving the customer");
    }

    @Override
    public void cookFood() {
        //Not my Job
    }
}
//---Wrong Working End


//---Correct Working Start
interface WaiterInterface {
    void serveCustomers();

    void takeOrder();
}

interface ChefInterface {
    void cookFood();

    void decideMenu();
}

class WaiterImpl implements WaiterInterface {

    @Override
    public void serveCustomers() {
        System.out.println("Yes Serving the customer");

    }

    @Override
    public void takeOrder() {
        System.out.println("Yes taking order");
    }
}
//---Correct Working Start

public class InterfaceSegmentedPrinciple {
}
