package low_level_design.designpatterns.behavioral_design_pattern.strategy_design_pattern.StrategyPattern.strategies;

public class NormalDriveStrategy implements DriveStrategy {
    @Override
    public void drive() {
        System.out.println("Normal Driving");
    }
}
