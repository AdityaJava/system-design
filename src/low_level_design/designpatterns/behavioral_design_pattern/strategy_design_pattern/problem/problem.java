package low_level_design.designpatterns.behavioral_design_pattern.strategy_design_pattern.problem;


interface VehicleInterface {
    void drive();
}


class SportyVehicle implements VehicleInterface {

    @Override
    public void drive() {
        //Special code which is same for OffRoadVehicle
    }
}

class OffRoadVehicle implements VehicleInterface {

    @Override
    public void drive() {
        //Special code which is same for SportyVehicle
    }
}

class PassengerVehicle implements VehicleInterface {

    @Override
    public void drive() {
        //Normal Code for normal Drive
    }
}

/*
Now here the problem is that the code for OffRoadVehicle and SportyVehicle is same so for this we can design a strategy for offRoadVehicle and SportsVehicle
 */

public class problem {
}
