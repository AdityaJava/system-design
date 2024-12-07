package low_level_design.designpatterns.behavioral_design_pattern.strategy_design_pattern.StrategyPattern.vehicle;

import low_level_design.designpatterns.behavioral_design_pattern.strategy_design_pattern.StrategyPattern.strategies.DriveStrategy;

public class VehicleImpl implements VehicleInterface {
    private final DriveStrategy driveStrategy;

    public VehicleImpl(DriveStrategy driveStrategy) {
        this.driveStrategy = driveStrategy;
    }

    @Override
    public void drive() {
        driveStrategy.drive();
    }
}
