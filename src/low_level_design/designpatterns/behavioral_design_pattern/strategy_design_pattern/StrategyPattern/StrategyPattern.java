package low_level_design.designpatterns.behavioral_design_pattern.strategy_design_pattern.StrategyPattern;


//Use strategy pattern when some child classes share same implementations as here SportyVehicle and OffRoadVehicle share same driving code

import low_level_design.designpatterns.behavioral_design_pattern.strategy_design_pattern.StrategyPattern.vehicle.OffRoadVehicle;
import low_level_design.designpatterns.behavioral_design_pattern.strategy_design_pattern.StrategyPattern.vehicle.PassengerVehicle;
import low_level_design.designpatterns.behavioral_design_pattern.strategy_design_pattern.StrategyPattern.vehicle.SportyVehicle;
import low_level_design.designpatterns.behavioral_design_pattern.strategy_design_pattern.StrategyPattern.vehicle.VehicleImpl;

import java.util.Arrays;
import java.util.List;

public class StrategyPattern {
    public static void main(String[] args) {
        List<VehicleImpl> vehicleList = Arrays.asList(new PassengerVehicle(), new OffRoadVehicle(), new SportyVehicle());
        for (VehicleImpl vehicle : vehicleList) {
            vehicle.drive();
        }
    }
}
