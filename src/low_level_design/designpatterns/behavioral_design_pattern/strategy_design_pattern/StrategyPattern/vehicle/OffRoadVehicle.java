package low_level_design.designpatterns.behavioral_design_pattern.strategy_design_pattern.StrategyPattern.vehicle;

import low_level_design.designpatterns.behavioral_design_pattern.strategy_design_pattern.StrategyPattern.strategies.DriveStrategy;
import low_level_design.designpatterns.behavioral_design_pattern.strategy_design_pattern.StrategyPattern.strategies.SportsDriveStrategy;

public class OffRoadVehicle extends VehicleImpl {

    public OffRoadVehicle() {
        super(new SportsDriveStrategy());
    }
}
